package queue;

public class QueueUsingArrays {
	int data[];
	int front;
	int size;
	public QueueUsingArrays(){
		this.data=new int[5];//default capacity for queue is 5 
		this.front=0;
		this.size=0;
	}
public QueueUsingArrays(int n)
{
	this.data=new int[n]; //user will give size of queue
	this.front=0;
	this.size=0;
}
//to add elements in queue
public void enqueue(int value) throws Exception
{
	//data[size]=value  wrong because on deletion the size will decrease and will result in overwriting .
	if(size==this.data.length)
	{
		throw new Exception("Queue full hai");
	}
	int index=front+size;
	//to make queue a circular queue
	index=index%data.length;
	
	data[index]=value;
	size++;
}

public int dequeue() throws Exception
{
	if(this.isEmpty())
	{
		throw new Exception("Queue Khali hai");
	}
	
	int temp=data[front];
	data[front]=0;
	size--;
	front++;
	front=front%data.length; // to make circular queue
	return temp;
}
public boolean isEmpty() {
	return this.size==0;
	
}

//display queue
public void display()
{
	for(int i=0;i<data.length;i++)
	{
		int index=front+i;
		index=index%data.length;
		System.out.print(data[index]+" ");
	}
}
public int getFront() throws Exception
{
	if(this.isEmpty())
	{
		throw new Exception("Queue khali hai");
	}
	int ans=data[front];
	return ans;
}
	public static void main(String[] args) throws Exception{
		
		QueueUsingArrays q=new QueueUsingArrays();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display(); //10 20 30 0 0
		System.out.println();
		System.out.print(q.dequeue()); //10
		q.enqueue(40);
		q.enqueue(50);
		System.out.println();
		System.out.println(q.dequeue());//20
		q.enqueue(60);
		q.enqueue(70);
		
		q.display();//30 40 50 60 70
		System.out.println();
		System.out.println(q.getFront());//30
		
		
	}

}
