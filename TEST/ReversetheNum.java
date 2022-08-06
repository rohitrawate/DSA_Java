import java.util.Scanner;


public class ReversetheNum {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = Sc.nextInt();
        int sum = 0;
        while( num != 0)
        {
            int rem = num%10;
            System.out.println(" Rem : "+ rem);
            sum = sum*10+rem;
            System.out.println(" Sum : "+ sum);

            num=num/10;

        }

    }
}

