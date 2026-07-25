public class str_index 
{
    public static void main(String[] args)
    {
        try {

            String s="hello ";
            System.out.println(s.charAt(20));
            
        } catch (StringIndexOutOfBoundsException e) 
        {
            System.out.println(e);
        }
    }
    
}
