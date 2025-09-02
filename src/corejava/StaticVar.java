package corejava;

public class StaticVar {

    String name;   //instance var  //3
    String address; //instance var
   //static String city ="Banglore"; //static var
    static String city;
   // static int i = 0;  //static var [update existing value]
    static int i;
   // int i = 0; //not sharing, so call as instance var. [every time instantiated freshly with zero.]

	//instead of wasting a lot of memory on heap sapace use common thing & have one copy,all object refer to the same copy.use static keyword.
  
    //static block(initialize all static var & methods)
   static 
    {
    	String city ="Banglore";
    	 int i = 0;
    	
    }
    
    StaticVar(String name ,String add) //local var (scope is inside bloak only) //2
    {
    	this.name = name; 
    	this.address=add;   // Assign local var to instant var[this refers to current class instance var	
    	i++;
    	System.out.println(i);
    	
    }
                 
	
	public void getAddress()
	{	
		System.out.println(address+" "+city);	
	}
	public static void getCity()
	{
		System.out.println(city);	
	}
		

	public static void main(String[] args) 
	{

		StaticVar sv = new StaticVar("Sri","tvknagar");  //1  creating instance or object are same
		StaticVar sv1 = new StaticVar("sunil","bobnagar");
		StaticVar sv2 = new StaticVar("sunil","bobnagar"); //need not call any method.constructor do this
		sv.getAddress();
		sv1.getAddress();
		StaticVar.getCity(); //all static methods can be directly accessed with class name.method name 
		StaticVar.i=4;
		sv.address ="xxxx"; //non static method 
	}

}
//send value from main method[ to assign local var to instance var.]
// send value main method to constructor , from constructor use this operator to assign  instance var.
//instance var tied up to the object.