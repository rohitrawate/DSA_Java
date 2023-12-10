import java.lang.reflect.Array;
import java.util.ArrayList;

public class AListMain2 {
    public static void main(String[] args) {
        System.out.println("AListMain2 -- Methods in ArrayList<>");

        ArrContains();

    }

    public static void ArrContains(){
        System.out.println(" ArrayList.Contains() ");
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<String> strList  = new ArrayList<>();

        for (int i = 1; i < 100; i+=10) {
            intList.add(i);
        }
        //  Addinfg Multiple Null values 
        intList.add(null);
        intList.add(null);
        intList.add(null);

        System.out.println("List int: "+ intList);
        boolean checks = intList.contains(21);
        System.out.println( "Check : "+ checks);
        
        strList.add("Hey ");
        strList.add("this ");
        strList.add("code ");
        strList.add("explains ");
        strList.add("list.contains() ");
        strList.add("method ");
        strList.add("of List");
        // strList.add(null);   // Can add multiple null values
        // strList.add(null);

        System.out.println("Str List : "+ strList);

        System.out.println("contains Method : "+ strList.contains("of List"));  // space and everthing matters 

    }
    
}
