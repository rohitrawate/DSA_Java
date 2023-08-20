// package Polymorphism;


class Parent {

    int value = 1000;

}

class Child extends Parent {

    int value = 10;

}


public class Polymorph {
    
    public static void main(String[] args) {
        
        Parent cobj = new Child();
        Parent par = cobj;
        // Child child = (Child) cobj;
        // Child child = (Child) new Child();
        Parent parent = new Parent();

        System.out.println(" Printing value of "+ cobj.value );
        System.out.println(" Printing value of "+ par.value );
        System.out.println(" Printing value of "+ ((Child) cobj).value );

        System.out.println(" Printing value of "+ parent.value );
    }
}
