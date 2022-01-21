import java.util.Scanner;

// import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Num :");
        int n = in.nextInt();
        Boolean result = isPrime(n);           // Boolean is Rapper-Class  boolean is premitive Dtype
         System.out.println("Is the Number Prime? \n"+result.toString().toUpperCase()); 


    }

        static boolean isPrime(int num ){
            if(num <= 1)
                 return false;
            int c = 2;
            while (c * c <= num ){
                if(num % c == 0){
                    return false;
                }
                c++;
            }
             return c*c > num;                               // if(c * c > num){
                                            //      return true;
                                            // }
                                            //     return false;

        }
          
}

