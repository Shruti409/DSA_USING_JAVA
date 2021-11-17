package stackquestions;
import java.util.*;
public class PreviousGreatestElement {

	public static void main(String[] args) {
		int ht[]= {0,1,2,1,3,7};
		int pge[]=new int[ht.length];
		Stack<Integer>st=new Stack<>();
		pge[0]=-1;//first elemnt ka pge always -1 hoga 
		st.push(0);//pushing 0 index in stack
		for(int i=1;i<ht.length;i++) //iterating on remaining buildings
		{
			while(!st.isEmpty()&&ht[st.peek()]<=ht[i])//jab tak stack khali na ho aur top of stack current se chota ya uske equal ho tab tk pop kro
			{
				st.pop();
				
				
			}
			if(!st.isEmpty()) {
			pge[i]=ht[st.peek()];
			
		}
			else
			{
				pge[i]=-1;
			}
			st.push(i);
	}
	
		System.out.println(Arrays.toString(pge));
	
	
	}

}
