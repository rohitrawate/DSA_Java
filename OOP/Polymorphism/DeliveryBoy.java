// package Polymorphism;

/*  
 * 
 * 
 */
import java.util.Random;
// public class DeliveryBoy {}
  
class DeliveryBoy {

    Object thirdMethodOfSuperClass()       // return type of Superclass method is Object n STring is od
    {
        return new Object();
    }
  
    public void deliver() {
        System.out.println("Delivering Item");
    }
  
    public static void main(String[] args) {
        DeliveryBoy deliveryBoy = getDeliveryBoy();
        deliveryBoy.deliver();
    }
  
    private static DeliveryBoy getDeliveryBoy() {
        Random random = new Random();
        int number = random.nextInt(5);
        return number % 2 == 0 ? new Postman() : new FoodDeliveryBoy();
    }
}
  
class Postman extends DeliveryBoy {
    @Override
    public void deliver() {             // Error if return type changed to int as it is not its sub class
        System.out.println("Delivering Letters");
    }

    String thirdMethodOfSuperClass(){   // String is sub class of Object class
       return new String();
    }
}
  
class FoodDeliveryBoy extends DeliveryBoy {
    @Override
    public void deliver() {
        System.out.println("Delivering Food");
    }
}