import java.util.Scanner;
// Lets get started

public class Hello{
      public static void main(String[] args) {
        System.out.println("Hello, World!!!");

        System.out.print("Enter Something: ");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
        //       // System.out.println("You have entered " + input.nextLine());

        //       // String name = input.next();
        //       // System.out.println(name);              // Only  1st single word will print 
         
        // // Type Casting
        typeCasting();
        
        byte_operations();
        
        // Hello hello_object = new Hello();
        // hello_object.Ascii_operat();
 
        Ascii_operat();

        
       }

       private static void typeCasting() {
        float f = 45.65f;                     // float in primitive data type  
        int num = (int)(f);
        System.out.println( f+" Float to int: "+ num );

        Float fobj = 23.434f;                   // Float is Rapper class and fobj is its Object
        int ob_int = fobj.intValue();
        System.out.println("Float obj to int: "+ ob_int);

        // Automatic type conversion
        int c = 259;
        byte b = (byte)(c);                     // c % 256 = Remainder(output)
        System.out.println(c+" int To byte: "+b);
       }
    
       private static void byte_operations(){
         // byte
        byte bt_x, bt_y; 
        bt_x = 40;
        bt_y = 50;
        // byte bt_int = bt_x * bt_y;       // error: incompatible types: possible lossy conversion from int to byte
       int bt_int = bt_x * bt_y;
       System.out.println("int : "+ bt_int);
       }

       private static int  Ascii_operat(){
        int asc_a = 'A';
        System.out.println(asc_a);
         return 0;
       }
      
       input.close();

        
}

   

