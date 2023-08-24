// package Polymorphism.Overridding;

/*   Covariant return type 
 *    From Java 5.0 onwards it is possible to have different return types for an overriding method in the child
 *    class, but the child’s return type should be a sub-type of the parent’s return type. 
 *    This phenomenon is known as the covariant return type.
 *  
 */

class SuperClass {
    public Object method()
    {
        System.out.println("This is the method in SuperClass");
        return new Object();
    }
}
 
class SubClass extends SuperClass {
    public String method()       // Overridden method has return type String which is sub type of Object
    {
        System.out.println( "This is the method in SubClass");
        return "Hello, World!";
    }
}
public class CovariantReturn {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass();
        obj1.method();

        SubClass obj2 = new SubClass();
        obj2.method();
        
    }
    
}
