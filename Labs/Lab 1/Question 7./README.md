**Interface in Java**
->An interface in Java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java. In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.
Java Interface also represents the IS-A relationship.
It cannot be instantiated just like the abstract class.
Since Java 8, we can have default and static methods in an interface.
Since Java 9, we can have private methods in an interface.

**Why use Java interface?**
->There are mainly three reasons to use interface. They are given below.
1. It is used to achieve abstraction.
2. By interface, we can support the functionality of multiple inheritance.
3. It can be used to achieve loose coupling.


**Java 8 Default Method in Interface**
-> Java 8 introduces a new concept of default method implementation in interfaces. This capability is added for backward compatibility so that old interfaces can be used to leverage the lambda expression capability of Java 8.

For example, ‘List’ or ‘Collection’ interfaces do not have ‘forEach’ method declaration. Thus, adding such method will simply break the collection framework implementations. Java 8 introduces default method so that List/Collection interface can have a default implementation of forEach method, and the class implementing these interfaces need not implement the same.

Since Java 8, we can have method body in interface. But we need to make it default method. Let's see an example:

interface Drawable
{  
  void draw();  
  default void msg()
  {
    System.out.println("default method");
  }  
}
class Rectangle implements Drawable
{  
  public void draw()
  {
    System.out.println("drawing rectangle");
  }  
}
class TestInterfaceDefault
{  
  public static void main(String args[])
  {  
    Drawable d=new Rectangle();  
    d.draw();  
    d.msg();  
  }
}  

Output:
drawing rectangle
default method
