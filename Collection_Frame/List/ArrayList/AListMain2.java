import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AListMain2 {
    public static void main(String[] args) {
        System.out.println("AListMain2 -- Methods in ArrayList<>");

        List<String> l1 = new ArrayList<>();
        l1.add("Hello, ");
        l1.add("this");
        l1.add("is the ");
        l1.add("example of ");
        l1.add("adding one list ");
        l1.add("to another ");
        System.out.println("Main l1 : " +l1);

        addAll(l1);
        
        ArrContains(); 
    }

    public static void ArrContains(){
        System.out.println(" ####### ArrayList.Contains() # # # # # # #");
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

    public static void addAll( List<String> l1){
        System.out.println("-------------------addAll() called");
        System.out.println(" l1 : "+ l1);

        ArrayList<String> l2 = new ArrayList<>();
        l2.add(" this is another list -> list 2");
        // l2.add(null)
        // l2.add(null)
        // l2.add(null)
        System.out.println(" l2 : "+ l2);
        
        // list.addAll( Collection<? extends E> c );
        // list.addAll( int index , Collection<? extends E> c ); 
        l1.addAll(l2);
        // l1.addAll
        System.out.println(" l1 : "+ l1);


    }
    
}
