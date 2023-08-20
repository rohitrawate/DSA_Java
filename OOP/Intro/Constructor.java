
class Main {

    private Main(){
        System.out.println("In Class Main : ");
    }
}
public class Constructor {

    int  value ;
    Constructor in_Obj;
    private Constructor(){         // Constructors can be Private  restricting object creation.
        System.out.println("In COnstructor Default Cons");
    }
    
    
    public static void main(String[] args) {
        
        // Main obj = new Main();
        Constructor obj1 = new Constructor();

        System.out.println( obj1.value + "\n" + obj1.in_Obj);

    }
}
