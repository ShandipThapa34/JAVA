***CONSTRUCTORS**
-> Constructor is a block of code that initializes the newly created object. A constructor resembles an instance method in java but it’s not a method as it doesn’t have a return type. In short constructor and method are different(More on this at the end of this guide). People often refer constructor as special type of method in Java.

Constructor has same name as the class and looks like this in a java code.

public class MyClass{
   //This is the constructor
   MyClass(){
   }
   ..
}
Note that the constructor name matches with the class name and it doesn’t have a return type.

**How does a constructor work**
-> To understand the working of constructor, lets take an example. lets say we have a class MyClass.
When we create the object of MyClass like this:

MyClass obj = new MyClass()
The new keyword here creates the object of class MyClass and invokes the constructor to initialize this newly created object.


***Types of Constructors**
-> There are three types of constructors: Default, No-arg constructor and Parameterized.

1.Default constructor
->If you do not implement any constructor in your class, Java compiler inserts a default constructor into your code on your behalf. This constructor is known as default constructor. You would not find it in your source code(the java file) as it would be inserted into the code during compilation and exists in .class file. If you implement any constructor then you no longer receive a default constructor from Java compiler.

2.No-arg constructor:
Constructor with no arguments is known as no-arg constructor. The signature is same as default constructor, however body can have any code unlike default constructor where the body of the constructor is empty.

Although you may see some people claim that that default and no-arg constructor is same but in fact they are not, even if you write public Demo() { } in your class Demo it cannot be called default constructor since you have written the code of it.

Example: no-arg constructor

class Demo
{
     public Demo()
     {
         System.out.println("This is a no argument constructor");
     }
     public static void main(String args[]) 
     {
    	 new Demo();
     }
}

Output:
This is a no argument constructor


3.Parameterized constructor
->Constructor with arguments(or you can say parameters) is known as Parameterized constructor.

Example: parameterized constructor
In this example we have a parameterized constructor with two parameters id and name. While creating the objects obj1 and obj2 I have passed two arguments so that this constructor gets invoked after creation of obj1 and obj2.

public class Employee 
{
   int empId;  
   String empName;  
	    
   //parameterized constructor with two parameters
   Employee(int id, String name)
   {  
       this.empId = id;  
       this.empName = name;  
   }  
   void info(){
        System.out.println("Id: "+empId+" Name: "+empName);
   }  	   
   public static void main(String args[])
   {  
	Employee obj1 = new Employee(10245,"Ram");  
	Employee obj2 = new Employee(92232,"Shyam");  
	obj1.info();  
	obj2.info();  
   }  
}

Output:

Id: 10245 Name: Chaitanya
Id: 92232 Name: Negan
