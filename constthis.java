public class constthis 
{
    constthis()
    {
        System.out.println("Hellow");
    }
    constthis(int a)
    {
        this();
    }
    public static void main(String[] args) 
    {
        constthis a1=new constthis(10);


    }
}
