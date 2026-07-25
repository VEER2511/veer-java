public class arithmatic_exception 
{
    public static void main(String[] args) 
    {
        try {
            int a= 0 ;
            int b = 1;
            int result = b/a;
        } catch (ArithmeticException e) {
            
            System.out.println("can't divide 0 "+ e);
        }
    }
}
