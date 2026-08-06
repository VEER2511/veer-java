import java.io.*;

public class Filehandle
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter f = new FileWriter("test.txt");
            f.write("this is file handling assigement..\n");
            f.write("next line is written on the file..\n");
            

            f.close();
            System.out.println("data written succesfully");

            FileReader r = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(r);

            String line;
            System.out.println("content of file..");

            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
            br.close();
            r.close();
        }
        catch(IOException e)
        {
            System.out.println("File error  "+e.getMessage());
        }
        
    }
}