

public class Try
{
    public static void main(String[] args) 
    {
        try
        {
            int arr[]={10,20,30};
            try
            {
                    int result=arr[5];
                    System.out.println(result);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array index out of bound...");
            }
            int num=10/0;
            System.out.println(num);
        }   
        catch(ArithmeticException e)
        {
            System.out.println("ARITHMATIC ERROR");
        }
        catch(Exception e)
        {
            System.out.println("GENERAL ERROR");
        }
        System.out.println("Program Contiues to run......");
        
    }
}