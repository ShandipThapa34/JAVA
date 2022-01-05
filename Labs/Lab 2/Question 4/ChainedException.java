import java.io.IOException;

public class ChainedException
{
    public static void divide(int a, int b)
    {
      if(b == 0)
      {
        ArithmeticException ae = new ArithmeticException("Top layer");
        ae.initCause(new IOException("Cause"));
        throw ae;
      }
      else
      {
        System.out.println(a/b);
      }
    }

    public static void main(String[] args)
    {
      try 
      {
        divide(5, 0);
      }
      catch(ArithmeticException ae) {
        System.out.println( "caught : " +ae);
        System.out.println("actual cause: "+ae.getCause());
      }
    }
}