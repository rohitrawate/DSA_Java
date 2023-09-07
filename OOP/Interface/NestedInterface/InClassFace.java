// package Interface.NestedInterface;

class Test {
    interface Yesface {
        void show();
    }

}
interface Test_Inter {
    interface Yes_Inter {
        void show();
    }
}

// class Testing extends Test{   // error: incompatible types: Testing cannot be converted to Yesface
class Testing implements Test.Yesface {    
   public void show(){
        System.out.println( "---show() method of interface in Class" );
   }
}

public class InClassFace {
    public static void main(String[] args) 
    {
        // Test_Inter obj123 = new Test_Inter();   error !!!
        Test.Yesface Obj;

        Testing t = new Testing();
        // t.show();
        Obj = t;
        Obj.show();
        
    }
    
}
