ASSIGN:24 NOVEMBER DEADLINE: 1 DECEMBER

*Garbage Collection in Java
-> Garbage Collection in Java is a process by which the programs perform memory management automatically. The Garbage Collector(GC) finds the unused objects and deletes them to reclaim the memory. In Java, dynamic memory allocation of objects is achieved using the new operator that uses some memory and the memory remains allocated until there are references for the use of the object.

   When there are no references to an object, it is assumed to be no longer needed, and the memory, occupied by the object can be reclaimed. There is no explicit need to destroy an object as Java handles the de-allocation automatically.

   The technique that accomplishes this is known as Garbage Collection. Programs that do not de-allocate memory can eventually crash when there is no memory left in the system to allocate. These programs are said to have memory leaks. Garbage collection in Java happens automatically during the lifetime of the program, eliminating the need to de-allocate memory and thereby avoiding memory leaks


finalize() method :
The finalize() method is invoked each time before the object is garbage collected. This method can be used to perform cleanup processing. This method is defined in Object class as:
public void finalize( ) { }
 gc() method :
The gc() method is used to invoke the garbage collector to perform cleanup processing. The gc() is found in System and Runtime classes.
 public static void gc( ) { }  


*Simple Example of Garbage Collection in Java :

public class TestGarbage1{  
  public void finalize(){ System.out.println("Garbage is collected"); }  
  public static void main(String args[]){  
    TestGarbage1 s1=new TestGarbage1();  
    TestGarbage1 s2=new TestGarbage1();  
    s1=null;  
    s2=null;  
    System.gc();  
  }  
} 

Output :
Garbage is collected
Garbage is collected
 
 
*How to delete an object in Java?
1) If you want to make your object eligible for Garbage Collection, assign its reference variable to null.
2) Primitive types are not objects. They cannot be assigned null.
 
 
*Advantages of Garbage Collection 
- It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
- It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.
