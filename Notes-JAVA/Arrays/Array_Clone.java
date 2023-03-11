import java.security.Principal;
import java.util.Arrays;

import javax.print.attribute.standard.PrinterLocation;

// package Arrays;

// import java.util.Arrays;

public class Array_Clone {
    public static void main(String[] args) {
        
        int     num[] = new int[5];      // [0,0,0,0,0]                // Zero(0) as Elements 
        Integer nums[] = new Integer[5];  // [null, null, null, null, null ]   // Objects as Elements

        for (int i = 0; i < num.length; i++) 
        {
            num[i] = i ;   
        }
        for (int i : num) {
        // for (Integer i : nums) {
            System.out.println(" Arrays :" + i);
        }

           Array_Clone.cloneArr(num);
        //    System.arraycopy(num, 0, nums, 0, num.length);
    }

    public static int[] cloneArr(int[] arr)
    {
        System.out.println("Called cloneArr :");
        int cloneArr[] = Arrays.copyOf(arr, arr.length);
        int[] newclone =  (int[])arr.clone();

        System.out.println("******* type is : "+ cloneArr.getClass().getSimpleName());
        System.out.println("******* type is : "+ newclone.getClass().getSimpleName());
        for (int i : newclone) {
            System.out.println(i);
        }
        System.out.println( arr == newclone ? "Same Instance" : "Different Instances");

        return cloneArr;

    }
}
