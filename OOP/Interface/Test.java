// package Interface;

import java.io.*;
 
// A simple interface
interface In1 {
   
    // public, static and final
    int a = 10;
 
    // public and abstract
    void display();

    //From Java 8, interfaces were enhanced to allow the declaration of default methods and
    // static methods with bodies. 
    default void defaultMethod(String InterMid){     
        System.out.println("InterFace methodf with Body :" + InterMid);
    }
    static void staticMethod(){
       System.out.println("In Static Method in Interfaces. enhanced For Backward Compatibility ");
    }
}
public class Test implements In1 {

    @Override
    public void display() {
        System.out.println("In Test Class : ");
        //throw new UnsupportedOperationException("Unimplemented method 'display'");
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("Accessing Variable Declared in Interface : "+ a );
        t.display();

        t.defaultMethod("Introduced After Java 8 ");
        In1.staticMethod();
    }
    
}
