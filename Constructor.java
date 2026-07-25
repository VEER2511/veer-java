public class Constructor 
{
    int id;
    String name;
    Constructor()
    {
        id=508;
        name="veer";
    }
    void display()
    {
        System.out.println("id : "+id);
        System.out.println("name : "+name);
    }
   public static void main (String[] args)
   {
        Constructor c1 = new Constructor();

        c1.display();
   } 
}
