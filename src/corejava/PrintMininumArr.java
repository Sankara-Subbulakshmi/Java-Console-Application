package corejava;
public class PrintMininumArr
{

public int minnum()
{
	int abc[][]= {{2,7,5},{1,8,9},{4,3,7}};
	
	int min =abc[0][0];
	
	for(int i=0;i<3;i++) //for row
	{
		for(int j=0;j<3;j++)  //for col
		{
			if(abc[i][j]<min)
			{
				min=abc[i][j];
			//System.out.print(abc[i][j]+" ");
			System.out.print(min);
			}
		}
		//System.out.println();
	}
	return min;	
}
public int secondcolmaxnum()
{
//find min num , identify col of min.num , find max num in iden.col
	
	int abc[][]= {{2,4,5},{3,2,10},{1,2,0}};
	int min =abc[0][0];
	int mincoloumn = 0;
	for(int i=0;i<3;i++) //for row
	{
		for(int j=0;j<3;j++)  //for col
		{
			if(abc[i][j]<min)
			{
				min=abc[i][j];
				mincoloumn = j;
			System.out.print(min);
			}
		}
	
	}
	//1
	int maxno= abc[0][mincoloumn];	//(0,1)
	int k=0;
	while(k<3) //3 col
	{
		if(abc[k][mincoloumn]>maxno)
		{
			maxno =abc[k][mincoloumn];
			
		}
		k++;
	}
	
	return maxno   ;
}
public int maxnum()
{
	
//int abc[][]= {{2,7,5},{1,8,9},{4,3,7}};
int abc[][]= {{2,4,5},{3,2,10},{1,2,0}};
	
	int max =abc[0][0];
	
	for(int i=0;i<abc.length;i++)
	{
		for(int j=0;j<abc.length;j++)
		{
			if(abc[i][j]>max)
			{
				max=abc[i][j];

			}
		}	
	}
	System.out.print(max);
	return max;
}

	public static void main(String[] args) 
	{
	
		PrintMininumArr pp = new PrintMininumArr();
		pp.maxnum();
		//pp.minnum();
		//pp.secondcolmaxnum();
		
	}

}
