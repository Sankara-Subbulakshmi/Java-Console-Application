package corejava;

public class ThiskeywordDemo {

	int a=2; //class level var(global var)
	public void getData()
	{
		int a =3; //method variable. (local var)
		int b=a+this.a; //sum of global variable  and local variable
		System.out.println(a);
		System.out.println(this.a); //this keyword brings the value from the object level
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
	
		ThiskeywordDemo tt = new ThiskeywordDemo();
		tt.getData();
		
		
	}

}
//this keyword ->ties to current class object.it scope will be on the class level.so this refers to current object.
//not method level.