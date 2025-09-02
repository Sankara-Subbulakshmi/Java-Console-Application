package corejava;

public class DaughterDemo extends MotherDemo{

	String name ="Java";
	public DaughterDemo() //super keyword use in constructor
	{
		super();//invoke mother class constructor(super brings the value from mother class)
		System.out.println("Daughter Constructor");
		
	}
	public void getStringData()
	{
		System.out.println(super.name); //super use in variable
		System.out.println(super.a);
	}
	
	public void course()
	{
		super.course(); // super use in method
		System.out.println("Get Free Javacourse certification");
	}
	
	public static void main(String[] args)
	{
	
		DaughterDemo dd = new DaughterDemo();
        dd.getStringData();
        dd.course();
	}

}

//in case of same variable defined in child class,
//To differentiate between parent variable & child variable use super keyword.