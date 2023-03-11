
public class Insert extends Node {
    public static void main(String[] args) {
        Node start = new Node(11);
        Node p = start;
        for (int i = 1; i <=6; i++) 
        {
            // p = p.next = new Node(i*10);
            p.next = new Node(i*11);
            p = p.next;
        }

        for( p=start; p != null; p= p.next )
        {
            System.out.println(p.val +"-> ");
        }
        /*   // OUTPUT //
         * 11-> 
            11-> 
            22-> 
            33-> 
            44-> 
            55-> 
            66->
         */
    }
}
