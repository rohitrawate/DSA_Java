// package DSA_JAVA;



public class DriverSingle {
    public static void main(String[] args) {
        // Call a static method from static context which in turn will create new obj if instance is null 
        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // All three reference variables point to the same object
    }
    // return 0;
}