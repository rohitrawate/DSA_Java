public class Str_func {
    public static void main(String[] args) {
        

        contains();
        equals();
        compareTo();
        indexOf();
        concate();
    }

    /*  s1.contains(s2) : returns boolean, true if s1 has s2 as a substring else false
     */
    static boolean contains()
    {
        String s1, s2, s3;
        System.out.println("--- Syntax:  s1.contains(s2) --- ");
         s1 = "geeksforgeeks";
         s2 = "for";
         s3 = "forky";
        System.out.println(s1.contains(s2)); // true
        System.out.println(s1.contains(s3)); // false

        return false;        
    }
    /*  s1.equals(s2) : returns boolean, true only if both strings are equal, else false
     * 
     */
    static boolean equals()
    {
        String s1, s2, s3;
        System.out.println("--- Sytax:  s1.equals(s2) ---");
         s1 = "geeksforgeeks";
         s2 = "geeksforgeeks";
         s3 = "geeksforgeeksZ";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false

        return false;        
    }

    /*  s1.compareTo(s2) : return int value : if equal = 0, less than = -1 , greater than = 1
     * 
     */
    static boolean compareTo()
    {
        String s1, s2, s3,s4, s5;
        System.out.println("--- Sytax:  s1.compareTo(s2) ---");
         s1 = "geeksforgeeks";
         s2 = "geeksforgeeks";
         s3 = "geeksforgeeksZ";
         s4 = "for";        
         s5 = "FOR";                    // .... f , g ,h 
        System.out.println(s1.compareTo(s2)); // 0
        System.out.println(s1.compareTo(s3)); // -1     S1 is smaller than S3 i.e. s3 is greater than s1
        System.out.println(s1.compareTo(s4));  // +1    S1 is greater than S4
        System.out.println(s4.compareToIgnoreCase(s5));
        return false;   
    }  
    
    static boolean indexOf()
    {
        String s1, s2, s3,s4;
        System.out.println("--- Sytax:  s1.indexOf(s2) --- ");
         s1 = "geeksforgeeks";
         s2 = "geeks";
        //  s3 = "NOT";
         s4 = "for";                             // .... f present at index 8 
        System.out.println(s1.indexOf(s2)); //  0 :   S2's 1st char appears at 0th position in S1
        System.out.println(s1.indexOf(s2,1)); // search after the given index =8
        System.out.println(s1.indexOf("NOT")); // -1 :   S3 is not present in S1
        System.out.println(s1.indexOf(s4)); //  5 :    S4's 1st char appears at 5th position in S1
        return false;   
    }
    static void concate()
    {
        System.out.println("--- Concate ---");
        String s1 = "Geeks";
        String s2 = "forGeeks";
        String output = s1.concat(s2);
        System.out.println(output);
    }
}
