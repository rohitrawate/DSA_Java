import java.util.Scanner;

public class PrimeNum {
    public static void main(String args[] ) throws Exception {
        
        /* 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Check Is Prime \n Enter a Num");
        int num = sc.nextInt();

        PrimeNum.checkPrime(num);

    }

    public static void checkPrime(int x)
    {
        for( int i=2; i*i <= x; i++  )
        {
            if( x % i == 0 )
            {
                System.out.println("Not Prime Num "+ x + " / "+ i +" = "+ x/i );
                return;
            }

        }
        System.out.println("Prime Num ");

    }
}
