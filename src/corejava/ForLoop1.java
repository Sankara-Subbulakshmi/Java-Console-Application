package corejava;

public class ForLoop1 {

	public static void main(String[] args) 
	{
		int k =1;
		
		for(int i=1;i<=4;i++) // i=1 j=4 i=2 j=3 i=3 j=2 i=4 j=1
		{
			
			for(int j=1;j<=5-i;j++)   
			{
				System.out.print(k);  
				System.out.print("\t"); //space
				k++;
				
			}
			

			  System.out.println(""); //new line
			
		}
		
		//1 2 3 4      [outer loop execute =1 time]    inner loop execution 4 
		//5 6 7        [outer loop execute =1 time]    inner loop execution 3  
		//8 9          [outer loop execute =1 time]    inner loop execution 2
		//10           [outer loop execute =1 time]    inner loop execution 1
		
		
		
	}

}
