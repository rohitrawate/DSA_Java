

/*  451. Sort Characters By Frequency       [ Leetcode]
 *  https => https://leetcode.com/problems/sort-characters-by-frequency/description/
 *  Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
    Return the sorted string. If there are multiple answers, return any of them.

    Example 1:

    Input: s = "tree"
    Output: "eert"
    Explanation: 'e' appears twice while 'r' and 't' both appear once.
    So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

 */

 import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;
public class SortCharbyFreq {
    
    public static void main(String[] args) {
     
        System.out.println("SortCharbyFreq");

        String str = "cccaa";
        frequencySort(str);
    }

    public static String frequencySort(String s) {

        HashMap<> tmap = new TreeMap();
        char[] arr = s.toCharArray();

        int[] ascii = new int[225];
        for (char c : arr) {
            int value = (int)c;
            if( (int)c >= 65 && (int)c <=90 ){
                value = value+32;
            }
            Arrays.sort(arr);
        }
        
        System.out.println(s + " " + Arrays.toString(arr));
        for( int i=0; i< s.length(); i++){
            System.out.println( i+" : "+ (int)s.charAt(i));
            // HashMap<Integer, Character>
        }

        return s;
    }
}
