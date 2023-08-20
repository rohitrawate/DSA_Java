// package Interface;

import org.omg.CORBA.PUBLIC_MEMBER;

interface Bank{
    void deposit();
    void withdraw();
    void loan();
    void account();
    default void method(){  }
    static void method1() { }
}

abstract class Dev1 implements Bank{
    public void deposit(){         // Cannot reduce the visibility of the inherited method from Bank
        System.out.println("Your deposited Amount : "+ 40000 );
    }
}
abstract class Dev2 extends Dev1{
    public void withdraw(){
        System.out.println(" Your Withdraw Amount : "+ 20000);
    }
}

class Dev3 extends Dev2{
    public void loan(){
        // System.out.println("Your loaN : ");
    }

    public void account() { }
}

public class InterAbstract  {
    public static void main(String[] args) {
        Dev3 obj = new Dev3();
        // Interface can't be Instantiated ( can't create Obj of Intefface) But cant be referenced to the Obj of 
        // its implementing class 
        // Inside the Interface constructors are not allowed.
    // Inside the Interface not possible to declare instance variables because by default variables are public static final.
    //    
        obj.account();
        obj.withdraw();
        obj.deposit();

    }    
}
