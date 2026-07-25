
public class thismethod 
{
    void a()
    {
        System.out.println("hello world");
    }
    void b()
    {
        this.a();
        System.out.println("hello!");
    }
    public static void main(String[] args) 
    {
        thismethod a1=new thismethod();
        a1.b();
    }
}
