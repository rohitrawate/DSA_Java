// package Abstraction;

abstract class Car {

    protected abstract void stop();
}

class Nexon extends Car{

    public void stop(){
        System.out.println("Stop : In Nexon ");
    }
} 

abstract class AbstractClass
{
    void methodOne()
    {       //Concrete Method  
    }
    //No Abstract methods but class is abstract
}

public class Abstraction {
    public static void main(String[] args) {
        
        Car obj1 = new Nexon(); 
        //You can't create objects to AbstractClass even though it does not contain any abstract methods.
        obj1.stop();
    }
}
/*
   - Constructors and fields can not be declared as abstract.
   - Abstract methods can not be private.
   - Inside abstract class, we can keep any number of constructors. If you are not keeping any constructors,
    then compiler will keep default constructor.
   -  

 */