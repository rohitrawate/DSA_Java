import java.util.Scanner;

public class Assert {
    public static void main(String[] args) {
        
        System.out.println("Enter your Marks");

        byte b = 128;        //  -128 to 127
        System.out.println(" b: "+b);
        Scanner  sc = new  Scanner(System.in);
        int marks = sc.nextInt();

        assert marks >35 : "Fail";
    }
}

/*
   $ java -ea Assert       java -ea ClassName
    Enter your Marks
    35
    Exception in thread "main" java.lang.AssertionError: Fail
    at Assert.main(Assert.java:11)
 */