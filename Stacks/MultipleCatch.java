package ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		try
		{
			System.out.println("Try mei wo statements likho jha se exception aa skti ho");
			int a[]= {1,3,7,8};
			System.out.println(a[7]);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont use divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Shi array index do");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Shi string index do");
		}
		
System.out.println("kr li handle exception");
	}

}
