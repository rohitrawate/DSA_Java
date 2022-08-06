import java.util.*;

public class Array1D {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = scan.nextInt();
       int a[] = new int[n];  // Creating the user size of arrray
       for(int j=0; j<n; j++){
           System.out.print("Enter num  for index "+ j+": ");
            a[j] = scan.nextInt();
       }
    
        scan.close();

        // // Prints each sequential element in array a
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }

        // Enhanced for loop for Printing Array Elements
        for(int  num  : a){
            System.out.println(num+" ");
        }
    }
}
