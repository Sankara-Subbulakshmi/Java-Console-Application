package corejava;

public class AAA 
{
	int s = 9; //class var or ins.var

	public AAA()
	{	
	int s = 3; // method var or local var
	int y = this.s + s;
	System.out.println(y);	
	}
	
	public AAA(String str)
	{
	System.out.println(str);	
		
	}
	
	public AAA(int a , int b)
	{
		int c = a+ b ;
		System.out.println(c);
		
	}
	

	public  static int sum(int x , int y)
	{
		int z = x + y;
		return z;		
	}
	
	public String name(String str)
	{
		System.out.println("learning");
		return str;
		
	}

	public static void main(String[] args)
	{
		AAA obj = new AAA(); // default constructor
		AAA obja = new AAA("subbu");  // Parameter constructor
		AAA obja1 = new AAA(3,4); // Parameter constructor
		System.out.println(AAA.sum(8, 8));
		
		BBB objb = new BBB(10);
		System.out.println(objb.ADDITION());
		
	}
	
}
