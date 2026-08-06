class Vehicle {

    String Name = "BYD";
    String Type = "Car";

    
    class Details {

        void display() {
            System.out.println("Vehicle Name : " + Name);
            System.out.println("Vehicle Type : " + Type);
        }
    }
}


interface Action {
    void perform();
}

public class Anonymous_vehical {

    public static void main(String args[]) {

        
        Vehicle v = new Vehicle();

        
        Vehicle.Details details = v.new Details();
        details.display();

        
        Action a = new Action() {

            public void perform() {
                System.out.println("Car is moving !!!");
            }
        };

        a.perform();
    }
}