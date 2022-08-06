public class Str_construct {
    public static void main(String[] args) {
        System.out.println("--- Constructors  ---");
        
        char char_arr[] = {'G', 'e', 'e', 'k', 's'};      // String(char[] char_arr) 
        String s_charr = new String(char_arr); //Geeks
        System.out.println(s_charr);

        byte[] b_arr = {71, 101, 101, 107, 115};          // String(byte[] byte_arr) 
        String s_byte =new String(b_arr); //Geeks
        System.out.println(s_byte);

        // StringBuffer()
        StringBuffer str_buff  = new StringBuffer("Rohit");
        // StringBuilder()
        StringBuilder  str_build = new StringBuilder("Rohit");
        System.out.println("StringBuffer : "+ str_buff + "\nStringBuilder : "+ str_build );
    }

}
