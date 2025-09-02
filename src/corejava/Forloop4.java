package corejava;

public class Forloop4 {

	public static void main(String[] args)
	
	{
		int k =3; 
		for(int i=1;i<=4;i++)        //i=1 j=1 i=2 j=2
		{		
			for(int j=1;j<=i;j++)    //k=3     k=6 9
			{
				
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
			}
			
			System.out.println("");	
		}
		
		
		
		

	}

}


//3
//6 9
//12 15 18
//21 24 27 30