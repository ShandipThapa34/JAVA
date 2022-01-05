# What is File Handling in Java?
File handling in Java implies reading from and writing data to a file. The File class from the java.io package, allows us to work with different formats of files. In order to use the File class, you need to create an object of the class and specify the filename or directory name.

For example:
```java
// Import the File class
import java.io.File
 
// Specify the filename
File obj = new File("filename.txt");
Java uses the concept of a stream to make I/O operations on a file. So let’s now understand what is a Stream in Java.
```

## What is a Stream?
In Java, Stream is a sequence of data which can be of two types.
1. Byte Stream
This mainly incorporates with byte data. When an input is provided and executed with byte data, then it is called the file handling process with a byte stream.

2. Character Stream
Character Stream is a stream which incorporates with characters. Processing of input data with character is called the file handling process with a character stream.

Now that you know what is a stream, let’s dive deeper into this article on File Handling in Java and know the various methods that are useful for operations on the files like creating, reading and writing.

## Java File Methods
Below table depicts the various methods that are used for performing operations on Java files.
Method
1. canRead()	(Boolean)	(It tests whether the file is readable or not)
2. canWrite()	(Boolean)	(It tests whether the file is writable or not)
3. createNewFile()	(Boolean)	(This method creates an empty file)
4. delete()	(Boolean)	(Deletes a file)
5. exists()	(Boolean)	(It tests whether the file exists)
6. getName()	(String)	(Returns the name of the file)
7. getAbsolutePath()	(String)	(Returns the absolute pathname of the file)
8. length()	(Long)	(Returns the size of the file in bytes)
9. list()	String[]	(Returns an array of the files in the directory)
10. mkdir()	(Boolean)	(Creates a directory)

Let’s now understand what are the various file operations in Java and how to perform them.

## File Operations in Java
Basically, you can perform four operations on a file. They are as follows:
1. Create a File
2. Get File Information
3. Write To a File
4. Read from a File

