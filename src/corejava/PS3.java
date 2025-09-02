package corejava;

public class PS3 extends PS4
{
    int a; //class variable
	public PS3(int a) //instance variable , scope of this instance var lying inside the block. 3 sending tc to constructor.
	{ 
	   super(a); //parent class constructor is invoked.(executed) because skip object creation for PS4 Pass var so activate a variable use super keyword
		this.a = a ;//(assigning inst var a to own class var a use this keyword )
		//ps2 class var to another ps3 class local var
	}

	public int increment()
	//public int increment(int a)
	{
		a=a+1;
		return a;
		
	}
	public int decrement()
	//public int decrement(int a)
	{
		a=a-1;
		return a;
		
	}
}
