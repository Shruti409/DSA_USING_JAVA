package ExceptionHandling;

public class ExceptionHandlingDemo4 {

	public static void assistant(int lines) throws Exception
	{
		System.out.println("Suno employees ek project bna k do");
		employees(3000);
	}
	public static void  employees(int lines) throws Exception
	{
		try {
		if(lines>2500)
		{
		throw new Exception("Hum nhi krenge");
		}
		}
		catch(Exception e)
		{
			System.out.println("Hum mil ke kr lenge yrr");
		}
		
		System.out.println("sab moh maya hai");
	}
	public static void main(String[] args) throws Exception {
		
System.out.println("Suno assistant ek project bnwao");

assistant(3000);

System.out.println("Hello");

}	}

