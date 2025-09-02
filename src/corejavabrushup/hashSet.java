package corejavabrushup;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("Uk");
		hs.add("India");
		hs.add("Dubai");
		hs.add("Dubai");
		System.out.println(hs);
		System.out.println(hs.remove("India")); //true
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator<String> i = hs.iterator();
		//System.out.println(i.next());
		//System.out.println(i.next()); 
		while(i.hasNext()) //traverse each and every object in the set and printed the output.
		{
			System.out.println(i.next());	
			
		}
		
		//there is no more index it came out of the loop.

	}

}
