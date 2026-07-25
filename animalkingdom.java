class lion
{
    void roar()
    {
        System.out.println("Lion!!");
    }
}
class rabit extends lion
{
    void pal()
    {
        System.out.println("Rabit!");
    }
}
class fox extends lion
{
    void dc()
    {
    
        System.out.println("Fox");
    }
}
public class animalkingdom 
{
    public static void main(String[] args) 
    {
        fox f1=new fox();
        rabit r1=new rabit();
        f1.roar();
        r1.pal();
        f1.dc();
        
    }
}
