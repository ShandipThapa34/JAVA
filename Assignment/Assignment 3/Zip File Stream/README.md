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

## Java read ZIP example
The following example reads the contents of a ZIP file.

JavaReadZip.java
package com.zetcode;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class JavaReadZip {

    private final static Long MILLS_IN_DAY = 86400000L;

    public static void main(String[] args) throws IOException {

        String fileName = "src/resources/myfile.zip";

        try (FileInputStream fis = new FileInputStream(fileName);
                BufferedInputStream bis = new BufferedInputStream(fis);
                ZipInputStream zis = new ZipInputStream(bis)) {
            
            ZipEntry ze;

            while ((ze = zis.getNextEntry()) != null) {

                System.out.format("File: %s Size: %d Last Modified %s %n",
                        ze.getName(), ze.getSize(),
                        LocalDate.ofEpochDay(ze.getTime() / MILLS_IN_DAY));
            }
        }
    }
}
The example reads the given ZIP file with ZipInputStream and prints its contents to the terminal. We print the file names, their size, and the last modification time.

String fileName = "src/resources/myfile.zip";
The ZIP file is located int src/resources/ directory.

try (FileInputStream fis = new FileInputStream(fileName);
We create a FileInputStream from the file. FileInputStream is used for reading streams of raw bytes.

BufferedInputStream bis = new BufferedInputStream(fis);
For better performance, we pass the FileInputStream into the BufferedInputStream.

ZipInputStream zis = new ZipInputStream(bis)) {
A ZipInputStream is created from the buffered FileInputStream. The try-with-resources closes the streams when they are not needed anymore.

while ((ze = zis.getNextEntry()) != null) {
In a while loop, we go through the entries of the ZIP file with getNextEntry method. It returns null if there are no more entries.

System.out.format("File: %s Size: %d Last Modified %s %n", 
        ze.getName(), ze.getSize(), 
        LocalDate.ofEpochDay(ze.getTime() / MILLS_IN_DAY));
The getName returns the name of the entry, the getSize returns the uncompressed size of the entry, and the getTime returns the last modification time of the entry.

File: maven.pdf Size: 6430817 Last Modified 2017-02-23 
File: mavenbyexample.pdf Size: 1363061 Last Modified 2017-02-15 
File: modal_verbs.jpg Size: 31353 Last Modified 2017-03-04 
File: sid.jpg Size: 57708 Last Modified 2017-06-05 
File: spring-boot-reference.pdf Size: 1946586 Last Modified 2017-06-05 

 
## Java decompress ZIP example
In the next example, we decompress a ZIP file in Java.

JavaUnzip.java
package com.zetcode;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class JavaUnzip {

    public static void main(String args[]) throws Exception {

        byte[] buffer = new byte[2048];

        Path outDir = Paths.get("src/resources/output/");
        String zipFileName = "src/resources/myfile.zip";

        try (FileInputStream fis = new FileInputStream(zipFileName);
                BufferedInputStream bis = new BufferedInputStream(fis);
                ZipInputStream stream = new ZipInputStream(bis)) {

            ZipEntry entry;
            while ((entry = stream.getNextEntry()) != null) {

                Path filePath = outDir.resolve(entry.getName());

                try (FileOutputStream fos = new FileOutputStream(filePath.toFile());
                        BufferedOutputStream bos = new BufferedOutputStream(fos, buffer.length)) {

                    int len;
                    while ((len = stream.read(buffer)) > 0) {
                        bos.write(buffer, 0, len);
                    }
                }
            }
        }
    }
}
The example uses ZipInputStream to read the contents of the given ZIP file and FileOutputStream and BufferedOutputStream to write the contents into a directory.

Path outDir = Paths.get("src/resources/output/");
This is the directory where we extract the contents of the ZIP file.

while ((entry = stream.getNextEntry()) != null) {
In the first while loop, we go through the entries of the ZIP file.

while ((len  = stream.read(buffer)) > 0) {
    bos.write(buffer, 0, len);
}
In the second while loop, we read the entries and write them to the output stream.

In this tutorial, we have presented the Java ZipInputStream class. We have created two examples to read a ZIP file and to decompress a ZIP file.
