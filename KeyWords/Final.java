
/*
 *  Final keyword can be used with Class , Variable and Method 
 *  The entity cannot be Changed ( Restricts the further modification )
 *  Any class or any method can be either 'abstract' or 'final' but not both. Abstract and final are Opposite
 *  
 */

  

// (1) The following class gives compile time error

/*  final abstract class AnyClass
{
             //Any class can not be final and abstract 
    // final abstract void methodOne();
            //method can not be final and abstract at a time
} */


// 2) final method can be overloaded and that overloaded method can be overridden in the sub class.
class SuperClass
{
    final void methodOne()
    {
        System.out.println(" Method 1: ");//final method
    }
 
    void methodOne(int i)
    {
        System.out.println(" Method 1.1: "+ i);//final method can be overloaded
    }
}

public class Final extends SuperClass {
    
    @Override
    void methodOne(final int x){
        // Overloaded method is Overridden 
    
        //k is final local variable
        // k = 20;   //compile time error   may not be assigned
    
        System.out.println(" The final method is Overloaded N then that method is Overridden in this Class: "+x);
    }
    public static void main(String[] args) {

        SuperClass obj = new Final();

        obj.methodOne(8989);

    }
}
