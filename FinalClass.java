 final class A  // 'final' prevents inheritance
{
    public void hey()
    {
        System.out.println("Hello, world!");
    }
}

public class FinalClass  // Renamed to follow Java conventions
{
    public static void main(String[] args) 
    {
        A obj = new A();  // Object creation is fine
        obj.hey();  // Calling the method
    }
}
