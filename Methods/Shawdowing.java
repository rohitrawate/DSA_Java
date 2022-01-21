
public class Shawdowing {
    static int x;   // Global variable
    public static void main(String[] args) {
         System.out.println(x);
        int x;     // class variavble is shawdowed by this variable
        // System.out.println(x);  //Scope will BEgin when value is initialised
        x= 99;
        System.out.println(x);    // 99
        fun();

    }

     static void fun(){
         System.out.println(x);   // Prints global value = 0
     }
    
}
