

/*  Lambda Expresion
    Enable to treat functionality as a method argument, or code as data.
    A function that can be created without belonging to any class.
    A lambda expression can be passed around as if it was an object and executed on demand.

 */
interface FuncInterface{

    void abstractFun(int x);   // An abstract function

    default void normalFun()           // A non-abstract (or default) function
    {
       System.out.println("Hello");
    }   
}

public class FuncInter {
    
    //void FuncInter(){    }     // Constructor has return type... Gives Warning!!!
    public static void main(String[] args) {
        
        // lambda expression to implement above functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (a) -> System.out.println("Lambda Expression : " +2 * a );
        // FuncInterface fobj = a -> System.out.println("Lambda Expression : " +2 * a );
        // FuncInterface fobj1 =  -> System.out.println("Lambda Expression 2 : "  );

        fobj.abstractFun(8);
        fobj1.normalFun();
    }
}
