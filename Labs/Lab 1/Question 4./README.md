**Java and multiple inheritance**
->Java does not support multiple inheritance. This means that a class cannot extend more than one class. Therefore, following is illegal
public class extends Animal, Mammal{}
but we can achieve multiple inheritance by using interface.

However, a class can implement one or more interfaces, which has helped Java get rid of the impossibility of multiple inheritance. The extends keyword is used once, and the parent interfaces are declared in a comma-separated list. For example, if the Hockey interface extended both Sports and Event, it would be declared as −
public interface Hockey extends Sports, Event

Following example demonstrates the running example.
Example:

interface Event
{
   public void start();
}
interface Sports
{
   public void play();
}
interface Hockey extends Sports, Event
{
   public void show();
}
public class Tester
{
   public static void main(String[] args)
   {
      Hockey hockey = new Hockey() {
         public void start()
         {
            System.out.println("Start Event");
         }
         public void play()
         {
            System.out.println("Play Sports.");
         }
         public void show()
         {
            System.out.println("Show Hockey.");
         }
      };

      hockey.start();
      hockey.play();
      hockey.show();
   }
}

Output:
Start Event
Play Sports.
Show Hockey.
