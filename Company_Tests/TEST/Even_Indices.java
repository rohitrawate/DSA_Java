/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Even_Indices
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
         
           
        
        System.out.println("Enter size of 'A' Array");
        int N = in.nextInt();
        int A[] = new int[N]; 
        for(int i=0; i<N; i++)
        {
            A[i] = in.nextInt();
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
        // System.out.println(" ");
        System.out.println("Array B : Size");
        int M = in.nextInt();
        int B[] = new int[M];
        for(int j=0; j<M; j++)
        {
            B[j] = in.nextInt();
            System.out.print(B[j]+" ");
        }
        
        // Pairs in B  ele used only Once 
        int S=0 ,Pairs=M/2;
           int[] PairArr= new int[2];
           int Paircount=0;
           for(int x=0; x<M; x++){
               
               PairArr[x] = B[x];
           }
   
        
        
        
        
        
        
        in.close();
        
        
	}

}
    // int Nline = in.nextInt();
    // for(int i=0; i<=N; i++)
    // // { 
    //         int i=0;
    //         while(i<=N && in.hasNextInt()){
    //         A[i] = in.nextInt();
    //         System.out.print(A[i]);
    //         i++;
    //     } 
    // // }
    // System.out.println("\nEnter size of 'B' Array");
    // int M = in.nextInt();
    // int B[] = new int[M];
    // for(int j=0; j<=M; j++)
    // {
    //         // while(in.hasNextInt() && i<M){
    //         B[j] = in.nextInt();
    //         System.out.print(" "+B[j]);
    //         // } 
    // }
