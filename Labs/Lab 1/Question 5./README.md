**Java Command Line Arguments**
->The java command-line argument is an argument i.e. passed at the time of running the java program.

The arguments passed from the console can be received in the java program and it can be used as an input.

So, it provides a convenient way to check the behavior of the program for the different values. You can pass N (1,2,3 and so on) numbers of arguments from the command prompt.

**Simple example of command-line argument in java**
->In this example, we are receiving only one argument and printing it. To run this java program, you must pass at least one argument from the command prompt.
class CommandLineExample{  
public static void main(String args[]){  
System.out.println("Your first argument is: "+args[0]);  
}  
}  

compile by > javac CommandLineExample.java  
run by > java CommandLineExample sonoo  

Output: Your first argument is: sonoo

 
**Example of command-line argument that prints all the values**
->In this example, we are printing all the arguments passed from the command-line. For this purpose, we have traversed the array using for loop.
class A{  
public static void main(String args[]){  
  
for(int i=0;i<args.length;i++)  
System.out.println(args[i]);  
  
}  
}  

compile by > javac A.java  
run by > java A sonoo jaiswal 1 3 abc  

Output: sonoo
       jaiswal
       1
       3
       abc

**Sum of Two Numbers Using Command Line Arguments in Java**
->The command-line arguments are passed to the program at run-time. Passing command-line arguments in a Java program is quite easy. They are stored as strings in the String array passed to the args[] parameter of the main() method in Java.

SumOfNumbers4.java

public class SumOfNumbers4  
{  
public static void main(String args[])  
{  
int x = Integer.parseInt(args[0]); //first arguments   
int y = Integer.parseInt(args[1]); //second arguments  
int sum = x + y;  
System.out.println("The sum of x and y is: " +sum);  
}  
}  
Output:


The sum of x and y is: 101
First, compile the above program by using the command javac SumOfNumbers4.java. After that, run the program by using the command java SumOfNumbers4 89 12. Where 89 and 12 are command-line arguments.
