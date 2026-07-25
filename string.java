import java.util.Scanner;

public class string 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String s = scanner.nextLine();
        String reversed = reverse(s); 
        System.out.println("Reversed string: " + reversed);
    }
    public static String reverse(String str) 
    {
        String reversed = ""; 
        for (int i=str.length()-1;i>=0;i--) 
        {
            reversed += str.charAt(i); 
        }
        return reversed; 
    }
}
