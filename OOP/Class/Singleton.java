
// package Class;

public class Singleton {

       private Singleton(){

       }

       private static Singleton instance;

       public static Singleton getInstance()
       {

          if( instance == null )
          {
            System.out.println("NEW Object Created !");
            return  instance = new Singleton();
          }
          else{
            System.out.println("Object Already exists");
             return instance;
          }
          return instance;
       }
    
}


