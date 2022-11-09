import java.util.Scanner;


public class Jio_higherInterview {  

// Online Java Compiler
// Use this editor to write, compile and run your Java code online


// rr[] = {1, 1, 3, 5, 7}, x= 8

// class HelloWorld {
    
    static void twoSum(int  arr[] , int sum )
    {
        System.out.println("Called : Sum = "+sum);
        
        // int left =0;
        for(int l= 0; l< arr.length; l++)
        {
            System.out.println("l = "+ l);
            
            for (int j = l+1 ; j< arr.length ; j++)
            {
                System.out.println("j = "+ j);
                if( arr[l] + arr[j] == sum)
                   {
                       System.out.println(" True");
                     //   System.exist(0);
                   }
                //    else{
                //     // continue;
                //    }
            }
                                // System.out.println(" False ");

        }
            
        
        
    }
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        for(int i=0 ; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        

        int sum = sc.nextInt();
        
        // HelloWorld.twoSum(arr , sum);
        Jio_higherInterview.twoSum(arr , sum);
        
    }
}
