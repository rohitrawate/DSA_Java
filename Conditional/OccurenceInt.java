import java.util.Scanner;
import java.util.HashMap;

public class OccurenceInt{
    static int count;
    static void CountOccurrnce(int inputnum )
    {
      HashMap<Integer,Integer> CountMap = new HashMap<Integer,Integer>(); 
     
      while (Num > 0){
          
        int remainder = Num % 10;    // Returns the remainder of the Num.
         if(count == remainder){
        CountMap.put(remainder,);
         }
        System.out.println("The Digit is : "+ remainder);
        count = remainder;
        Num = Num /10;
    }
      

      
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num : ");
        int Num = sc.nextInt();
        System.out.println("You have Entered = "+ Num);

        
    }

    // sc.close();
}