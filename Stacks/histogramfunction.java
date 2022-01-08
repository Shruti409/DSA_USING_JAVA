import java.util.*;
public class Main
{
    public static int histogram(int ht[])
    
    {
        //Nse
        int nse[]=new int[ht.length];
        int pse[]=new int[ht.length];
        Stack <Integer>st=new Stack<>();
		st.push(0);//first index in stack
		for(int i=1;i<ht.length;i++)
		{
			while(!st.isEmpty()&& ht[st.peek()]>ht[i])
			{
				nse[st.pop()]=i;
			}
			
			st.push(i);
		}
		
		while(!st.isEmpty())
		{
			nse[st.pop()]=ht.length;
		}
       //pse 
       pse[0]=-1;//first element ka pse -1 always
		st.push(0); //pushing 0 index in stack
		
		for(int i=1;i<ht.length;i++)
		{
			//mera pse kon hai? jo mera pse nhi hai usko pop krdo
			//jab tak current ka pse nhi mil jata aur stack empty ni ho jata tab tk pop kro
			//rukna kab hai jab pse mil jaye
      
      while(!st.isEmpty()&&ht[st.peek()]>=ht[i])
			{
				st.pop();//pop krdo
			}
			
			
			if(!st.isEmpty())
			pse[i]=st.peek();//  agar stack khali nhi hai to current ka pse tos pe jo element hai wo ahi
			
			else
				pse[i]=-1;//agr stack empty hai to current ka pse -1 hai
			
			st.push(i);//current ka pge nikalne  k baad usko stack mei push kardo
		}
		
		int maxarea=Integer.MIN_VALUE;
		for(int i=0;i<ht.length;i++)
		{
		    int area = ht[i] * (nse[i] - pse[i] - 1);
		    maxarea=Math.max(area,maxarea);
		}
        return maxarea;
    }
    
	public static void main(String[] args) {
	    int n;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    int ht[]=new int[n];
	    
	    for(int i=0;i<n;i++)
	    {
	        ht[i]=sc.nextInt();
	    }
	    int area=histogram(ht);
	    
	    System.out.println(area);
		
	}
}
