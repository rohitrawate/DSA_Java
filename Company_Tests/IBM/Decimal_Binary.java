import java.util.Scanner;

public class Decimal_Binary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int deci = sc.nextInt();

        Decimal_Binary obj = new Decimal_Binary(); 

        int ans = obj.decimalToBinary(deci);
        System.out.println( "Answer : "+ ans);
        sc.close();
    }    

    public int  decimalToBinary( int N){

        int binaryNum = 0, count = 0 ;

        while( N != 0){
            // System.out.println( " Num : " + N );
            int rem = N % 2;
            // System.out.println( " Rem : " + rem );
            double c = Math.pow( 10 ,count );      // 10^0 => 10^1 => 10^2
            // System.out.println( " c : " + c + " rem * c : "+ rem* c  );
            binaryNum  += rem * c;
            // System.out.println( " Binary Num  : "+ binaryNum);
            N = N/2 ;  // Quotient of Number 

            count++;
        }
        return binaryNum;
    }
}
