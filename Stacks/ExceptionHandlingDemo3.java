package ExceptionHandling;

public class ExceptionHandlingDemo3 {

	public static void assistant(int lines) throws Exception
	{
		System.out.println("Suno employees ek project bna k do");
		employees(3000);
	}
	public static void  employees(int lines) throws Exception
	{
		if(lines>2500)
		{
		throw new Exception("Hum nhi krenge");
		}
	}
	public static void main(String[] args) throws Exception {
		
System.out.println("Suno assistant ek project bnwao");

assistant(3000);

System.out.println("Hello");

}	}
