
class first
{
    void hello()
    {
        System.out.println("hello");
    }
}
 class second extends first
 {
    void test()
    {
        System.out.println("haaaaa");
    }
 }

public class multi_inheri extends second
{
    public static void main(String[] args) 
    {
        multi_inheri s = new multi_inheri();
        s.test();
        s.hello();
    }
    
}
