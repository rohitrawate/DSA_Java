// Creating LinkedNodes


public class Linklist extends Node {

    public static void main(String[] args) {
        Node start;
        start = new Node(1);
        Node p = start;
        // Creating Linked Nodes 
        for(int i=0; i < 6 ; i++)
        {
            p = p.next = new Node(i*10);
        }
        // For Loop to Print Linked List
         for( p = start; p !=null ; p = p.next)
         {
            // p = p.next = new Node(5*i);
            System.out.print(p.val +" -> ");        // OUTPUT ----->>   1 -> 0 -> 10 -> 20 -> 30 -> 40 -> 50 -> 
        }
        System.out.println();

    }
}
