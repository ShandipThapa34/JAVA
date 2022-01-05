class ParentException extends Exception
{
    public ParentException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
public class OwnException
{
   void ageCheck(int age) throws InvalidValueException{
    if(age<1 && age>100)
    {
        throw new InvalidValueException("Age Invalid!!");
    }
    else{
        System.out.println("You are Eligible.");
    }
   }
   
    public static void main(String args[])
    {
        OwnException obj = new OwnException();
        try
        {
            obj.ageCheck(60);
        }
        catch (InvalidValueException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}