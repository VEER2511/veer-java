
import java.util.*;

class rectangle 
{
    float area,length,breadth;
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

public class single_inheri extends rectangle
{
    public static void main(String args[])
    {
        single_inheri r1 = new single_inheri();
        r1.getdata();
        r1.calculate();
        r1.display();
    }
}