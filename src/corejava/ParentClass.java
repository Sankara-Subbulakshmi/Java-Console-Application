package corejava;

public class ParentClass {

	String color = "Red";
	
	public void gear()
	{
		System.out.println("gear code is implemented");	
	}	
	public void brakes()
	{
		System.out.println("brakes code is implemented");	
	}
	
	public void audiosystem()
	{
		System.out.println("Parentaudiosystem code is implemented");	
	}
	 protected void cvb()
	{
		System.out.println("I am a protected method");
		
	}
	public static void main(String[] args)
	{
		

		A aa = new A();
		
		aa.ddd();
		
		
		
	}

}
