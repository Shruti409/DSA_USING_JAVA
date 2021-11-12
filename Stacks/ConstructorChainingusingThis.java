package inheritance;
class Student
{
	String name;
	int rollno;
	public Student()
	{
		//constructor call must be first line .
		this("honey",444);
		System.out.println(" non parametrized constructor called");
		name="shruti";
		rollno=77;
		
	}
public Student(String name,int roll)
{
	
	System.out.println("parametrized constructor called");
	
	this.name=name;
	this.rollno=roll;
	
}
}

public class ConstructorChainingusingThis {

	public static void main(String[] args) {
		
Student s1=new Student();
System.out.println(s1.name);
System.out.println(s1.rollno);

   
	}

}
