public class student_class 
{
    int roll;
    String name;
    void display(int r,String n)
    {
        roll=r;
        name=n;
        System.out.println(name+ " "+ roll);
    }
    public static void main(String[] args) {
        student_class a1=new student_class();
        student_class a2=new student_class();
        student_class a3= new student_class();
        a1.display(20,"abc");
        a2.display(70,"artc");
        a3.display(60,"ggdsfg");

    }
    
}
