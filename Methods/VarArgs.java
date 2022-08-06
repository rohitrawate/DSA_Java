import java.util.Arrays;

public class VarArgs{
    public static void main(String[] args) {
        nums(1,21,4,34,5,67,87,55,41,43);

        arrStr("Rohit", "Pramod ", "Pradeep");
    
        // mixed arguments of variable length
        multiple(4, "Java", 34.23,232.3,22.22,11.77,9);
    
    }
        //  Variable length arguments of int Dtypes
    static void nums(int ...arr){
        // System.out.println(arr);                 //Prints differnt code
        System.out.println("Array of variable int: "+Arrays.toString(arr));
    }
     //  Variable length arguments of String Dtypes
    static void arrStr(String ...charray){
        // System.out.println(charray);              //Prints differnt code
        System.out.println("Array of variable String: "+Arrays.toString(charray));
    }

         //  Variable length arguments of Mixed Dtypes
     static void multiple(int a, String str, double ...darr){
         System.out.println("int= "+ a+ "    Str= "+str+ "      Double arr= "+Arrays.toString(darr));
     }
}