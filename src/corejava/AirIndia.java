package corejava;

public class AirIndia extends ParentAirCraft
{

public static void main(String[] args) 
{
	AirIndia ai = new AirIndia();
	ai.bodycolor();
	ai.engine();
	ai.safetyGuidelines();
  
	// can not create object(instantiate)abstract clss object. ParentAirCraft

}

@Override
public void bodycolor()
{
	
 System.out.println("Red color on the body");
}
	
	
}
