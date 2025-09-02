package corejava;

public class MultidimensionalArray {

	public int arr()
	{
	  int b[][] = new int[2][3];
	  b[0][0] = 3;
	  b[0][1] = 4;
	  b[0][2] = 6;
	  b[1][0] = 7;
	  b[1][1] = 5;
	  b[1][2] = 2;
	// System.out.println(b[1][2]);
     for(int i=0;i<2;i++) //2 row
     {
    	 for(int j=0;j<3;j++)
    	 {	 
    		  //System.out.println(b[i][j]); 
    		    System.out.print(b[i][j]+" "); 
    		  //System.out.println("b["+i+"]["+j+"]="+b[i][j]);
    	 }	
    	  System.out.println(); 
     }    
	return 0;	
	}
	
	public int arr1()
	{
		int x[][] = {{3,4,6},{7,5,2},{1,2,3}}; //0 th row , 1 st row , 2 nd row
		
		for(int y=0;y<3;y++) //For row          //it has to traverse all the 3 col in 1 st row. 
			                                    //2 nd row all the 3 col , 3 rd row all the 3 col
		{
			for(int z=0;z<3;z++) //For col
			{
				// System.out.println("x[2][2]="+x[2][2]);
				 System.out.print(x[y][z]+" ");		
			}
			System.out.println(); 		
		}	
		return 0;		
	}
	
	public static void main(String[] args)
	{
		MultidimensionalArray ma= new MultidimensionalArray();
		// ma.arr();
		 ma.arr1();
		
		

	}
     //0 index 1 index 2 index
	//3 4 6   //0 th row
	//7 5 2   //1 st row
	
	
	
}
