// A simple class to demonstrate the final keyword
class FinalDemo {
    // Final variable
    final int finalNumber = 100; // This value cannot be changed

    // Final method
    final void showFinalNumber() {
        System.out.println("The final number is: " + finalNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of FinalDemo
        FinalDemo demo = new FinalDemo();

        // Display the final number
        demo.showFinalNumber();

        // Uncommenting the next line will cause an error
        // demo.finalNumber = 200; // This will not work because finalNumber is final
    }
}
