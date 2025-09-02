 package corejava;

public class B  {

	public static void xxx()
	{
		System.out.println("I am a static Method");	
		
		
		
	}
	
	
	public void abc()
	{
	System.out.println("hello");	
		
	}
	protected void ggg()
	{
		System.out.println("I am a Protected method");
	}
	
	int b;
	public int s;
	public static void main(String[] args) 
	{
	
	  B bb = new B();
	  bb.abc();
	  bb.ggg();  //protected method
	  B. xxx(); //static method
	  xxx();//static method
	  
	  
	  A aa = new A();
	  aa.xyz(); //default method
	
	  aa.i=2;
	 // aa.j=1;//not access this private var.
	  
	 
	}

}
