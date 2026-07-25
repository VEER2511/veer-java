class A
{
    void hello()
    {
        System.out.println("heyyyyy");
    }
}

class B extends A
{
    void haaaaa()
    {
        hello();
    }
}

public class hierarchical extends A
{
    public static void main(String[] args) 
    {
        hierarchical h = new hierarchical();
        B b = new B();
        h.hello();
        b.haaaaa();
    }
    
}
