// package Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysMethods {
    
    public static void main(String[] args) {
        
        int[] a = { 1,3,7,9,6,5,2,8,4};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int hashcode = Arrays.hashCode(a);
        System.out.println(hashcode);
        
        int k = Arrays.binarySearch(a, 11);    // If found returns Index 
        System.out.println(k);                      // if not  returns -k where  index in sorted array is i = -k-1;

        int b[] = Arrays.copyOf(a, a.length);       // a equals b --> True
        System.out.println(Arrays.toString(b));     
        
        int c[] = new int[5];
        Arrays.fill(c , 77);
        System.out.println(Arrays.toString(c));     


        System.out.println( Arrays.equals(a,b));

        Random random = new  Random();
        System.out.println(random.nextInt(1000));
    }
}
