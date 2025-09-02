package corejavabrushup;

import corejava.B;
import corejava.A;
import corejava.ParentClass;

public class C extends ParentClass{

	public static void main(String[] args)
	{
		
		 B bb = new B(); //need to import corejava package.import corejava.B;
		 bb.abc();
		// bb.ggg(); even import we cant access it because it is not inherit. protected method.
	     //bb.i=2; never impossible don't  declare as a public var
		 bb.s=2;// public variable
		 
		 A aa = new A();
		 aa.ddd();
		 
		 C cc = new C();
		 cc.cvb(); //protected method
	     //cc.xyz(); //even import A class i other package we cant access that default method.
		
		
		
	}

}
