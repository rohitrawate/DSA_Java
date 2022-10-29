import java.util.Comparator;
// import java.util.PriorityQueue;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueLearn {
    public static void main(String[] args) {
        
        // Priority Queue uses runs on Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> pqq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(6);
        pq.offer(5);
        pq.offer(9);
        pq.offer(3);
        pq.offer(1);
        pq.offer(7);
        System.out.println(pq);
        // MIN Heapp

        // pq.remove();
        pq.poll();
        System.out.println(pq);

        // pq.remove(890);
        System.out.println("Peek() "+pq.peek());
        // pq.poll();
        System.out.println("Polled  : "+pq.poll());
        System.out.println(pq);

        System.out.println("--------  PQ Reverse -> MAX Heap -------");
        System.out.println(pqq);
        pqq.offer(6);
        pqq.offer(5);
        pqq.offer(9);
        pqq.offer(3);
        pqq.offer(1);
        pqq.offer(7);
        System.out.println(pqq);
        System.out.println(pqq.poll());
        System.out.println(pqq);
        System.out.println(pqq.peek());
        System.out.println(pqq);

    }
}
