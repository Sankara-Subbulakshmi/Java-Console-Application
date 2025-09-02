package corejava;

public class exceptionDemo {

	public static void main(String[] args) throws NullPointerException 
	{
	
		int i=8;
		int j=0;
		int arr[] = new int[4];
		String str = null;
		 
try
{	
	//ex in real life: Purchased fail
		//int k = i/j;  //java.lang.ArithmeticException
	System.out.println(arr[7]);
}
catch(ArithmeticException ae) 
{
	System.out.println("I catched the Arithimeticexception");
	
}
catch(IndexOutOfBoundsException aes)
{
	System.out.println("I catched the Indexboundexception");
	
}

catch(Exception e)  //general Exception(accept all kind of exception)
{
	//retry again
		System.out.println("I catched the error/exception");
}
finally
{
	System.out.println("delete cookies");
	
}

	}

}
