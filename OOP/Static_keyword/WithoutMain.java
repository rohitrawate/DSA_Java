// package Static_keyword;

public class WithoutMain {
    
    static
    {
        System.out.println("Hello World!");
        System.exit(0); // prevents “main method not found” error
    }

    // private static void function() 
    // {
    //     String str = "Main method is not required. We can run using Static blocks";
    //     System.out.println(" Called from static block : "+ str);
    //     System.exit(0);

    // }
}
