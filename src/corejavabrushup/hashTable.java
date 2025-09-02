package corejavabrushup;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashTable {

	public static void main(String[] args) 
	{

	Hashtable<Integer, String> ht = new Hashtable<Integer, String>();	
	 ht.put(0, "AAAA");                                                             
	 ht.put(1, "BBBB");
	 ht.put(2, "CCCC");
	 ht.put(3, "DDDD");
	 ht.put(4, "EEEE");
	 ht.put(4, "FFFF");	
	 
		   Set st = ht.entrySet();
		   Iterator  it = st.iterator();
		while(it.hasNext())
		{  
		   Map.Entry mp=(Map.Entry)it.next();
		  System.out.println(mp.getKey());
		  System.out.println(mp.getValue()); 
		  
		   
		   
		} 
		   
		   
		   
	}

}
