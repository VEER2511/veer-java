import java.util.HashMap;
import java.util.Scanner;

class HashMap_example
{
    public static void main(String args[])
   {
    HashMap<Integer, String> students = new HashMap<>();

    students.put(1,"alice");
    students.put(2,"bob");
    students.put(3,"charlie");
    students.put(4,"david");
    students.put(5,"emma");

    System.out.println("students data;" + students);

    Scanner scanner = new Scanner(System.in);
    System.out.println("enter students name:");
    int enrollmentno = scanner.nextInt();

    if (students.containsKey(enrollmentno))
    {
        System.out.println("student name:" + students.get(enrollmentno));
    }
    else
    {
       System.out.println("not found");
    }
    scanner.close();
   }
} 