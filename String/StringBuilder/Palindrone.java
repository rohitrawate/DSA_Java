public class Palindrone {
    public static void main(String[] args) {

        String str = "";
        System.out.println("Length : "+ str.length());
        final boolean check = isPal(str);
        System.out.println("Result : "+ check);
    }

    static boolean isPallindrome(String word)
    {
        System.out.println("--- isPalindrome --- ");
        word = word.toLowerCase();
        int start=0, end = word.length()-1;
        // int mid = start + (end - start)/2;
        while(start < end)
        {
            System.out.println("@ ch "+word.charAt(start) + " " + word.charAt(end) );
            if( word.charAt(start) == word.charAt(end) )
            {
                start++; end--;
                continue;
            }
            else
             return false;
        }
        return true;       // returns true if empty string
    }

    static boolean isPal(String str)
    {
        System.out.println("--- isPal --- ");
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) 
        {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end)   // Comparing Char
            {
                return false;    // if some values are Not equal return false
            }
        }
        return true;
    }
}
