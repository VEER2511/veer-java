// import java.util.Scanner;

// public class pr3 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input a number
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         int reversed = 0; // Variable to store the reversed number

//         // Reverse the number using a while loop
//         while (number != 0) {
//             int digit = number % 10;     // Extract the last digit
//             reversed = reversed * 10 + digit; // Append the digit to reversed number
//             number /= 10;               // Remove the last digit from the number
//         }

//         // Output the reversed number
//         System.out.println("Reversed number: " + reversed);

//         scanner.close();
//     }
// }

import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Reversed number: ");
        
        // Extract and print each digit in reverse order
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            System.out.print(digit); // Print the digit directly
            number /= 10;            // Remove the last digit from the number
        }

        System.out.println(); // Move to the next line
        scanner.close();
    }
}
