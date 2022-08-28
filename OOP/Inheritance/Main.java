// package Inheritance;

public class Main {
    public static void main(String[] args) {
        
        Base box1 = new ChildBox();
        box1.len = 33;
        box1.info();  // Calls `ChildBox` class method as the object is of type 'ChildBox'
        Base box2 = new ChildBox(2.2 , 1.0, 5.2, 99);
        box2.info(); // 


        // Create a Base class Object
        Base base_box = new Base();

        base_box.len = 55;
        base_box.info(); // Calls `Base` class method as the object is of type 'Base'
    
          
    }
    
}
