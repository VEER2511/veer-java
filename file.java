//file write and read operation

import java.io.*;

public class file_example
{
    public static void main(String[] args) 
    {
        try 
        {
            File f1 = new File("test.txt");
            FileOutputStream obj = new FileOutputStream(f1);
            byte[] data = {'j', 'a', 'v', 'a'};
            obj.write(data);
            System.out.println("Data is written to the file.");
            obj.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }

        int readData;
        try 
        {
            FileInputStream f2 = new FileInputStream("test.txt"); 
            while ((readData = f2.read()) != -1) 
            {
                System.out.print((char) readData);
            }
            f2.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}