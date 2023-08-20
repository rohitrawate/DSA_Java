// package Polymorphism;

/*  Example 2: Dynamic Polymorphism
 */
import java.util.Random;
// public class DeliveryBoy {}
  
class DeliveryBoy {
  
    public void deliver() {
        System.out.println("Delivering Item");
    }
  
    public static void main(String[] args) {
        DeliveryBoy deliveryBoy = getDeliveryBoy();
        deliveryBoy.deliver();x
    }
  
    private static DeliveryBoy getDeliveryBoy() {
        Random random = new Random();
        int number = random.nextInt(5);
        return number % 2 == 0 ? new Postman() : new FoodDeliveryBoy();
    }
}
  
class Postman extends DeliveryBoy {
    @Override
    public void deliver() {
        System.out.println("Delivering Letters");
    }
}
  
class FoodDeliveryBoy extends DeliveryBoy {
    @Override
    public void deliver() {
        System.out.println("Delivering Food");
    }
}