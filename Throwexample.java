import java.io.*;

public class Throwexample
{
    static void checkage(int age) throws IOException
    {
        if(age<=18)
        {
            throw new IOException("Age must be above 18");
        }
        System.out.println("Eligible for voting");

    }

    public static void main(String[] args)
    {
        try
        {
            checkage(15);
        }
        catch(IOException e)
        {
            System.out.println("ERROR.."+e.getMessage());
        }
        finally
        {
            System.out.println("Finally block is executed");
        }
    }
}