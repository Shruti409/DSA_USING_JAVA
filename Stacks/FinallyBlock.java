package ExceptionHandling;
public class FinallyBlock {
		public static void main(String[] args) {
		int x;
		try
		{
			x=9/4;
			System.out.println(x);
			return;
		}
		catch(Exception e)
		{
			System.out.println("Handled"); 
		}
		finally
		{
			System.out.println(" mai to chalunga hi chalunga beshk return marlo"); //it will execute despite of return statement
		}
		System.out.println("hiiiiiiii"); // it will not execute because of return statement
	}
}
