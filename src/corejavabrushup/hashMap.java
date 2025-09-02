package corejavabrushup;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) 
	{
		
     HashMap<Integer, String> hm = new HashMap<Integer, String>();//key,value pair passing value string into key index
     hm.put(0, "hello");                                                             
	 hm.put(1, "good morning");
	 hm.put(2, "good evening");
	 hm.put(3, "goodbye");
	 hm.put(4, "Excuseme");
	 hm.put(4, "Sorry");
	 hm.put(5, null);
	System.out.println(hm.get(1));
	hm.remove(1);	
	System.out.println(hm.get(1));
	  Set st= hm.entrySet(); //converting hashmap to set, storing this converted set collection into one set object
	 Iterator it = st.iterator();
	 while(it.hasNext())
	 {
	      Map.Entry mp = (Map.Entry)it.next(); //cast into Map.entry[want to separate key , want to seperate value as well]
	     //for seperation need to cast map.entry class.
	      System.out.println("Key is"+" " +mp.getKey() +" " +"& value is"+" " +mp.getValue());
	    
	    
	 }
	
	}

}
