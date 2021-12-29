# ZIP
ZIP is an archive file format that supports lossless data compression. A ZIP file may contain one or more files or directories that may have been compressed. Java Archive (JAR) is built on the ZIP format.

# ZIP File Streams
ZIP files are archives that store one or more files in (usually) compressed format.

The Classes for handling ZIP files are in java.util.zip and not in java.io, so remember to add the necessary import statement. Although not part of java.io, the GZIP and ZIP classes subclass java.io.FilterInputStream and java.io.FilterOutputStream. The java.util.zip packages also contain classes for computing cyclic redundancy check (CRC) checksums. (CRC is a method to generate a hashlike code that the receiver of a file can use to check the integrity of the data.)Each ZIP file has a header with information such as the name of the file and the compression method that was used. In Java, you use a ZipInputStream to read a ZIP file by layering the ZipInputStream constructor onto a FileInputStream. You then need to look at the individual entries in the archive. The getNextEntry method returns an object of type ZipEntry that describes the entry. The read method of the ZipInputStream is modified to return -1 at the end of the current entry (instead of just at the end of the ZIP file). You must then call closeEntry to read the next entry. Here is a typical code sequence to read through a ZIP file:

ZipInputStream zin = new ZipInputStream
(new FileInputStream(zipname));
ZipEntry entry;
while ((entry = zin.getNextEntry()) != null)
{
 analyze entry;
 read the contents of zin;
 zin.closeEntry();
}
zin.close();
To read the contents of a ZIP entry, you will probably not want to use the raw read method; usually, you will use the methods of a more competent stream filter. For example, to read a text file inside a ZIP file, you can use the following loop:

BufferedReader in = new BufferedReader
 (new InputStreamReader(zin));
String s;
while ((s = in.readLine()) != null)
 do something with s;
