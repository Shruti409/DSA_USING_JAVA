package stackquestions;

import java.util.Stack;

public class NumberOfValidSubarrays {

	public static void main(String[] args) {
		int arr[]= {1,4,2,5,3};
		int nse[]=new int[arr.length];
		Stack <Integer>st=new Stack<>();
		st.push(0);//first index in stack
		for(int i=1;i<arr.length;i++)
		{
			while(!st.isEmpty()&& arr[st.peek()]>arr[i])
			{
				nse[st.pop()]=i;
			}
			
			st.push(i);
		}
		
		while(!st.isEmpty())
		{
			nse[st.pop()]=arr.length;
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=nse[i]-i;
		}
System.out.println(sum);
	}

}
