package Stacks;

public class DynamicStack extends StackUsingArrayModified {
	
	public void push(int value) throws Exception
	{
				if(isFull())
				{
					//resizing i.e increasing capacity
					int newarr[]=new int[arr.length*2];//creating new array
					for(int i=0;i<arr.length;i++)
					{
						newarr[i]=arr[i];
					}
					arr=newarr;
					
					
				}
		super.push(value);
	}

	public static void main(String[] args) throws Exception{
		DynamicStack ds=new DynamicStack();
		for(int i=0;i<45;i++)
		{
			ds.push(i);
		}
		ds.display();
	}

}
