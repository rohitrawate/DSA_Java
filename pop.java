import java.util.Scanner;

public class pop {
    
    public static void main(String[] args) {
        System.out.println("MAIN ()  ");

        // Scanner sc = new Scanner(System.in);

        String name = System.console().readLine();
        System.out.println("You entered string :" + name);

       //char gender = sc.next().charAt(0);

        System.out.println();

        
    }


    static {
        System.out.println("Static Block run first");
        
    }
}

/* 
// Java program to demonstrate working of System.console()
// Note that this program does not work on IDEs as
// System.console() may require console
public class Sample {
    public static void main(String[] args)
    {
        // Using Console to input data from user
        String name = System.console().readLine();
 
        System.out.println("You entered string " + name);
    }
}
*/