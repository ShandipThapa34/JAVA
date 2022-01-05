# User-Defined Packages in Java
Packages in Java are a mechanism to encapsulate a group of classes, interfaces, and sub-packages. In Java, it is used for making search/locating and usage of classes, interface, enumerations, and annotations easier. It can be considered as data encapsulation also. In other words, we can say a package is a container of a group of related classes where some of the classes are accessible are exposed, and others are kept for internal purposes.

# Types of Packages
Packages are categorized into two parts. These are:
1. Built-in packages: The already defined package like java.io.*, java. lang.* etc., are known as built-in packages.
2. User-defined packages: As the name propose, user-defined packages in Java are essentially packages that are defined by the programmer. Whenever we want to add a class to the package, we have to mention the package name and the “package” keyword at the top of the program.

## User-defined Packages
User-defined packages are those packages that are designed or created by the developer to categorize classes and packages. They are much similar to the built-in that java offers. It can be imported into other classes and used the same as we use built-in packages. But If we omit the package statement, the class names are put into the default package, which has no name.

To create your own package, you need to understand that Java uses a file system directory to store them. Just like folders on your computer:

Example
└── root
  └── mypack
    └── MyPackageClass.java
To create a package, use the package keyword:
```java
MyPackageClass.java
package mypack;
class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}
```
Save the file as MyPackageClass.java, and compile it:
```
C:\Users\Your Name>javac MyPackageClass.java
```
Then compile the package:
```
C:\Users\Your Name>javac -d . MyPackageClass.java
```
This forces the compiler to create the "mypack" package.

The -d keyword specifies the destination for where to save the class file. You can use any directory name, like c:/user (windows), or, if you want to keep the package within the same directory, you can use the dot sign ".", like in the example above.

Note: The package name should be written in lower case to avoid conflict with class names.

When we compiled the package in the example above, a new folder was created, called "mypack".

To run the MyPackageClass.java file, write the following:
```
C:\Users\Your Name>java mypack.MyPackageClass
```
The output will be:
```
This is my package!
```
