public class Shape 
{
    void area(float radius)
    {
        System.out.println("area of circle:"+(3.14*2)*(radius*radius));
    }
    void area(float length,float width)
    {
        System.out.println("area of rectangle : "+length*width);
    }
    public static void main(String[] args) 
    {
        Shape s=new Shape();
        s.area(2);
        s.area(10,10 );
        
    }
    
}
