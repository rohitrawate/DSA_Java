

/*  Constructor Chaining In Java 
    main use of constructor chaining is to avoid duplicate codes while having multiple constructor (by means
    of constructor overloading) and make code more readable.
    Within same class: `this()` keyword for constructors in the same class
    From base class: `super()` keyword to call the constructor from the base class.
 */

// Constructor Chaining to other class using super() keyword :
class BaseClass {
    String name;

    BaseClass(){
        this("");
        System.out.println("No-argument constructor of base class");
    }
    BaseClass(String name)
    {
        this.name = name;
        System.out.println("Calling parameterized constructor of base");
    }

} 



public class Chaining extends BaseClass{
    Chaining(){
        this(2);
        System.out.println("The Default constructor");
    }
    Chaining(int x){
        super("xyz");
        // this(2, 15);
        System.out.println("int  para : "+x);
    }
    Chaining(int x , int y){
        System.out.println( "Multiply : "+x*y);
    }

    public static void main(String[] args) {
        new Chaining();
        // BaseClass
        // Chaa
    }
}
