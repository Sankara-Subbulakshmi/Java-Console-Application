package corejava;

public class FinalDemo {

	final void getData()
	{
		
		//not overridden to sub child class.
		
	}
	public static void main(String[] args) 
	{
         // int i=9;
         // i=8;
		
		final int i= 9; //constant var.
		//i=8;
		
		//declare final var -> can't change the value of the variable.
		//declare final class ->can't use that as a parent to any other class,not inherit
		//declare final method ->can't override this method again //restricting access
		
	}

}
