
public class StaticMethod implements Stat_Interface {
    
    public static void main(String[] args) {
        System.out.println("*** --- Interface Updated in Java 8 :  Static method and Default Method ---***");

        Stat_Interface.show();
        // show();
        // Creating obj to call default method from Interface
        StaticMethod obj = new StaticMethod();
        obj.defaultMethod();
    }
}
