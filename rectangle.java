class Rectangle 
{
    // Instance variables
    double height;
     double width;

    // Constructor to initialize the rectangle
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return height * width;
    }

    

    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Display the dimensions of the rectangle
     

        // Calculate and display the area of the rectangle
        double area = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);
    }
}