import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args)
      {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String :");
        // char ch = in.next().trim().charAt(0);
        char ch = in.next().charAt(0);

        System.out.println("\'"+ch+"\'");


        if( ch >= 'a' && ch <= 'z')
        {
        System.out.println("LowerCase");
        }
        else{
        System.out.println("Uppercase");
        }

        in.close();

      }
}


