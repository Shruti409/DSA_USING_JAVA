package ExceptionHandling;

public class Demo2 {

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
	public static void main(String[] args) {
		
System.out.println("Suno assistant ek project bnwao");
try {
assistant(3000);}
catch(Exception e)
{
	System.out.println(e.getMessage());
	System.out.println("Gyi teri naukri");
}

		
	}

}
