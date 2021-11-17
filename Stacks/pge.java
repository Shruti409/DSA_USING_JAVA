import java.util.*;
public class Main {

	public static void main(String[] args) {
		//int ht[]= {0,1,2,1,3,7};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ht[]=new int[n];
for(int i=0;i<n;i++)
{
    ht[i]=sc.nextInt();
}
		int pge[]=new int[ht.length];//pge array maintain
		Stack<Integer>st=new Stack<>();
		pge[0]=-1;//first elemnt ka pge always -1 hoga 
		st.push(0);//pushing 0 index in stack
		for(int i=1;i<ht.length;i++) //iterating on remaining buildings
		{
			while(!st.isEmpty()&&ht[st.peek()]<=ht[i])//jab tak stack khali na ho aur top of stack current se chota ya uske equal ho tab tk pop kro
			{
                //mera pge kon hai?
                //agr mera pge nhi hai to pop krdo
				st.pop();
        
        		
			}
			if(!st.isEmpty()) {
			pge[i]=ht[st.peek()]; //current ka pge top of stack index ka element hoga
			
		}
			else
			{
				pge[i]=-1; //agr stack empty hai to current element ka pge -1
			}
			st.push(i);//after finding pge pushing current element in stack
	}
	
		System.out.println(Arrays.toString(pge)); //tostring method to print arrayin string form
	
	
	}

}
