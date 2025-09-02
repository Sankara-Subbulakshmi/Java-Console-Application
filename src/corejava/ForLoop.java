package corejava;

public class ForLoop {

	public static void main(String[] args) 
	{
/*	//print numbers 1to 10
		for(int i=1;i<=10;i++)
		{		
			System.out.println(i);
				
		} */
		
	//nested for loops
		
	for(int a=1;a<=4;a++) //outer for loop this block will execute 4 times [1 outerloop = 4 inner loops]
	{
		System.out.println("Outer Loop Started");
		
		for(int b=1;b<=4;b++) //inner for loop (16 times inner loop execute)
		{
			System.out.println("inner loop");
			
		}
		
	  System.out.println("Outer Loop Finished");	
		
	}
		
		
		//1 outer loop = 4 inner loop
	    //2 outer loop = 4 inner loop
	    //3 outer loop = 4 inner loop 
	    //4 outer loop = 4 inner loop 

	}

}
