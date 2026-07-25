import java.io.*;
public class append 
{
    public static void main(String[] args) 
    {
        String data="this is test program";
        FileWriter file;

        try
        {
            File f=new File("test300.txt");
            if(f.exists())
            {
                System.out.println("file exists..");
            }
            else
            {
                System.out.println("file created..");
            }
            
            if (f.length()==0) 
            {
                System.out.println("empty file");
                 file = new FileWriter(f);
                
            }
            else
            {
                System.out.println("appeding the file data..");
                 file = new FileWriter(f,true);
                
            }
            file.write(data);
            file.close();
            
            System.out.println("data inserted done.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
