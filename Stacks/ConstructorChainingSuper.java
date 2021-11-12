package inheritance;
 class Animal
{
	 String name;
	 int age;
	 
	Animal()
	{
		System.out.println("Animal constructor");
		name="Buzo";
		age=4;
		
		
	}
}
 class Dog extends Animal
{
	Dog(){
		super();
		System.out.println("Dog constructor");
	}
}
public  class ConstructorChainingSuper {

	public static void main(String[] args) {
		Dog d =new Dog();
		System.out.println(d.name);
		System.out.println(d.age);
		

	}

}
