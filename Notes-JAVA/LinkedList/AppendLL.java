
public class AppendLL extends Node{

    public static void main(String[] args) {
        
        Node list1 = new Node(1);
        Node list2 = new Node(5);
        Node p = list1;
        Node q = list2;
        
        for ( int i=2; i < 5; i++ ) 
        {
            Node  extra  = new Node(i);
            Node  extra2  = new Node(i*11);
            p.next = extra;
            p = p.next;

            q.next = extra2;
            q = q.next;
        }

         while( list1 != null && list2 != null)
         {
            System.out.println(list1.val + " " +list2.val);
            list1 = list1.next;
            list2 = list2.next;
         }
        
        // Append


    }
    
}
