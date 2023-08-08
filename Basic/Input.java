import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
   BufferedReader is more flexible as we can specify the size of stream input to be read. (In general, it is there that BufferedReader reads larger input than Scanner)
   These two factors come into play when we are reading larger input. In general, the Scanner Class serves the input.
   BufferedReader is preferred as it is synchronized. While dealing with multiple threads it is preferred.
   For decent input, and easy readability. The Scanner is preferred over BufferedReader.
 */

public class Input   {
    public static void main(String[] args) throws IOException {
        
        BufferedReader bfn = new BufferedReader(new InputStreamReader( System.in));

        System.out.println("User input : ");
        String str = bfn.readLine();

        int i = Integer.parseInt(bfn.readLine());
        // int i = bfn.read();

        System.out.println("String : "+str + "\n int i : "+i );

        Input.Scanner();
    }

    static void Scanner(){
        Scanner sc = new Scanner(System.in);

        System.out.println("User input : ");
        String line = sc.next();
        int in = sc.nextInt();

        System.out.println("Line : "+ line + "\n in: "+in);
    }
}

