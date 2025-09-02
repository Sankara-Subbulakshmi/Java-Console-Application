package corejava;

public abstract class ParentAirCraft 
{
//Abstract class
public void engine()
{
 System.out.println("Follow engine Guidelines");	
}


public void safetyGuidelines()
{
	System.out.println("Follow Safety Guidelines");	

}

public abstract void bodycolor();
	
// private modifier is not allowed for the methods defined in abstract class. private void safetyGuidelines()
//use public or protected then can inherit parent class properties.
	
	
}
