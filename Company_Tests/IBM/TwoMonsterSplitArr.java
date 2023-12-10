import javax.print.DocFlavor.STRING;

public class TwoMonsterSplitArr {

    public static void main(String[] args) {
        
        String str = "PPPP@PP@PPPP@PPP@PP";

        System.out.println( Solution(str) );

    }

    public static int Solution( String str ){
        int a = 0, ans = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {
            a++;
            System.out.println(" Value a : "+ a);
            if( str.charAt(i)=='@' || str.charAt(i)=='$')
            {
                --a; // as the last checked Char was Monster
                ans = Math.min( ans, a );
                System.out.println("Value of ans = "+ ans);
                a = 0;    // starting again 
            }
        }
        
        ans = Math.min( ans, a );
        return ans;
    }
    
}
