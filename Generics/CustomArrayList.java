
import java.util.ArrayList;
import java.util.StringJoiner;



public class CustomArrayList {
 
    public static void main(String[] args) {
        // System.out.println("GOOD to Go ");
        ArrayList list1 = new ArrayList(10);  // ArrayList Stores Elements and Objects so BELOW
        System.out.println(list1);
         list1.add(12);
         list1.add(99);
         list1.add(45);
         list1.add(67);
         list1.add(8080);
        list1.remove(0);
        list1.get(0);
        System.out.println(list1.get(0));
        list1.set(1, 777);
        int size =list1.size();
        System.out.println("Size : "+size);
        Boolean bool = list1.isEmpty();
        String  valueString = new Boolean(bool).toString();
       System.out.println(" IsEmpty =-> " +  valueString.toUpperCase() );
       System.out.println(" IsEmpty =-> " +  list1.isEmpty() );

       print(list1);
            
    }
    
    public static void print(ArrayList L1){

        ArrayList tempList = L1;
        System.out.print(" [ ");
        for (Object ex : tempList) {   // Stored Values in ArrayList are `OBjects`
            System.out.print(ex +" , ");
            
        }
        System.out.print(" ] ");
    }
}
