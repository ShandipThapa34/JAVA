import java.io.*;
class ThrowException
{
    public static void main(String[] args) throws IOException
    {
      FileWriter file = new FileWriter("c:\\Data1.txt");
      file.write("Hello World!!");
      file.close();
    }
}
