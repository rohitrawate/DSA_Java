// package TEST;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // String str = "nifty";

        // boolean tell = "nifty" instanceof String;
        //         //   System.out.println(“nifty”.getType() == String);
        // System.out.println(str.substring(1,4));
        // System.out.println(tell);

        // int k=0;                     //PRE-POST INCREMENT i++ & ++i
        // System.out.println(k++);
        // System.out.println(k);

        /*  ** Prints 10 times Hello **   */
        // int i;
        for( int i=0; i<10; i=i++){
            System.out.println("Before"+i);
            i=i+1;
            // i=i/2;  Infinite loop coz i=0 Always
            // System.out.println("Hello "+i); 
            System.out.println(" After "+i+" Hello World");  
        }

        // System.out.print(new main().MESSAGE());
        // System.out.print(new Main2().message());

        // class Main { 
        //     Object message(){ 
        //         return “Hello!”;
        // }
        // class Main2 extends Main { 
        //     String message(){ 
        //         return “World!”; 
        //     }

    }
}
