package corejava;

import java.util.Arrays;

public class ArrayDemo {

	public int addition()
	{	
		int b[] = new int[5];  //Array Declaration
		b[0]= 10;          
		b[1]= 20;      //Array initialization
		b[2]= 30;	
		b[3]= 40;	
		b[4]= 50;	
		
		int  sum =  Arrays.stream(b).sum();
	    System.out.println(sum);
		return sum;  
	}
	
	
	public int sumup()
	{
		int x[] = {10 ,20 ,30,40,50}; //directly passing the values into the array single dimensional Array
		int add = 0;	 
		 for(int i=0;i<x.length;i++)
		 {
		//System.out.println(x[i]);		 
			add+=x[i];	 
		 }
		 System.out.println(add);
		return add;	
	}
   public static void main(String[] args)
	{
		ArrayDemo ad = new ArrayDemo();
		ad.addition();
		ad.sumup();		
	}
	

	
	
	}


