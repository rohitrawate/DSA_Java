// package Intro;

// public class Construct {}
/*
 *  Only public, protected and private keywords are allowed before a constructor name.
 * 
 */
class A
{
    private A()
    {
        System.out.println(" Private Constructor");  // Private Constructor
    }
    A(int x){
        // super();
        this();
       System.out.println("Second Constructor");
    }
 
    static void methodOne()
    {
        //You can use private constructor inside the class
        A a1 = new A();
        // return this; // cannot use this in static context
    }
}
 
public class Construct{
    public static void main(String[] args)
    {
        //You can't use private constructor ouside the class like this
        // A a1 = new A();    // The constructor A() is not visible
          A obj = new A(90);
        // A.methodOne();
    }
}