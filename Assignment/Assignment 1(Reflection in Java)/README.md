ASSIGNMENT GIVEN: 23 NOVEMBER
DEADLINE: 30 NOVEMBER


*Java reflection
->Java Reflection is a process of examining or modifying the run time behavior of a class at run time.There is a class in Java named Class that keeps all the information about objects and classes at runtime. The object of Class can be used to perform reflection.


*Use of Reflection
1. Using reflection in Java we can inspect a class and get information about the fields, methods, constructors, implemented interfaces, super classes at run time.
2. Using reflection, we can even access a private field and invoke a private method from another class.


*Where it is used?
->The Reflection API is mainly used in:
1. IDE (Integrated Development Environment) e.g., Eclipse, MyEclipse, NetBeans etc.
2. Debugger
3. Test Tools etc.


*Reflection can be used to get information about:
1. Class
->The getClass() method is used to get the name of the class to which an object belongs.

2.Constructors 
->The getConstructors() method is used to get the public constructors of the class to which an object belongs.

3.Methods 
->The getMethods() method is used to get the public methods of the class to which an objects belongs.


Example : Java Class Reflection

```bash
import java.lang.reflect.*;

public class ReflectionHelloWorld
{
  public static void main(String[] args)
  {
    Hello f = new Hello();
    System.out.println(f.getClass().getName());
  }
}
class Hello
{
  public void print()
    {
      System.out.println("Hello World");
    }
}
```
```bash
Output : Reflection.Hello
```


*Pros: 
->Inspection of interfaces, classes, methods, and fields during runtime is possible using reflection, even without using their names during the compile time. It is also possible to call methods, instantiate a clear or to set the value of fields using reflection. It helps in the creation of Visual Development Environments and class browsers which provides aid to the developers to write the correct code.

*Cons: 
->Using reflection, one can break the principles of encapsulation. It is possible to access the private methods and fields of a class using reflection. Thus, reflection may leak important data to the outside world, which is dangerous. For example, if one access the private members of a class and sets null value to it, then the other user of the same class can get the NullReferenceException, and this behaviour is not expected.
