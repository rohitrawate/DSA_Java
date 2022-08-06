import java.util.Arrays;

public class CopyofArray {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 4,6};
        System.out.println(" Length of arr: " +arr.length);
        
        int[] b = new int[arr.length];          // Create an array b[] of same size as arr[]
        // System.out.println(" Length of b: " +b.length);

        for(int i=0; i< arr.length; i++){
            System.out.println(" arr of "+i+"= "+arr[i]);
            b[i] = arr[i];
        }
        //  Printing 
        int count=0;
        for (int num : b){
            System.out.println("Element in b["+count + "] = " +num);
            count++;
        }

        // Clone() method to copy ele from the array
           System.out.println("Copying Array Using clone() ");
           int c[] = arr.clone();
           
           for (int i : c) {
               System.out.println(i);
           }
          
        //    Using copyOf() method of Arrays class
            System.out.println("Using copyof()  of Arrays class");
            // Syntax: 
            // public static int[] copyOf​(int[] original, int newLength) 
            int[] copyarr =   Arrays.copyOf(arr, 4);
        //    b[0]++;
               copyarr[0] = 2;    // same as b[0]++ coz 
               
               System.out.println("Contents of arr[] ");
 
                // Iterating over array. arr[]
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
    
            System.out.println("\n\nContents of Copyarr[] ");
    
            // Iterating over array b[]
            for (int i = 0; i < copyarr.length; i++)
                System.out.print(copyarr[i] + " ");

    }


}
