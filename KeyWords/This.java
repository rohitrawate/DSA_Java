import javax.swing.text.Style;

/*  Example of "this" keyword 
 *  Using the ‘this’ keyword to refer to current class instance variables.
 *  Using this() to invoke the current class constructor
 *  
 */
class ThisExample{

    int num = 90;

    ThisExample(){
        System.out.println(" Inside this Constructor ");
    }

    ThisExample( int num ){

        // Invoking default constructor
        this();
        // num = num;      // The assignment to variable num has no effect
        this.num = num;    // --> current class instance variables
    }

    void display(){
        // Invoking the method show() of the current class
        this.show();
        System.out.println(" The Value of Num : "+ num);

    }

    void show(){
        System.out.println("Inside Show Method");
    }
}
/* You can’t use super and this keywords in a static method and in a static initialization block even though
    you are referring static members.
 *  You should call super() and this() calling statements inside the constructors only and they must be first
   statement in the constructors.
 */

class Test{
    int a , b ;
     Test(){
        this( 12 ,55 );  //  invoke a constructor from another overloaded constructor 
        System.out.println("Inside  default constructor \n");
    }

    Test(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println("Inside Para Constructor ");
    }

    // Method that returns current class instance
    Test get() { return this; }
    void display(){
        System.out.println(" In Display");
    }

    // Method that returns current class instance
    //void get() { display(this); }
}

public class This {
    public static void main(String[] args) {
      
        ThisExample obj = new ThisExample(4545);
        obj.display();
        
        Test test1 = new Test();
        
        test1.get().display();
    }    
}
