package stackquestions;
import java.util.*;
public class NextGreaterElement {
	
public static void main(String[] args) {
		
		int ht[]= {7,1,2,1,3,5};
		Stack<Integer>st=new Stack<>();
		st.push(ht[0]);//push first element in stack
		for(int i=1;i<ht.length;i++)//iterating all the array
		{
			while(!st.isEmpty()&&st.peek()<ht[i]) //pop karne ki condition jab tak stack empty na ho jaye ya current se bda koi element na mil jaye
			{
				System.out.println(st.pop()+" ka nge"+ ht[i]);
			}
			
			st.push(ht[i]);//pop krne ke baad current element ko stack mei push kardo
		}
		while(!st.isEmpty())//agr still stack empty  ni hai jo elements bach gye unka nge -1 hai
		{
			System.out.println(st.pop()+" ka nge"+ -1);
			
		}

}
}
