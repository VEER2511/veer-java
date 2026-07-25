import java.util.Scanner;
class test 
{
    void show()
    {
        
        System.out.println("example of method overloading ");
    }
    void show(int a)
    {
        System.out.println("example of method overloading "+a);
    }
    
}
public class assigment extends test
{
    int roll;
    String name;
    assigment()
    {
        System.out.println("this is constructor");
    }

    assigment(int r,String n)
    {
        roll=r;
        name=n;
    }

    assigment(assigment s)
    {
        roll=s.roll;
        name=s.name;
        
    }
    void show()
    {
        System.out.println(roll+" "+name);
    }
    public static void main(String[] args)
    {
        int i,n;
        test t1=new test();
        assigment s1=new assigment();
        assigment s2=new assigment(10,"veer");
        assigment s3=new assigment(s2);

        s2.show();
        s3.show();

        System.out.println("this is data type :");
        int number=10;
        float number1=10.0f;
        double number3=200000.23232322;
        String name="john doe";
        int arr[]={1,2,3,4,5};
        char c1='A';

        System.out.println("integer :"+number);
        System.out.println("float :"+number1);
        System.out.println("double :"+number3);
        System.out.println("string :"+name);
        System.out.println("character :"+c1);

        System.out.println("this is loops :");
        System.out.println("For loop :");
        for(i=0; i<5; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("while loop :");
            int j=0;
        while (j<5) 
        {
            System.out.println(arr[j]);
            j++;
        }
        int k=0;
        System.out.println("do while :");
        do{
            System.out.println(arr[k]);
            k++;
        }while(k<5);

        System.out.println("conditional statments (switch case) :");
        System.out.println("1.java\n2.python\n3.c++\n4.javascript");
        Scanner obj =new Scanner(System.in);
        System.out.println("enter your choice 1/2/3/4 :");
        int choice = obj.nextInt();

        switch (choice) 
        {
           case 1:
            System.out.println("JAVA");
            break;
           case 2:
            System.out.println("PYTHON");
            break;
            case 3:
                System.out.println("C++");
                break;
            case 4:
                System.out.println("JAVASCRIPT");
                break;
            default :
            System.out.println("wrong choice enterd");
            break;
        }

        t1.show();
        t1.show(1);

    }
}
