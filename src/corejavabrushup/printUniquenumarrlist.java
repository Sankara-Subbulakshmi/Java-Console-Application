package corejavabrushup;

import java.util.ArrayList;

public class printUniquenumarrlist {

	public static void main(String[] args) 
	{
		//print unique number in the arraylist
		int a[] = {4,5,5,5,6,6,4,8,9};
		ArrayList<Integer> arr = new ArrayList<Integer>();
	    //for(int value:a)
		for(int i=0;i<a.length;i++) 	
	    {
			int k = 0;	 //need to be refresh every index
	    	if(!arr.contains(a[i])) //arr=0 , a[i] =4  next time arr=4 ,a[i] = 1
	    	{
	    		arr.add(a[i]);
	    		k++;
	    	
	    		for(int j=i+1;j<a.length;j++) //j=1  i=0   j=2  i=0 j=3 i=0
	    		{
	    		
	    		if(a[i]==a[j])  //4=5 4=5 4=5 4=4 (then k=1)
	    		{
	    			k++;    //k=1 matches only count increase
	    		}	  
	    		}
	    		 System.out.println("The arraylist number"+" "+a[i]+" "+"is"+" "+k +"   "+"times"); 
		    	 System.out.println(k); 
	    		
	    	}
	    	
	    	
	    }
		//empty arraylist first
		//firstpass 4(first num) each and every num into the arraylist(check if the arraylist have already 4 or not)
	    //if it is not present ,will push that number into the arraylist.
		//Then increase the index to one digit.
		//scan for passed number.(4)
		//After getring 4 count increases.
		
		
		
	}

}
