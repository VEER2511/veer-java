
interface veh
{
    void start();
    void stop();
}

class Car implements veh
{
    
    public void start()
    {
        System.out.println("car is starting ...");
    }

    public void stop()
    {
        System.out.println("car is stop");
    }
}

class Bike implements veh
{
    public void start()
    {
        System.out.println("bike is starting ...");
    }
    public void stop()
    {
        System.out.println("bike is stop ...");
    }
}
public class Vehical 
{
    public static void main(String[] args) 
    {
        Car c = new Car();
        c.start();
        c.stop();
        Bike b = new Bike();
        b.start();
        b.stop();
    }
}
