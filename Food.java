class FoodDelivery {

    String customerName = "Veer Parmar";
    String restaurant = "Pizza Hub";
    String orderItem = "Veg Cheese Pizza";

    
    class OrderInfo {

        void showOrder() {
            System.out.println("Customer Name : " + customerName);
            System.out.println("Restaurant : " + restaurant);
            System.out.println("Order Item : " + orderItem);
        }
    }
}


interface DeliveryUpdate {
    void showStatus();
}

public class Food {

    public static void main(String args[]) {

        
        FoodDelivery fd = new FoodDelivery();

        
        FoodDelivery.OrderInfo order = fd.new OrderInfo();
        order.showOrder();

        
        DeliveryUpdate d = new DeliveryUpdate() {

            public void showStatus() {
                System.out.println("Order Status : On your location.");
            }
        };

        d.showStatus();
    }
}