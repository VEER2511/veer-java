public class const_overload 
{
    const_overload()
    {
        System.out.println("hello world :");
    }
    const_overload(int a)
    {
        System.out.println(a);
    }
    const_overload(int a,int b)
    {
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) 
    {
        const_overload s1=new const_overload();
        const_overload s2=new const_overload(4);
        const_overload s3=new const_overload(1,2);

    }
    
}
