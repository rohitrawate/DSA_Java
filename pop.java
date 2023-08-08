import java.util.Scanner;

public class pop {
    
    public static void main(String[] args) {
        System.out.println("MAIN ()  ");

        Scanner sc = new Scanner(System.in);

        char gender = sc.next().charAt(0);

        System.out.println("Gender : "+ gender);

        
    }


    static {
        System.out.println("Static Block run first");
        
    }
}
