**this keyword in Java**
->There can be a lot of usage of Java this keyword. In Java, this is a reference variable that refers to the current object.

**Usage of Java this keyword**
->Here is given the 6 usage of java this keyword.

1. this can be used to refer current class instance variable.
2. this can be used to invoke current class method (implicitly)
3. this() can be used to invoke current class constructor.
4. this can be passed as an argument in the method call.
5. this can be passed as argument in the constructor call.
6. this can be used to return the current class instance from the method.

**1) this: to refer current class instance variable**
class Student{  
  int rollno;  
  String name;  
  float fee;  
  Student(int rollno,String name,float fee)
  {  
    this.rollno=rollno;  
    this.name=name;  
    this.fee=fee;  
  }  
  void display()
  {
    System.out.println(rollno+" "+name+" "+fee);
  }  
}  
  
class TestThis2{  
  public static void main(String args[]){  
    Student s1=new Student(111,"ankit",5000f);  
    Student s2=new Student(112,"sumit",6000f);  
    s1.display();  
    s2.display();  
  }
}  

Output:
111 ankit 5000.0
112 sumit 6000.0

If local variables(formal arguments) and instance variables are different, there is no need to use this keyword like in the following program:



**Super Keyword in Java**
->The super keyword in Java is a reference variable which is used to refer immediate parent class object.

Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

**Usage of Java super Keyword**
1.super can be used to refer immediate parent class instance variable.
2.super can be used to invoke immediate parent class method.
3.super() can be used to invoke immediate parent class constructor.

**1) super is used to refer immediate parent class instance variable.**
->We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.

class Animal
{  
  String color="white";  
}  
class Dog extends Animal
{  
  String color="black";  
  void printColor(
  {  
    System.out.println(color);//prints color of Dog class  
    System.out.println(super.color);//prints color of Animal class  
  }  
}  
class TestSuper1
{  
  public static void main(String args[])
  {  
    Dog d=new Dog();  
    d.printColor();  
  }
}  

Output:
black
white

In the above example, Animal and Dog both classes have a common property color. If we print color property, it will print the color of current class by default. To access the parent property, we need to use super keyword.

**Final Keyword In Java**
->The final keyword in java is used to restrict the user. The java final keyword can be used in many context.
Final can be:
1.variable
2.method
3.class
The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only. We will have detailed learning of these. Let's first learn the basics of final keyword.

1) Java final variable
If you make any variable as final, you cannot change the value of final variable(It will be constant).

**Example of final variable**
->There is a final variable speedlimit, we are going to change the value of this variable, but It can't be changed because final variable once assigned a value can never be changed.


class Bike9
{  
   final int speedlimit=90;//final variable  
   void run()
   {  
     speedlimit=400;  
   }  
   public static void main(String args[])
   {  
     Bike9 obj=new  Bike9();  
     obj.run();  
   }  
}//end of class  

Output:Compile Time Error

We get error in this program because we try to change the final variable. Final variable can't be changed because it is a constant.
