import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class  Armstrong{
    public static void main( String[] arrgs ) throws IOException {

        Armstrong obj = new Armstrong();

        BufferedReader  in = new BufferedReader( new InputStreamReader( System.in ) );
        System.out.println( "Enter Input : ");
        String str =  in.readLine();
        int num  = Integer.parseInt(str);
        // System.out.println( "Num : "+ num +" Type : "+ ((Object)(num)).getClass().getName());
        System.out.println( ((Object)(num) ).getClass().getSimpleName());
        obj.checkArmstrong(num);
        // int result = (int)obj.checkArmstrong( num );
        // System.out.println( "Result : "+ result );

        // if(result == num)
        //     System.out.println("True. It is a Armstrong Num ");
        // else
        //     System.out.println( "No, It is Not a Armstrong Num");
        
    }

    public static int power(int x , long y){
        
        if( y==0){
            return 1;
        }
        if( y %2 == 0){
            // System.out.println( "Power : "+power(x, y/2) * power(x, y/2));
            return power(x, y/2) * power(x, y/2);
        }
        // System.out.println( "Power * x  : " + x * power(x, y/2) * power(x, y/2));
        return x * power(x, y/2) * power(x, y/2);
    }

    public boolean checkArmstrong( int num ){

        // Check order as in How many Digits the num is to Raise it to that Power
        int digits = Order( num );

        double ans = 0;
        while( num != 0 ){
            System.out.println("NUm : "+ num);
            int rem = num % 10;
            System.out.println("Remainder : "+ rem);
            // System.out.println(Math.pow( rem, digits ));
            // ans = ans + Math.pow( rem, digits );
            ans = ans + power( rem, digits );
            System.out.println( "Ans : "+ ans);
            num = num/10;
        }
        return (ans == num);
    }

    public int Order( int number ){

        int n = 0;
        while( number != 0){
            n++;
            number = number/10;
            System.out.println( "Num : "+ number + " n: "+n);
        }
        return n;
    }
}