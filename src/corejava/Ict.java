package corejava;

public class Ict implements InterfaceConcept,InterfaceConcept1 {

	public static void main(String[] args) 
	{
		InterfaceConcept i = new Ict(); //1 st interface methods
	    i.greenGo();
	    i.redStop();
	    i.FlashYellow();
	    
	    InterfaceConcept1 i1 = new Ict(); //2 nd interface methods
	    i1.TrafficSymbol();  
	    
	    
	    Ict ii = new Ict();  // create object for using this class methods.
	    ii.walkonsymbol();
	    
	}

	@Override
	public void greenGo()
	{
		System.out.println("Greengo implementation");	
	}

	@Override
	public void redStop() 
	{
		System.out.println("RedStop implementation");		
	}

	@Override
	public void FlashYellow() 
	{
		System.out.println("FlashYellow implementation");	
	}
  public void walkonsymbol()
  {  
	  System.out.println("Walking");		
	  	
  }

@Override
public void TrafficSymbol()
{
	  System.out.println("Follow traffic rules");		
	
}

}
