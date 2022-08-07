public class Performance {
    public static void main(String[] args) {
        System.out.println(" char ");
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);              // char = 'a'+ 1 -> 98 ( ASCII of b ) (char)(98)> b
            System.out.print(" "+ ch );            /*   ASCII:  a-z =  97-122         A-Z = 65 - 90     */
        }
        System.out.printf("\n");      // series = series + ch;  Here, everytime the string is copied and the char is Added in new copy 
                                              //  So everytime the reference is  changed 
    }                                           
}
