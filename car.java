public class car
{
    int topspeed;
    String name;

    car(int s,String n)
    {
        topspeed = s;
        name = n;
    }
    public String toString()
    {
        return "TopSpeed = "+topspeed+"\nName = "+name;
    }

    public static void main(String[] args) 
    {
        car c1=new car(100, "polo");
        car c2=new car(200, "taigun");
        car c3=new car(300, "gt");
        car c4=new car(400, "abs");
        car c5=new car(500, "hey");

        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5); 


    }
}
