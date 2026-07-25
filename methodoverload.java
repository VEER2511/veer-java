public class methodoverload 
{
    
    int x;
    int y;
    int z;
    void first()
    {
        System.out.println("Hellow world");
    }
    void add(int a,int b)
    {
        x=a;
        y=b;
        System.out.println(x+" "+y);
    }
    void addding(int a,int b,int c)
    {
        x=a;
        y=b;
        z=c;
        System.out.println(x+" "+y+" "+z);

    }
    public static void main(String[] args) 
    {
        methodoverload a1=new methodoverload();
        a1.first();
        a1.add(10,20);
        a1.addding(20,30,40);

    }
}


