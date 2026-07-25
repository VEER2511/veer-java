 class Main 
{
    static int square(int number) 
    {
        return number * number;
    }
    public static void main(String[] args) 
    {
        String name = "veer";
        int age = 19;
        double salary = 55000.50;
        int result = square(6);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Square of 6: " + result);

        int number = 10;
        int number1 = 20;
        int sum = number + number1;
        int sub = number1 - number;
        int mul = number * number1;
        double div = (double) number1 / number;
        float mod = number1 % number;
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);

    }
}
