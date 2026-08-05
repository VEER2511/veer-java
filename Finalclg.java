final class Collage
{
    void display()
    {
        System.out.println("college name : sit");
    }
}



 class Animal
{
    final void sound()
    {
        System.out.println("Animal makes sound ");
    }
}

class Dog extends Animal
{
    // void sound()
    // {
    //     System.out.println("Dog barks");
    // }
}

public class Finalclg 
{
   public static void main(String[] args) 
   {
         Collage c = new Collage();
            c.display();
        Animal a = new Animal();
            a.sound();
        Dog d = new Dog();
        d.sound();
   }


}
