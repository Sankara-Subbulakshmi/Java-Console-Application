 package corejava;

public class A {

	void xyz() //access anywhere in package.
	{
		System.out.println("I am a default method");
			
	}
	int i;
	private int j;
	
	private void sdf()
	{
		System.out.println("I am a Private method");
	}
	
	
	
	
public void ddd()
{
	System.out.println("I am a public method");
}
	
	public static void main(String[] args) 
	{
	
		  B bb = new B(); //creating an object of other class.
		  bb.abc(); //this happens only both are in same package.need not import.          System.out.println(bb.s);
           B.xxx();//static method
          
          
         A aa = new A();
         aa.ddd();
         aa.xyz();//default method
        
		  A cc = new A();
		  cc.j=5; //private var access within the class only.
		  cc.sdf();//private method access within the class only.
		  
	}




	

	//default :Access method anywhere only in package.
	//public : declare variable or method asa  public will have access across all the packages(everywhere)
	//Private : declare variable or method as a private can't access outside the class of same package as well.
	
	
	
	
	
	
}
