 interface A  
{
    public void car();
}

interface B  
{
    public void bike();
}

class hey implements A ,B
{
   public void car()
    {
        System.out.println(" car is started");
    }
   public void bike()
    {
        System.out.println("bike is cold");
    }
}



public class multiple_inheri 
{
    public static void main(String[] args) {
        hey h = new hey();
        h.bike();
        h.car();
    }
}
