package corejava;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {

	public void searchelement()
	{
		int a[] = {10,20,30,40,50};
		int search_ele = 30;
		boolean status = false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_ele)
			{
			System.out.println("Element Found Value is"+a[i]);
			status = true;
			break;
			}	
		}
		if(status==false)
		{
		System.out.println("Element Not found");
		}
	
	}
	public void findduplicateele()
	{	
		int b[]= {100,400,100,500,100,300,600,300};
		int num= 300;
		int count =0;
		for(int value:b)
		{
			if(value==num)
			{
				count++;		
			}
		}		
		System.out.println(count);
		
	}
	public void sortelementarr()
	{
		int v[]= {12,45,23,89,11};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(v)); //shortcut printall val
		System.out.println("After sorting");
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));
		/*for(int value:v)
		{
			System.out.println(value);	
			
		}*/
	}
    public void sortingstrings()
    {
    	char z[] = {'x','c','h','t','g'};
    	System.out.println("Before sorting"+Arrays.toString(z));
    	Arrays.sort(z);
    	System.out.println("After sorting"+Arrays.toString(z));
    	
      String f[]= {"scott","mary","john","David"};
      Arrays.sort(f);
  	  System.out.println(Arrays.toString(f));	
    }
    public void reverseorderarr()
    {
    	int s[]= {100,200,300,400,500};
    	//for(int i=4;i>=0;i--)
    	for(int i=s.length-1;i>=0;i--)
    	{
    		System.out.println(s[i]);
    		
    	}
    	
    	
    }
    public void takeinputfromkeyboard()
   {
	 //  int num = 20;
	//   System.out.println(num); //hard code value
	   //scanner class
	   Scanner sc= new Scanner(System.in); //sys.in parameter
	   System.out.println("Enter a number:"); 
	   int num = sc.nextInt(); //take the numericvalue from console
	  System.out.println("Given number is"+ num); 
	    
	  
	   int no = sc.nextInt();
	  System.out.println("Addition of numbers:"+(num+no));
	  
	  
	  System.out.println("Enter a decimalnumber:"); 
	   double num1 = sc.nextInt(); //take the numericvalue from console
	  System.out.println("Given decimalnumber is"+ num1); 
	  
	
	  System.out.println("Enter your City:");
	  String s= sc.next();
	  System.out.println("your City is:"+s);
	  
	  System.out.println("Enter your Age:");
	  int d= sc.nextInt();
	  System.out.println("your Age is:"+s);
	  
	  System.out.println("Enter Unknown value:");
	  Object val= sc.next(); //convert into string as given any format
	  System.out.println(val);
	  
   }
	public void readandwritedataintoarr()
	{
		int w[] = new int[5];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<w.length;i++)
		{
		 System.out.println("Enter a value for the position"+i+":");
		 w[i] =sc.nextInt();
		}
	   System.out.println("Printing array Elements:");
	  System.out.println("Printing Array Elements:"+Arrays.toString(w));
		
	}
    public static void main(String[] args)
	{
		ArrayDemo1 ad1 = new ArrayDemo1();
		//ad1.searchelement();
		//ad1.findduplicateele();
		 //ad1.sortelementarr();
		 // ad1.sortingstrings();
		 //ad1.reverseorderarr();
		 //ad1.takeinputfromkeyboard(); //press run time in console
		   ad1.readandwritedataintoarr();
		
	}

}
