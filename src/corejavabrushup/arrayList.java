   package corejavabrushup;

import java.util.ArrayList;

public class arrayList {
//all the classes which implements list interface can accept duplicate value.
	public static void main(String[] args)
	{
	
     ArrayList<String> a = new ArrayList<String>();
	 a.add("subbu");   //0 th index
	 a.add("java"); 
	 a.add("java"); //add duplicate value but has seperate index.
	 System.out.println(a);  
	 a.add(0, "student");
	 System.out.println(a); 
	System.out.println(a.get(1));  //pull the string in the index
	System.out.println(a.contains("java"));// check the text value .returns boolean value text whatever we pass if it is in arraylist returns true.
	//arraylist in the collection class there is a method called contains simply check it.
	System.out.println(a.indexOf("subbu")); //want to know what is the index of subbu in arraylist.
	System.out.println(a.toString());//print all arraylist values.
  
	
	
	ArrayList<Integer> i = new ArrayList<Integer>();
	i.add(10);
	i.add(20);
	i.add(30);
	i.add(40);
	i.add(50);
	System.out.println(i.contains(30));
	System.out.println(i.isEmpty());
	System.out.println(i.size());
   /*  a.remove(0);
 	System.out.println(a);  
 	a.remove("java");
 	System.out.println(a); 
 	a.removeAll(a);
 	System.out.println(a); */
	
	//java.lang.system(package.classname)
		                    //out stream to display out in console. java.lang.system.out
		                    //java.io.printstream 
	
/*	String b[] = new String[3];
	b[0] = "aaaa";
	b[1] ="bbbb";
	b[2] = "cccc";
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
			System.out.print("\t");
		}*/
		
	
	}

}
