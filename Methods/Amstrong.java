import java.util.*;
// import java.util.Math;

public class Amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       System.out.println("Enter a Num To Check Amstrong :");
        int num = in.nextInt();
        

        if(num == (isAmstrong(num)) ){
            System.out.println(true);
        }
        else
            System.out.println(false);



 // To Know the Amstrong Number
        for(int i=100 ; i<1000; i++){
            if(checkAmstrong(i)){
                System.out.print(i+" ");
              }
         }


    }

    //  Only returns the sum of indivdual cubes
    public static int isAmstrong(int a){
        int sum=0;
        while(a >0){
           int rem = a % 10; 
           int cube = (int)Math.pow(rem,3);
            sum = sum + cube;
             a = a /10;
        }    
        System.out.println("Sum: "+sum);
        return sum;
    }

    //  Returns the Amstrong num or not (boolean)
    public static boolean checkAmstrong(int n){
        int sum = 0;
        int original = n;

        while( n > 0){
           int rem = n % 10;
           n = n/10;
           sum = sum + rem*rem*rem;
        }

         if(sum == original){
            return true;
         }
         return false;
    }




    // in.close();
}



