package corejava;

public class BBB extends AAA
{
    int r=20;
    int a=50;
    
    public BBB(int i)
    {
    super();
    
    System.out.println(this.a = i);
    	
    }
    
    public int ADDITION()
    {
    	r = r+1;
    	return r;
    }
    
	public int add(int r)
	{
		r = r+1;
		//r = this.r +1;
		System.out.println(r);
		return r;

	}
	
	
public static void main(String[] args)
{

	AAA aa = new AAA(); // object create return method
	//System.out.println(aa.sum(6, 8));
	System.out.println(aa.name("sample"));
	

	//without create object use extends inherit parent class properties
	System.out.println(sum(6, 8));

	
	//BBB bb = new BBB();
	//bb.add(90);
	
	BBB obj1 = new BBB(67);
	obj1.ADDITION();
}
	
	
	
}
