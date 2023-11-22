
public class StaticMethod implements Stat_Interface_18 {
    
    public static void main(String[] args) {
        System.out.println("*** --- Interface Updated in Java 8 :  Static method and Default Method ---***");

        Stat_Interface_18.show();
        // show();
        // Creating obj to call default method from Interface
        Stat_Interface_18 obj = new StaticMethod();
        obj.defaultMethod();
    }
}
