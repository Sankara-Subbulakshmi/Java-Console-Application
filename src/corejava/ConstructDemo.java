package corejava;

public class ConstructDemo
{
    String str;
	
	public ConstructDemo() //default constructor(not accept any vales)
	{
		System.out.println("I am the default Constructor"); 	
	} 
	
	public ConstructDemo(int a , int b) //default constructor(not accept any vales)
	{
		 
		System.out.println(a); 
		System.out.println(b); 
		int c = a*b;
		System.out.println(c); 
	}
	
	public ConstructDemo(String str) //default constructor(not accept any vales)
	{	
		
		System.out.println(str); 		
	}
	
	public void getData()
	{
	
		System.out.println("I am the method");
		
	}
	
	public static void main(String[] args)
	{
		
		ConstructDemo cd = new ConstructDemo(); //whenever create an object constructor is called.
		//complier will call  default constructor (implicit constructor)if we don't write .	
		ConstructDemo cd1 = new ConstructDemo(2,3); 
		ConstructDemo c = new ConstructDemo("hello"); 
	}

}
