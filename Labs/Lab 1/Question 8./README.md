**Java static keyword**
->The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.

The static can be:
1. Variable (also known as a class variable)
2. Method (also known as a class method)
3. Block
4. Nested class


**Static in Java**
1) Java static variable
-> If you declare any variable as static, it is known as a static variable.
  i) The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
  ii) The static variable gets memory only once in the class area at the time of class loading.


**Advantages of static variable**
->It makes your program memory efficient (i.e., it saves memory).


**Program of counter by static variable**
->As we have mentioned above, static variable will get the memory only once, if any object changes the value of the static variable, it will retain its value.

//Java Program to illustrate the use of static variable which  
//is shared with all objects.  
class Counter2
{  
  static int count=0;//will get memory only once and retain its value  

  Counter2()
  {  
    count++;//incrementing the value of static variable  
    System.out.println(count);  
  }  

  public static void main(String args[])
  {  
    //creating objects  
    Counter2 c1=new Counter2();  
    Counter2 c2=new Counter2();  
    Counter2 c3=new Counter2();  
  }  
}  

Output:
1
2
3


**2) Java static method**
->If you apply static keyword with any method, it is known as static method.

1. A static method belongs to the class rather than the object of a class.
2. A static method can be invoked without the need for creating an instance of a class.
3. A static method can access static data member and can change the value of it.

**Example of static method**
//Java Program to get the cube of a given number using the static method  
  
class Calculate{  
  static int cube(int x)
  {  
    return x*x*x;  
  }  
  
  public static void main(String args[])
  {  
    int result=Calculate.cube(5);  
    System.out.println(result);  
  }  
}  

Output:125


**Restrictions for the static method**
-> There are two main restrictions for the static method. They are:
1. The static method can not use non static data member or call non-static method directly.
2. this and super cannot be used in static context.

class A{  
 int a=40;//non static  
   
 public static void main(String args[])
 {  
  System.out.println(a);  
 }  
}        

Output:Compile Time Error
