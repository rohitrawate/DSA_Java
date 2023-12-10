import java.util.ArrayList;
import java.util.List;

public class toArray {
    public static void main(String[] args) {
        System.out.println("list.toArray() : ");

        List<Integer> l1 = new ArrayList<>();

        for (int i = 1; i < 100; i+=10) {
            l1.add(i);
        }
        System.out.println(" l1 : "+ l1);
        Integer a ;
        System.out.println(" l1 : "+ l1.toArray());
        // System.out.println(a);
    }
}
