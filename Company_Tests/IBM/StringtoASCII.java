import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringtoASCII {

    public static void main(String[] args) throws IOException  {
        System.out.println("--- String to ASCII ---");

        BufferedReader bfn = new BufferedReader( new InputStreamReader( System.in) );
        String bfn_str = bfn.readLine();
        System.out.println(  "---==> " + bfn_str );

        // System.out.println( bfn_str.getClass().getSimpleName());
        StringBuilder Password = new StringBuilder(bfn_str);
        // --**-- Password is of type StringBuilder --***--
        // String  Password1 = Password.append("");
        
        // String Password1 =  Password.toString();   // Password + "";       // Str Builder to String
        System.out.println("Password : "+ ((Object)Password).getClass().getSimpleName());

        StringtoASCII obj = new StringtoASCII();
        long Ascii =   obj.UncodePassword(Password.toString());

        System.out.println("Result of  String to Ascii (in long):" + Ascii);
    }

    public long UncodePassword( String Password){

        int ascii = 0;
        // String ascii_Code = "" ;
        StringBuilder  ascii_Code =  new StringBuilder();
        System.out.println("In Uncode : "+ Password);
        for (char ch : Password.toCharArray()) {
            System.out.println("ch : "+ch);
            ascii =  (int) Character.valueOf(ch);
            // ascii_Code += ascii; 
            ascii_Code.append(ascii);
            System.out.println(ascii + "\n" + ascii_Code);
        }

        String trimed = ascii_Code.toString().trim();
        // int ans =  Integer.parselong(trimed); // ascii_Code;
        long ans  =  Long.parseLong(trimed);
     
        // return ascii_Code.toString(); // Returned String
        return ans;
    }

}
