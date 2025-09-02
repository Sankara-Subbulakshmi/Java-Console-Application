package corejava;

public class ChildDemo extends ParentDemo{

	String name ="Keerthana";
	
	
   public ChildDemo() {
		super(); //invoke parent class methods & var.
		System.out.println("child class construtor");
	}

	public void getStringdata()
	{
	System.out.println(name);
	System.out.println(super.name);
	}
   public void getData()
   {
		super.getData();
	   System.out.println(" I am getting data from child class");	   
   }
	
	public static void main(String[] args) 
	
	{
		ChildDemo cc = new ChildDemo();
		cc.getData(); 
		cc.getStringdata();
	    System.out.println(son);

	}

}
