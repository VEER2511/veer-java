import java.util.Scanner;
public class grade 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks (0-100): ");
        int marks = scanner.nextInt();
        char grade;
        switch (marks / 10) 
        {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
