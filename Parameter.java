public class Parameter 
{
    int id;
    String name;
    Parameter(int i,String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println("id :"+id);
        System.out.println("name :"+ name);
    }
    public static void main(String[]args)
    {
        Parameter p1=new Parameter(10,"john Doe");
        Parameter p2 = new Parameter(20,"Veer Parmar");

        p1.display();
        p2.display();
    }
}
