import java.util.*;
class shape
{
    float area,length,breadth;
}
class rectangle extends shape
{
    public void getdata()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length:");
        length=sc.nextFloat();

        System.out.println("enter breadth:");
        breadth=sc.nextFloat();
        sc.close();
    }
    public void calculate()
    {
        area = length*breadth;
    }
    public void display()
    {
        System.out.println("Length=" + length);
        System.out.println("Breadth=" + breadth);
        System.out.println("Area=" + area);    
    }
}
public class single_inheritence2
{
    public static void main(String args[])
    {
        rectangle r1 = new rectangle();
        r1.getdata();
        r1.calculate();
        r1.display();
    }
}