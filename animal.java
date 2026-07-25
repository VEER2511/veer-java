class dog 
{
    void bark()
    {
        System.out.println("dog is barking");
    }
}
class cat extends dog 
{
    void meow()
    {
        System.out.println("cat is mewoing ");
    }
}
class animal {
    public static void main(String[] args) 
    {
        cat c1=new cat();
        {
           c1.bark();
           c1.meow(); 
        }
    }   
}
