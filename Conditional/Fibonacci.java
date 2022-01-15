import java.util.Scanner;

public class Fibonacci{
     
    public static void main(String[] args)
    { 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Num for Fibonacci Series :");

        int Num = in.nextInt();
        int a = 0;
        int b = 1;
        // for(int i=2; i<= Num; i++)
        // {
        //     System.out.println("a = "+ a +"  b = "+b);
        //     int temp = b;
        //     b = b + a;
        //     a =temp;
        // }
        
        int count = 2;
        while (count <= Num)
        {   int temp = b;
            b = b + a;
            a = temp;
             count++;
        }


         System.out.println(Num+"rd/th Num in Fibonacci Series == "+ b);
         


         in.close();

    }

}