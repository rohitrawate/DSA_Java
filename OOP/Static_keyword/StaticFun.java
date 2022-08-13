// package Static_keyword;

public class StaticFun {
    public static void main(String[] args) {
        // Static members of the class belongs to the class

        greeting(); // We can call other static method in staic  method 
        // fun();      // But we cannot call NON-Static method from static context without Objects

    }

    static void greeting()
    {
        System.out.println("In greeting()");
        StaticFun obj  = new StaticFun();
        obj.fun();
    }

      // Something that is Non- Static belongs to the Object
    public void fun()
     {
        // This method can Only be accessed by  Object of the class 
        System.out.println("In fun()");
        // greeting();   /*  If called greeting() it will go in loop and ERROR of java.lang.StackOverflowError */
        // We can Still call static method from Non-Static context *Vice-versa is Not true 
     }

    
}
