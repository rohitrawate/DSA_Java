import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Operators in String");
        System.out.println('a' + 'b');      // ASCII Value -Char
        System.out.print( 'a' + 7);       // ASCII if Char    of a = 97  So, 97+7 -> 104 
        
        /* Print Using Formater */
        char ch = (char)( 'a' + 7);
        System.out.format( " -> %c \n",ch);
        System.out.println( "x" + "y");     // As it is -  .toString()
        System.out.println("r" + 8);        //  converted to .toString()

        System.out.println("Rohit" + new ArrayList<>());  // []
        byte byt = 101;
        // byte b = 100;
        System.out.println("Rohit " + new Integer(byt) );
        String ans =  new ArrayList<>() + ""+ new Integer(55);   
        System.out.println(ans);                                    // []55
    }
}
