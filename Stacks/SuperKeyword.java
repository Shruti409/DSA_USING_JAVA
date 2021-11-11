package inheritance;

public class SuperKeyword  extends IronManV2{
	
	public void canFly()
	{
		System.out.println("i can fly");
		super.canFly();
		
	}
public static void main(String[] args){
		
	SuperKeyword s=new SuperKeyword();
	s.canFly();


}

}
