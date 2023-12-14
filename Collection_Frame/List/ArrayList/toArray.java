import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class toArray {
    public static void main(String[] args) {
        System.out.println("list.toArray() : ");

        List<Integer> l1 = new ArrayList();

        for (int i = 1; i < 100; i+=10) {
            l1.add(i);
        }
        System.out.println(" l1 : "+ l1);
        Object[] a  = l1.toArray();
        // System.out.println(" l1 : "+ l1.toArray());
        System.out.println( "toArray() : " + Arrays.toString(a));

        for (Object obj : a) {
            // Both works
            System.out.println( " object[] : "+ (int)obj );   
            // System.out.println( " object[] : "+ (Integer)obj );  
            System.out.println( ((Object)obj).getClass() );  // --> class.lang.Integer
             
        }
    }
}
