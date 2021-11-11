package inheritance;

public class Cases {

	public static void main(String[] args) {
		//case1
		IronManV1 im1=new IronManV1();//parent reference and parent object
		im1.canFly();
		//parent can access all its methods and variables
		
		//case2
		
		IronManV2 im2=new IronManV2();//child reference and child object
		im2.canFly();
		//child can access all its parents methods and variables(except private),child's own methods and variables and overridden methods
		//also (priority is given to its local method in case of overriding)
		
		//case3
		IronManV1 suit=new IronManV2();
		suit.canFly();
		//child function will be called because object is of version 2 and function is called at run time
		suit.missiles();
		
		//suit.unibeam(); //it will give error because compiler dont know that at run time object of version 2 will be created 
		//we are creating reference of version1 so compiler will think object will be of version1 and there is no unibeam method in version 1
		//this is crucial case in this case we will not be able to write child's own variables and methods because method calling and object
		//creating take place at run time
		//only parent method and variables and overridden methods are accessible as compiler is not aware of child ka object
		
//preferred way
		//always preferred that create object and reference of child only as it will have most of the access
		//function overloading(Early Binding because decision of which function will be called is taken at compile time)
		//function overriding(Late binding because decision of which function will be called is taken after object creation i.e at run time)
	}

}
