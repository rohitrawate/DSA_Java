import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrRemove extends ArrayList<Integer> {
    public static void main(String[] args) {
        System.out.println(" Variations of remove() : ");

        ArrayList<Integer> l1 = new ArrayList();

        System.out.println(" l1 : "+ l1);
        for (int i = 1; i < 20; i++) {
            l1.add(i);
        }
        System.out.println("l1 : "+ l1);
       // *************** Function Call ***************
        removeAll(l1);
        removeIf(l1);
        removeIfchar();

        l1.remove(1);       // remove( int index)   removes the Ele at the Index 
        l1.remove((Object)10);   // removes(Object ele)

        System.out.println("l1 : "+ l1);

        removeRange();
    }

    public static void removeAll( List<Integer> list){
        System.out.println("++++  removeAll()   ++++ \n" + list);
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i < 10; i+=2) {
            list2.add(i);
        }
        System.out.println(" List2 : "+ list2);

        list.removeAll(list2);
        System.out.println(" List1 : " + list) ;
        System.out.println(" List2 : " + list2) ;

    }

    // removeIf( Predicate filter)  takes predicate type of argument  
    // In Java 8,predefined functional interface in Java like Predicate, consumer, supplier
    // The return type of a Lambda function is a also functional interface.
    // returns true for elements to be removed.
    public static void removeIf( List<Integer> list){
        System.out.println("++++  removeIf( Predicate filter)   ++++ \n" + list);

        Predicate<Integer> divisible_by_3 =  (i) -> ( i % 3 ==0 );
        System.out.println(" Predicate : "+ divisible_by_3.test(19) );
        // System.out.println(" Predicate : "+ divisible_by_3.negate() );
        
        list.removeIf( divisible_by_3);
        System.out.println(" list : " + list);
    }

    public static void removeIfchar(){
        ArrayList<String> students = new ArrayList<String>(); 
  
        // Add Strings to list, each string represents student name 
        students.add("Ram"); 
        students.add("Mohan"); 
        students.add("Sohan"); 
        students.add("Rabi"); 
        students.add("Shabbir"); 
  
        // apply removeIf() method.  We are going to remove names start with `S` 
        students.removeIf(n -> (n.charAt(0) == 'S')); 
  
        System.out.println("Students name Does not start with S"); 
        // print list 
        for (String str : students) { 
            System.out.print(str + " "); 
        } 
        System.out.println();
    }

    public static void removeRange(){
        System.out.println("!!!!!!!!! removeRange(int fromIndex, int toIndex ) !!!!!!!! ");
        System.out.println(" includeing from index and Excluding to index ele");

        ArrRemove arrlist = new  ArrRemove();

        arrlist.add(1);
        arrlist.add(3);
        arrlist.add(12);
        arrlist.add(9);
        arrlist.add(7);
        arrlist.add(017); //  017 -> 15
        System.out.println(" arrList : "+ arrlist);
        
        arrlist.removeRange(2, 4);  
        System.out.println(" Updated arrList : "+ arrlist);
    }
}
