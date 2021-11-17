package stackquestions;

import java.util.Arrays;
import java.util.Stack;

public class HistogramMaxiumArea {

	public static void main(String[] args) {
		
		int arr[]= {2,1,5,6,2,3};
		//nse array(index array)
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
		
		//pse array (index array)
		
		int pse[]=new int[arr.length];
	st=new Stack<>();
		pse[0]=-1;//first element ka pse -1 always
		st.push(0); //pushing 0 index in stack
		
		for(int i=1;i<arr.length;i++)
		{
			//mera pse kon hai? jo mera pse nhi hai usko pop krdo
			//jab tak current ka pse nhi mil jata aur stack empty ni ho jata tab tk pop kro
			//rukna kab hai jab pse mil jaye
			while(!st.isEmpty()&&arr[st.peek()]>=arr[i])
			{
				st.pop();//pop krdo
			}
			
			
			if(!st.isEmpty())
			pse[i]=st.peek();//  agar stack khali nhi hai to current ka pse tos pe jo element hai wo ahi
			
			else
				pse[i]=-1;//agr stack empty hai to current ka pse -1 hai
			
			st.push(i);//current ka pge nikalne  k baad usko stack mei push kardo
		}
		
		
		System.out.println(Arrays.toString(nse));
		System.out.println(Arrays.toString(pse));
		
		int maxArea=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++)//har bar ko iterate 
		{
			int area= (nse[i]-pse[i]-1)*arr[i];    
			//har bar ka area jha tk wo expand kr ske using nse and pse
			maxArea=Math.max(maxArea, area);
		}
		System.out.println(maxArea);
	}

}
