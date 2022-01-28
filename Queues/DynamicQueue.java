package queue;



public class DynamicQueue extends QueueUsingArrays {
	public void enqueue(int item)throws Exception
	{
		// if queue is full create double size array
		if(this.size==data.length) {
			int[] newdata=new int[2*data.length];
			//copy the data of previous queue to this new queue
			for(int i=0;i<data.length;i++)
			{
				int index=i+front;
				index=index%data.length;
				newdata[i]=data[index];
				
				//change the reference of newdata
				
			}
			
			data=newdata;//data will refer to newdata
			front=0;
			
		}
		super.enqueue(item);
		
	}

	public static void main (String[] args)throws Exception {
		
		DynamicQueue qq=new DynamicQueue();
		qq.enqueue(10);
		qq.enqueue(20);
		qq.enqueue(30);
		qq.display(); //10 20 30 0 0
		System.out.println();
		System.out.print(qq.dequeue()); //10
		qq.enqueue(40);
		qq.enqueue(50);
		System.out.println();
		System.out.println(qq.dequeue());//20
		qq.enqueue(60);
		qq.enqueue(70);
		
		qq.display();//30 40 50 60 70
		System.out.println();
		System.out.println(qq.getFront());//30
		qq.enqueue(70);
		qq.enqueue(70);
		qq.enqueue(70);
		qq.enqueue(70);
		qq.display();
		
		
	}

		

	}

