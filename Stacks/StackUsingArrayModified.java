package Stacks;

public class StackUsingArrayModified {
	
	int arr[];
	int tos;
	public StackUsingArrayModified()
	{
		this.arr=new int[5];//default capacity of stack is 5
		this.tos=-1;
		
	}
	public StackUsingArrayModified(int capacity)
	{
		this.arr=new int[capacity];
		this.tos=-1;
	}
	
public int size()
{
	return this.tos+1;
}
public boolean isEmpty()
{
	return this.size()==0;
}
public boolean isFull()
{
	return this.size()==arr.length;
}
public void push(int value) throws Exception
{
	if(isFull())
	{
		throw new Exception("Stack is already full");
	}
	this.tos++;
	this.arr[tos]=value;
}
public int pop() throws Exception
{
	if(isEmpty())
	{
		throw new Exception("Stack is empty");
	}
	int temp=this.arr[tos];
	this.arr[tos]=0;
	this.tos--;
	return temp;
}
public int peek() throws Exception
{
	if(isEmpty())
	{
		throw new Exception("Stack is empty");
	}
	int temp=this.arr[tos];
	return temp;
	
}
public void display()
{
	for(int i=tos;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
	
	

	public static void main(String[] args) throws Exception{
		
		StackUsingArrayModified st=new StackUsingArrayModified(5);
		st.push(10);
		st.push(20);
		st.push(30);
		st.display();
		System.out.println(st.peek());
	st.push(40);
	st.push(50);
	st.push(60);
	System.out.println(st.peek());
	st.display();
	}

}
