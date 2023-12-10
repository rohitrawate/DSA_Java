import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Collection_Methods {

    public static void main(String[] args) {
        
        System.out.println( "Collections Interface Methods : ");

        Collection<Integer> collection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            collection.add(i);
        }

        System.out.println("Size : "+collection.size());
        System.out.println(collection);
        ArrayList<Integer> list1 = new ArrayList<>();    
        list1.add(1);
        list1.add(3);  
        list1.add(5);  
        list1.add(7);  
        list1.add(9);  

        // remove() and removeAll() returns boolean values
        System.out.println( collection.remove(1) ) ;      
        // collection.remove(3);
        // collection.remove(5);
        // Boolean check = collection.removeAll( list1 );
        System.out.println(collection + "\n" );

        //public boolean retainAll(Collection<?> c)	
        // It is used to delete all the elements of invoking collection except the specified collection.
        collection.retainAll(list1);    // Works as a Intersection (Common ele from Both)

        System.out.println(collection);


        Collection<Integer> set = new TreeSet<>();
        for (int i = 1; i < 100; i=i+10) {
            set.add(i);
        }
        System.out.println("Set1 :::  " + set);
        Collection<Integer> set2 = new HashSet<>();
        for (int i = 1; i < 50; i+=10) {
            set2.add(i);
        }
            System.out.println("Set2  :  " + set2 + " Size () ::: "+set2.size());
        // set.removeAll(set2);
        set.retainAll(set2);

        System.out.println("New Set : "+ set);
        set2.clear();
        System.out.println("Set2  :  " + set2 + " Size () : "+set2.size());
    }
    
}
