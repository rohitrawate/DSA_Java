

public interface Stat_Interface_18 {
    
    static void show(){
        System.out.println( "Show Called : static method in interface " +
        "Can be called without creating Obj of implementing class");
    }
    
    default int defaultMethod(){
        System.out.println("Default method created in Interface  \n Returns int value ");

        return 007;
    }
}
