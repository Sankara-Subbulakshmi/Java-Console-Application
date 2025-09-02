package corejava;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS1 
{
 //methods , variables

	public void dothis()
	{
		System.out.println("I am Here");
		
	}
	
	@BeforeMethod()
	public void beforeRun()
	{
		
		System.out.println("Run me first");
	}
	
	@AfterMethod()
	public void afterRun()
	{
	
		System.out.println("Run me last");
		
	}
	
	
}
