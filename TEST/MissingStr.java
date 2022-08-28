import java.util.Arrays;

public class MissingStr {
    public static void main(String[] args) 
    {
        
        String str1 = "My name is Rohit";
        String str2 = " My Rohit";
        // return missing string from s2 
        // Answer -> My name is

        // s1 > s2
        String[] s1arr = str1.split(" ") ;
        String[] s2arr = str2.split(" ") ;

        System.out.println(Arrays.toString(s1arr));
        System.out.println(Arrays.toString(s2arr));
        MissingStrop(s1arr, s2arr);

    }

        public static void MissingStrop(String[] s1, String[] s2 )
        {
            int counter = 0;
            for (int i = 0; i < s1.length; i++) 
            {
                System.out.println(s1[i] == s2[counter]);
                
            }

            // for (int j = 0; j < s2.length; j++) 
            // {
            //     System.out.println(s2[j]);
            // }
        }
    
}
