package corejava;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class PS2 extends PS1
{
	
	/*public static void main(String[] args)
	{
	    PS1 ps1 = new PS1();
	    ps1.dothis();	
	}*/
	
	//Use TestNG
	/*@BeforeMethod()
	public void beforeRun()
	{
		
		System.out.println("Run me first");
	}*/
//calling methods from other classes (inheritance ,  create object)
	@Test
	public void testRun()
	{

		
		dothis();//parent class method
		PS3 ps3 = new PS3(3); //create constructor for PS3
		//int a=65;
		System.out.println(ps3.increment());
		System.out.println(ps3.decrement());
		
		//System.out.println(ps3.increment(3));
		//System.out.println(ps3.decrement(3));

		
		//PS4 ps4 = new PS4(3); // create constructor for PS4 (pass 3 or a var)
		//System.out.println(ps4.multiplyTwo());
		//System.out.println(ps4.multiplyThree());
		
		//PS4 ps4 = new PS4(3); // by inheritance no need to create object
		System.out.println(ps3.multiplyTwo()); //by inheritence
		//System.out.println(ps3.multiplyThree()); //by inheritence
		
		
	
	}
	
	
	
	}


