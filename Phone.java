public class Phone 
{
    String brand;
    String model;
    double price;

 
     Phone() {
        brand = "poco";
        model = "11k";
        price = 25000.0;
    }

    
     Phone(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    
     Phone(Phone obj) {
        brand = obj.brand;
        model = obj.model;
        price = obj.price;
    }

    
     void display() {
        System.out.println("Brand: " + brand + " | Model: " + model + " | Price: " + price);
    }

    public static void main(String[] args) {
        System.out.println("--- Veer's Mobile Inventory System ---");

        
        Phone m1 = new Phone();

        m1.display();


        Phone m2 = new Phone("Apple", "iPhone 15", 99999.99);
        
        m2.display();

        
        Phone m3 = new Phone(m2);
        System.out.print("Duplicate Record: ");
        m3.display();
        
    }
}
