
import java.util.*;

/*  This code shows that the Static block and the static variables are initialised first
 *  Before the Main() and then the control passes to the main() BCOZ -
 *  As Static methods, variables does NOT depend on `Objects` (which are resolved during `RunTime` )
 *   They(static methods ) are resolved during `CompileTime` coz they are class level methods 
 */

public class Static {
    // static variable
    static int a = 10;
    static int b;
    int age ;
    String name;

      
    // static block Initialized Before MAIN method
    static {
        System.out.println("Static block Runs first & Only Once when the class is loaded .");
        b = a * 4;
        System.out.println(b);
        // System.out.println(this.age)  // Cannot use not static members/variables in static methods
    }

    static void func()
    {
        System.out.println("Static Method (func) called without Obj.");
    }
  
    public static void main(String[] args)
    {
        System.out.println("from main");
        Static.func();
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
}

/* OUTPUT  
 *  
    Static block Runs first & Only Once when the class is loaded .
    40
    from main
    Static Method (func) called without Obj.
    Value of a : 10
    Value of b : 40
 * 
*/
