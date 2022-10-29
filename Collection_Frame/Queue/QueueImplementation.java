// package Queue;

import java.util.Collection;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.*;

public class QueueImplementation
{
    public static void main(String[] args) {
        
        System.out.println("Hello Java :  Queue  ");
        // PriorityQueue q = new PriorityQueue<String>();
        Queue<String> q = new LinkedList<String>();

        q.add(" Q.offer()/add() ");
        q.offer(" Q.peek/element ");
        q.offer(" Q.poll()/remove() ");
        q.offer(" Rohit ");
        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());



        // Queue
    }
}