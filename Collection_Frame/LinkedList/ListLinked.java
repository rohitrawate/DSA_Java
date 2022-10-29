import java.util.List;

import javax.sound.sampled.SourceDataLine;

import java.util.ArrayList;
import java.util.LinkedList;;

// package LinkedList;

public class ListLinked {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" LinkedList ");
		List<Integer> ll = new LinkedList<>();

		System.out.println(ll);


		ll.add(707);
		ll.add(23);
		ll.add(42);
		ll.add(55);

		System.out.println(ll);
		
		ll.remove(2);
		boolean equal = ll.equals(55);
		System.out.println("equal : "+equal);
		ll.contains(42);																																						
		ll.listIterator();
		System.out.println(ll);

		List<Integer> newll = new ArrayList<>();
		newll.add(9090);
		System.out.println(newll);
		System.out.println(ll);
		ll.addAll(newll);
		System.out.println("Linked + Arraylist -> "+ll);
	}

}
