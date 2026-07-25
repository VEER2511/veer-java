
public class constoverload 
{
    int x;
    int y;
    int z;
    constoverload()
    {
        System.out.println("Hellow world");
    }
    constoverload(int a,int b)
    {
        x=a;
        y=b;
        System.out.println(x+" "+y);
    }
    constoverload(int a,int b,int c)
    {
        x=a;
        y=b;
        z=c;
        System.out.println(x+" "+y+" "+z);

    }
    public static void main(String[] args) 
    {
        constoverload a1=new constoverload();
        constoverload a2=new constoverload(10,20);
        constoverload a3=new constoverload(50,60,70);
        

    }
}
