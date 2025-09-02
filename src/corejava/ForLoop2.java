package corejava;

public class ForLoop2 {

	public static void main(String[] args) 
	{
	
	//nested for loop pyramid structure reverse order
		
		int k=1;
		
		//for(int i=1;i<5;i++)
		for(int i=1;i<=4;i++) //            //i=1 j=1  i=2 j=2   i=3 j=3    i=4 j=4
		{                                   //k=1       k=2 3     k=4 5 6   k=7 8 9 10
			
			for(int j=1;j<=i;j++) // 
			{
				
			System.out.print(k);
			System.out.print("\t");
			k++;
			}
			
			System.out.println("");
			
			
		}
		
		
		
	}

}
// outer loop(1 time) ,inner loopj

//1            outer loop execution 1 time [inner loop execution 1 time]
//2 3          outer loop execution 1 time [inner loop execution 2 time]
//4 5 6        outer loop execution 1 time [inner loop execution 3 time]
//7 8 9 10     outer loop execution 1 time [inner loop execution 4 time]