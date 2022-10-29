import java.util.*;

import javax.net.ssl.SSLEngineResult;

public class Stringstart {
    public static void main(String[] args) {
        System.out.println("Strings In JAVA");
        String name = "Rohit";        //Object of type/class String  - Literal [ IN Str Pool]
        System.out.println("Type of name var : " + name.getClass()); //.getSimpleName()

        System.out.println(" Index :" +name.charAt(0));
        


        // Comparator  compObj = new Comparator();
        Comparator.compare();
    }
}

class Comparator{
    public static void main(String[] args) {
        
        
    }
    static void compare(){
        String hey = "In Compartor Class";
        System.out.println(hey.toUpperCase());

        /* Notes: STRING-POOL vs HEAP
          String a = "Pradeep";   Creates String in String-Pool.
          IN POOL: refers to same "Value" if the value of new variable is Same 
          Like : String b = "Pradeep";   
          a -> "Pradeep" <- b   == true
          String  ob1 = new String("Pradeep"); With "new" keyword Creats new String Object in HEAP Memory 
          String  ob2 = new String("Pradeep");
          Refers/Creates (two) new Object even if the Value is Same. 
          ob1 -> "Pradeep"
          ob2 -> "Pradeep"

        */

        // In POOL
        String a = "Pradeep";
        String b = "Pradeep";                // Here  (a==b) is true
        
        System.out.println("In Pool \n a == b : "+ (a == b));  // true //Checks the Reference and Value too
        System.out.println(" a.equal(b) : "+ a.equals(b));   // true   //Checks only the Value/context

        // IN Heap
        String  ob1 = new String("Pradeep");
        String  ob2 = new String("Pradeep");
        // String  a = new String("Pradeep");      
        // String  b =  new String("Pradeep");    // Here  (a==b) is false

        System.out.println("In Heap \n ob1 == ob2 : "+ (ob1==ob2));    // false
        System.out.println("ob1.equals(ob2) : "+ ob1.equals(ob2));     // true
    }
} 