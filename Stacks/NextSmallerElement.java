package stackquestions;
import java.util.*;
public class NextSmallerElement {

	public static void main(String[] args) {
		int arr[]= {7,1,2,1,3,0};
		int nse[]=new int[arr.length];
		Stack <Integer>st=new Stack<>();
		st.push(0);//first index in stack
		for(int i=1;i<arr.length;i++)
		{
			while(!st.isEmpty()&& arr[st.peek()]>arr[i])
			{
				nse[st.pop()]=arr[i];
			}
			
			st.push(i);
		}
		
		while(!st.isEmpty())
		{
			nse[st.pop()]=-1;
		}
		
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]+" ka nse "+nse[i]);
}
	}

}
