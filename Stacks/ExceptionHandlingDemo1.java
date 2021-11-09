package ExceptionHandling;

public class ExceptionHandlingDemo1 {

	public static void assistant(int lines)
	{
		System.out.println("Suno employees ek project bna k do");
		try {
		employees(3000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Chalo mai hi bna leta hu nhi to naukri gyi");
		}
	}
	public static void  employees(int lines) throws Exception
	{
		if(lines>2500)
		{
		throw new Exception("Hum nhi krenge");
		}
	}
	
	public static void main(String[] args) { //supervisor
		
System.out.println("Suno assistant ek project bnwao");
assistant(3000);
System.out.println("Assistent bhai tera promotion");
	}

}
