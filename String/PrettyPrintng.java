public class PrettyPrintng {
    public static void main(String[] args) {
        System.out.println("Pretty Formating");

        float f  = 141.12525f;
        // System.out.printf("Format till %.2f " , f);
    
        System.out.println(Math.PI);  // 3.141592653589793
        System.out.printf("Format Pi Value %.3f ",Math.PI);  // 3.142
        System.out.printf("Hey, My name is %s and i'm curently in %d Year ", "Rohit" , 4);
        
        /* Adding Char/ String / Dissimilar Value */

    }
}

/* Place Holders List
    %c - Character
    %d - Decimal number (base 10)
    %e - Exponential floating-point number
    %f - Floating-point number
    %i - Integer (base 10)
    %o - Octal number (base 8)
    %s - String
    %u - Unsigned decimal (integer) number
    %x - Hexadecimal number (base 16)
    %t - Date/time
    %n - Newline
 */