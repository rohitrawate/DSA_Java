
public class Void {

    public static void main( String args[])
    {
        final int x ; 
        //  System.out.println(" Hello "+ x); // vale not initialised
        
        // Child obj = new Human();  // Error : Incompatible Types: Human cannot be converted to Child
        // Child obj = new Child();  // Child Eat Called
        // Human obj = new Child();  // Child Eat Called
           Human obj = new Human();  // Human called
        obj.Eat();
        
    }
    
}

class Human {
    
    public void Eat(){
        System.out.println("In Human Class : ");
    }

 }
 class Child extends Human{

    public void Eat(){
        System.out.println( " Child eat called : ");
    }

 }
