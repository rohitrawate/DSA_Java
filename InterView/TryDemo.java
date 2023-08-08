import java.sql.SQLException;

public class TryDemo {

    public static void main(String[] args) {
        
        try{
            int y = 10/0;

        }
        // catch( Exception e){
        //     System.out.println( "Exception 1 " + e);
        // }
        catch( ArithmeticException ex){                      // error: exception ArithmeticException has already been caught
            System.out.println( "Exception 2 " + ex);
            ex.printStackTrace();
  
        }
        catch( SQLException sqlex){
            System.out.println("Sql excep : "+ sqlex);
        }

}                   
    
}
