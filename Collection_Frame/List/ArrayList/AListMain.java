import java.util.ArrayList;
import java.util.List;


/*  ArrayList Class Implements The List Interface
    Operation 1: Adding elements to List class using add() method
    Operation 2: Updating elements in List class using set() method
    Operation 4: Removing elements using remove() method
    Operation 5: Accessing Elements in List class using get() method    
 */

public class AListMain {
    public static void main(String[] args) {
        System.out.println("Array List Main : ");

        List<Integer> l1 =  new ArrayList<>();

        // Adding Element in List Class  `add()`
        // list_name.add( Object e);
        // list_name.add( int index, Object e);
        l1.add(0, 1);
        l1.add(1, 2);
        // l1.add(1, 3); //Adding Ele on Already existing Index  Moves the eles Forward... Doesn't Replace It
        
        System.out.println("Arr List : "+ l1);
        List<Integer> l2 = new ArrayList<Integer>();
        
        
        l2.add(10);
        l2.add(20);
        l2.add(30);
        // l2.add("30"); // Error : no suitable method found for add(String)

        l1.addAll(1, l2);
        System.out.println("New L1 : "+ l1.toString());
        
        // remove has two methods 
        // 1. remove(int index)   
        // 2. remove(element)
        l1.remove(0);           // Remove Ele from List class using `remove()`
        System.out.println("New* L1 : "+ l1);

        l1.set(0, 700);   // ** Update Element in List Class using `set()` 
        System.out.println( "L1  => " + l1);

        // Accessing ele from List class Using `get()`
        int ele  =  l1.get(2);
        System.out.println(" Get : "+ ele);

        AListMain.ListIndexOf();

        // AListMain.ListIterator();

    }


    /*
        Operation 3: Searching for elements using indexOf(), lastIndexOf methods
        Operation 6: Checking if an element is present in the List class using contains() method
    */
    static void ListIndexOf(){

        System.out.println("Methods of ArrayList");
        List<String> str_List  = new ArrayList<>();

        str_List.add("Array");
        str_List.add("List");
        str_List.add("Class");
        str_List.add("implements");
        str_List.add("List");
        str_List.add("Interface");
        str_List.add("geeks");
        str_List.add(null);
        str_List.add("geeks");

        System.out.println(" Array-List of Str : "+ str_List );

        int Ist_index = str_List.indexOf( "geeks");
        int Last_index = str_List.lastIndexOf(null);
        System.out.println(" Ist Index  : "+ Ist_index);
        System.out.println(" Last Index  : "+  Last_index );

        // list.remove(Object)
        // list.remove(int index)

        // str_List.remove(7);
        str_List.set(7, "for");
        System.out.println("After Removal/set (7) : " + str_List);
    }

    
}
