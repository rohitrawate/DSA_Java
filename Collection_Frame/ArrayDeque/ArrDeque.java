// package ArrayDeque;

/*
 *  Dequeue Interface
 *  ArrayDeque Implements -> Queue[FIFO]  and  -> Dequeue [Doubly Ended Queue] Interfaces 
 * 
 * 
 * 
 * 
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" --- Arrray Deque ---");

		Deque<Integer> dq = new ArrayDeque<>();

		System.out.println("dq size : "+dq.size());
		
		dq.offer(45);
		dq.offer(76);
		dq.offer(99);
		System.out.println(dq);
		
		
		Deque<String> dq2 = new ArrayDeque(dq);    // Copies every ELe of dq 
		dq2.offer("1w2");
		System.out.println("dq2 size : "+dq2.size());
		System.out.println(dq2);
		// assertEquals("first", dq2.poll());

		// Methods
		dq2.offer("Rohit");
		dq2.offer("String");
		// int pek = dq2.peek();
		// System.out.println(dq2.peek());
		System.out.println(dq2);




	

	}

}
