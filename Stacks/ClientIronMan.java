package inheritance;
public class ClientIronMan {

public static void main(String[] args){
		
		IronManV2 im2=new IronManV2();
		System.out.println(im2.hands);
		im2.canFly();
		IronManV1 im1=new IronManV1();
		im1.canFly();
im2.missiles();
im2.unibeam();


}
}
