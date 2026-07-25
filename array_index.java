public class array_index 
{
    public static void main(String[] args) 
    {
        try {
            int[] a= new int [5];
            System.out.println(a[10]);

        } catch (ArrayIndexOutOfBoundsException e) 
        {
           System.out.println(e);
        }
    }
}
