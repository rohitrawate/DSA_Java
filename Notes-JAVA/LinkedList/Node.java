
public class Node {

    public int val;
    public Node next;
    Node() {
              // Default construtor is Required when class is Extended
    }

    Node(int x )
    {
        this.val = x;
    }
    Node(int x, Node next)
    {
        this.val = x;
        this.next = next;
    }
}