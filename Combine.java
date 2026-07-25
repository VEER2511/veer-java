public class Combine 
{
   int id;
   String name;
   Combine()
   {
    System.out.println("this is default constructor");
   } 
   Combine(int i, String n)
   {
        id=i;
        name=n;
   }
   Combine(Combine obj)
   {
        id=obj.id;
        name=obj.name;
   }
   void display()
   {
    System.out.println("id : "+id);
        System.out.println("name : "+name);
   }
   public static void main(String[] args) {
    
        Combine c1 =new Combine();
        Combine c2 =new Combine(100,"combine");
        Combine c3 =new Combine(c2);

        c2.display();
        c3.display();

        
   }
}
