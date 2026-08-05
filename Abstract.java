
abstract class shape
{
    abstract void  draw();

    void display()
    {
        System.out.println("this is shape");
    }
}

class Circle extends shape
{
    void draw()
    {
        System.out.println("drawing a circle :");
    }
}

class Rectangle extends shape
{
    void draw()
    {
        System.out.println("drawing a Rectangle");
    }
}


public class Abstract 
{
    public static void main(String[] args) 
    {
        // shape s = new shape();
        // s.display();
        Circle c = new Circle();
        c.draw();
        Rectangle r = new Rectangle();
        r.draw();
        
    }
}
