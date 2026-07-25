public class Copy 
{
    int id;
    String name;
    Copy(int i,String n)
    {
        id=i;
        name=n;
    }
    Copy(Copy obj)
    {
        id=obj.id;
        name=obj.name;
    }
    void display()
    {
        System.out.println("id : "+id);
        System.out.println("name : "+name);
    }
    public static void main(String[] args)
    {
        Copy c1 = new Copy(10 , "copy contructor");
        Copy c2 = new Copy(c1);

        c1.display();
        c2.display();
    }
}
