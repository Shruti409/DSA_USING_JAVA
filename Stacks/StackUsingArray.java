package Stacks;
public class StackUsingArray {
	
	int arr[];
	int tos;
	public StackUsingArray()
	{
		this.arr=new int[5];//default capacity of stack is 5
		this.tos=-1;
		
	}
	public StackUsingArray(int capacity)
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
public void push(int value)
{
	if(isFull())
	{
		System.err.println("Stack is full");
		return;
	}
	this.tos++;
	this.arr[tos]=value;
}
public int pop()
{
	if(isEmpty())
	{
		System.err.println("Stack is Empty");
		return -1;
	}
	int temp=this.arr[tos];
	this.arr[tos]=0;
	this.tos--;
	return temp;
}
public int peek()
{
	if(isEmpty())
	{
		System.err.println("Stack is Empty");
		return -1;
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
	public static void main(String[] args) {
		StackUsingArray st=new StackUsingArray(5);
		System.out.println(st);//it will print address 
		System.out.println(st.size());//it will print size of stack (0)
		System.out.println(st.isEmpty()); // true
		System.out.println(st.isFull()); //false
		st.push(12);
		System.out.println(st.size());//1
		System.out.println(st.isEmpty());//false
		System.out.println(st.isFull());//false
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(11);
		st.pop();
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		st.pop();
		System.out.println(st.isEmpty());
		st.push(566);
		st.push(6);
		System.out.println(st.peek());
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st.peek());
		System.out.println(st.size());
		System.out.println(st.isFull());
		st.display();
		System.out.println(st.pop());
		st.display();
		System.out.println(st.peek());
		System.out.println(st.size());
	}

}
