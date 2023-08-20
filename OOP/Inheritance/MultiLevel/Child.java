// package Inheritance.MultiLevel;
// package Inheritance.MultiLevel;

// public class Child {}
/*
 *  Multi Level Inheritance
 *  - If the CHild class obj Calls for method which is not in That class then The Object Searches the method 
 *    in Upper class (parent class) if it doesnt have  method then it goes for Grand Parent Class and Searches NO matter the type of object
 */
    
class GrandParent {

    int age = 67;

    void getAge1(){
        System.out.println("Grand Age: " + age );
    }
}
class Parent extends GrandParent {

    int age = 40;
    // getAge1() { }    // is inherited in this class
    void getAge(){
        System.out.println(" Parent Age : "+ age);
    }
}
class Baby extends Parent{

    int age = 12;
    void getAge3(){
        System.out.println(" Baby AGe :" + age);
    }
}
public class Child {
    public static void main(String[] args) {
        
        Parent obj1 = new Parent();
        GrandParent grand = new GrandParent();
        grand.getAge1();
       GrandParent par = new Parent();
       par.getAge1();
    // par.getAge();   // getAge() is undefined for the type GrandParent

        Baby baby = new Baby();
        baby.getAge1();
        baby.getAge();
        baby.getAge3();


        obj1.getAge();       //Parent Age : 40
        obj1.getAge1();      //Grand Age: 67
    }
}
