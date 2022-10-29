import java.util.LinkedList;
import java.util.Queue;

// import javax.swing.event.ListDataListener;
import java.util.Queue;
import java.util.LinkedList;

public class QueueImplement {
    public static void main(String[] args) {
        System.out.println("QQ");
    
         Queue qq = new LinkedList<>();
         

         qq.add(979);
        qq.add("Sas");
        qq.add("Sas");
        qq.add(90);
        System.out.println("Q .. > " +qq);
        System.out.println("Q .. > " +qq.contains(90));
        qq.remove();
        qq.add("4241");
        //  qq.element();
        System.out.println("Peek "+qq.element());
        System.out.println("Q -> " +qq);


        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(9090);
        ll.addFirst(800);
        System.out.println(ll);
        // ll.addFirst();
        System.out.println(ll);
        System.out.println(ll);
    }
}
