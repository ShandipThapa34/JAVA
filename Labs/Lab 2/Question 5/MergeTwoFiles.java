import java.io.*;
  
public class MergeTwoFile 
{
    public static void main(String[] args) throws IOException 
    {
        PrintWriter pw = new PrintWriter("file3.txt");
        
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
          
        String line = br.readLine();
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
          
        br = new BufferedReader(new FileReader("file2.txt"));
          
        line = br.readLine();
          
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
          
        pw.flush();
        br.close();
        pw.close();
          
        System.out.println("The first two files have been merged into the third file successfully.");
    }
}