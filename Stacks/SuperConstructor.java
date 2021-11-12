package inheritance;
class Car
{
	String company;

	//public Car(String comp)
	//{
		//company =comp;
		
		
	//}
	//public Car()
	//{
		//company ="xyz";
	//}
}

class Mercedes extends Car
{
	int price;
	public Mercedes(int price)
	{
		//super("abc");
		this.price=price;
		
	}
}
public class SuperConstructor {
	
	public static void main(String[] args) {
		Mercedes m=new Mercedes(20000000);
		System.out.println(m.company);
		
		
	}
	

}
