public class ThrowException
{
   static void checkEligibilty(int studentAge){ 
      if(studentAge<12)
      {
         throw new ArithmeticException("Student is not eligible for registration"); 
      }
      else
      {
         System.out.println("Student Entry is Valid!!"); 
      }
   } 

   public static void main(String[] args)
   { 
     System.out.println("Welcome to the Registration process!!");
     checkEligibilty(10); 
     System.out.println("Have a nice day.."); 
   } 
}