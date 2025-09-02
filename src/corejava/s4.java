package corejava;

public class s4 {

	String address; 
	String name;//instance var used non static method
    static String city; //static or class var used static or class method
    s4(String nn) // local var
    {
           this.name=nn;
           System.out.println(name);
    }
    
    public static void aaa()
    {
    	System.out.println(city);
    }
	public void bbb()
	{
		
		System.out.println(address);	
	}
	public static void main(String[] args) 
	{
	    
		s4 ss1 = new s4("chennai");
		s4 ss2 = new s4("Banglore");
		s4 ss3 = new s4("Pune");
		ss1.bbb();
		ss2.bbb();
		ss3.bbb();
		
		
		
		

	}

}
