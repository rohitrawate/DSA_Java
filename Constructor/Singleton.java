
class Single{
    private static Single instance = null;
    public int x = 20;
    
    private Single(){       // private constructor can't be accessed outside the class

    }
    // Factory method to provide the users with instances
    static public Single getInstance(){
        if( instance == null )
           instance = new Single();
        return instance; 
    }
}

public class Singleton {
    public static void main(String[] args) {
        Single a = Single.getInstance();
        Single b = Single.getInstance();

        a.x = a.x + 10;
        b.x = b.x +90;
        // We changed value of a.x, value of b.x also got updated because both ‘a’ and ‘b’ refer to same object,
        System.out.println("Value of a.x = " + a.x);
        System.out.println("Value of b.x = " + b.x); 
    }
    
}
