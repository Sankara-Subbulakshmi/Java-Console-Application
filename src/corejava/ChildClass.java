package corejava;

public class ChildClass extends ParentClass{
   
	public void enhancedengine()
	{
		System.out.println("new engine code is implemented");		
	}
	
	public void color()
	{
		
		System.out.println(color);		
	}	
		
	public void audiosystem()  //function overriding
	{
		System.out.println("childaudiosystem code is implemented");	
	}
	public void getVehicleData(int a) //function overloading
	{
		System.out.println(a);		
	}
	public void getVehicleData(String a) //function overloading
	{
		System.out.println(a);		
	}
	public void getVehicleData(int a,int b) //function overloading
	{
		System.out.println(b);		
	}
	
	public static void main(String[] args)
	{
	
		ChildClass cc = new ChildClass();
		cc.gear();
		cc.brakes();
		cc.audiosystem();
		cc.color();
		cc.enhancedengine();
		cc.getVehicleData(5);
		cc.getVehicleData("nameboard");
		cc.getVehicleData(9, 8);
		cc.cvb();
		
	}

}
