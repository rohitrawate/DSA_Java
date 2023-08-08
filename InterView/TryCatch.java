

/*  Java try block can have Multiple Catch Block 
 *   Java try block  is also followed by finally block
 * 
 */
public class TryCatch {
    
    //  Multiple  Catch blocks are Allowed
    public static void main(String[] args) {
        
        System.out.println("Try Catch Block");

        int x = 10;
        try{
             int num = x/0;
        }
        catch( Exception e){
             System.out.println(" Exception : "+ e);
        }
        // catch( ArithmeticException ex){
        //     System.out.println( ex);
        // }
        System.out.println("Rest of the code");
    }
}
