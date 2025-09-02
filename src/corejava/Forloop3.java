package corejava;

public class Forloop3 {

	public static void main(String[] args) 
	{
	
		
	
		
	for(int i=1;i<=4;i++)  //i=1 j=1 i=2 j=2 i=3 j=3 i=4 j=4  (every time reset j var)
	{
		
		for(int j=1;j<=i;j++) 
		{
			System.out.print(j);
			System.out.print("\t");	
		}
		
		System.out.println("");
		
	}
		
		
		
	}

}


//1           outer loop execution 1 time [inner loop execution 1 time]
//1 2         outer loop execution 1 time [inner loop execution 2 time]
//1 2 3       outer loop execution 1 time [inner loop execution 3 time]
//1 2 3 4     outer loop execution 1 time [inner loop execution 4 time]