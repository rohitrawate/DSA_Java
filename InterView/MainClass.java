import java.util.Scanner;
import java.util.ArrayList;

public class MainClass
{
    // static
    // {
    //     // Print statement It will run in Older versions of Java  not new without Main() 
    //     System.out.print(
    //         "Static block can be printed without main method");
    //     }
// }


    public  void change(Character cc) {
        cc = 'm';
        System.out.println("in change : "+ cc);
    }
    char c = 'r';
    Character ch = c;
    public  static void main(String[] args) {
        
        ArrayList<Character> al = new ArrayList<>();
        
        // al.add(c);
        System.out.println("Hello : "+al.toString());
        
        MainClass obj1 = new MainClass();
        // obj1.change(c);
        
        System.out.println(" char c : "+obj1.c);

        MainClass.main("KSKSKKS");
        
    }

    private static void main(String args){
        System.out.println("In Main 2 Method");
    }
}