

public class DecodePassword {
         
    public static void main(String[] args) {
        
        //  String/Password => RohiT    // 8211110410584
        // Reverse => 4850140111128
        String password_Ascii = "4850140111128";

        System.out.println("Hello - Password Decoder");
        String Result = DecodePassword.PassDecoder(password_Ascii);
        System.out.println("Result :: "+ Result);

    }

    public static String PassDecoder( String  ascii ){

        System.out.println(ascii);
        int n = ascii.length();
        
        char A = 'A';   // 65
        char a = 'a';   //97

        System.out.println(" A :"+ (A-0) + "\n a :" + (a-0) );
        int value = 0;
        int count = 1;
        // String Password = "";
        StringBuffer Password = new StringBuffer("");
        for (int i = ascii.length()-1; i>=0 ; i--) {
            // (char) 'int'
            // ascii.charAt() => returns `Character` type value
            System.out.println("ascii.charAt((i)) :" +ascii.charAt((i)));
            String chaString =  "" + ascii.charAt(i);
            System.out.println( "chaString : " + chaString);
            int str_to_Int = Integer.valueOf(chaString);
            System.out.println( " # value == " + value);
            value =  value * count +  str_to_Int;

            System.out.println(  ascii.charAt(i) +" |:| " + value);
            if(  65 <= value  && value <= 90 )
            {
                
                System.out.println("(char) value => " +  Password.append((char) value) );
                count =1;
                value = 0;
            }
            else if( 97 <= value && value <= 122){
                System.out.println("(char) value => "  + Password.append((char) value));
                count =1;
                value = 0;
            }
            else if( value == 32){
                System.out.println( " Space Added => "+  Password.append((char) value) );
                count = 1;
                value = 0;
            }
            else{
                // value  = value + (int)ascii.charAt(i-1);
                System.out.println( "** Count ** " + count);
                count =  10;
                System.out.println( "Count *10 Called :" + count );
            }
        }  

        return Password.toString();

    }
    
}

