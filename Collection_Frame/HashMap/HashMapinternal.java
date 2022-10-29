package HashMap;

// package javaEclipse;

import java.util.HashMap;
import java.util.Map;

public class HashMapinternal {
	String name;
	public void setter(String str)
	{
		this.name = str;	
	}
	
	public String toString()
    {
        return name;
    }
	
	public static void main(String[] args)
	{
		
		HashMapinternal obj = new HashMapinternal();
		obj.setter("Rohit");
		System.out.println(obj);
		
		Map< String, Integer> hm = new HashMap<>();
		
		hm.put(null, 90);
		hm.put(null, 90);
		hm.put(null, 999);
		

		
		System.out.println("HashMap : "+hm.toString() );
//		String s1 = "FB";
//		String s2 = "Ea";
//		
//		System.out.println("HashCode : "+s1.hashCode() + " s2.hashCode : "+ s2.hashCode());
//		
//		hm.put(s1, 1);
//		hm.put("aa", 4);
//
//		hm.put("qq", 7);
//
//		hm.put("bb", 8);
//
//		System.out.println("s1 -> "+ (s1.hashCode() & (16-1)) );
//		hm.put(s2, 2);
//		System.out.println(" s2 -> "+ (s1.hashCode() & (16-1)) );
//		System.out.println("HashMap : "+hm.toString() );
//		
//		System.out.println( 2236 & 14  );

	}

}
