// import java.util.Scanner;
import java.util.*;
import java.math.*;
import java.text.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Arraylist{
    
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        System.out.println("ArrayList : Dynamic Arrays" );
       // int hourglass =[];
       ArrayList<Integer> hrsum = new ArrayList<Integer>();
        int x=0,y=0,maxSum=-63;
        
        for(int i=0;i<=3;i++)
        {  
            for(int j=0;j<=3;j++)
            {
                int sum=0;
              sum=sum + arr[i][j]; 
              sum+= arr[i][j+1]; 
              sum+=arr[i][j+2];
              sum+= arr[i+1][j+1];
              sum+= arr[i+2][j]; 
               sum+=arr[i+2][j+1];
              sum+= arr[i+2][j+2];
              System.out.println("Sum :"+sum);
              hrsum.add(sum);
              maxSum = Math.max(maxSum,sum);
           System.out.println("maxSum :"+maxSum);
            }
            //maxSum = Math.max(maxSum,sum);
            //System.out.println("maxSum :"+maxSum);
            
        }
         return maxSum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int result = hourglassSum(arr);


        System.out.println(result);
        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}
