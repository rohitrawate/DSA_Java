// import java.util.Scanner;
import java.util.*;

public class CountNum{
    public static void main(String args[]){

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();    //Creating HashMap 
        System.out.println("Counting the occurence of Numbers:");
        Scanner in =  new Scanner(System.in);
        
        System.out.println("Enter the Number :");
        long userin = in.nextLong(); 
        System.out.println("User Input = "+ userin);
       
        // int len = String.valueOf(userin).length(); 
        int len = (int) (Math.log10(userin) + 1);
        System.out.println("Length = "+len);
          int freq= 0;
          System.out.print("Enter the number you want to find the occurences of :- ");
          int count = in.nextInt();
        while (userin > 0){
          
            long remainder = userin % 10;    // Returns the remainder of the Num.
            System.out.println("The Digit(remain) is : "+ remainder);
            
            if (remainder == count){
                freq++;
            }   
            userin = userin /10;
        }
            System.out.println("The Freq of the Num "+ count +" is "+freq );

    }
}

