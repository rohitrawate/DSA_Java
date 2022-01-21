
import java.util.Scanner;

public class Swap {
 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter 2 Numbers...");
     int a = in.nextInt();
     int b = in.nextInt();
     System.out.println("a = "+ a);
     System.out.println("b = "+ b);

     System.out.println("After Swaping ...");
    // Swap code
    int temp = a;
    a = b;
    b = temp;
    System.out.println("a = "+ a);
    System.out.println("b = "+ b);




 }
}
    