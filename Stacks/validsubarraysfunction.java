import java.util.*;
public class Main
{
    public static int  validsubarrays(int a[])
    {
        int nse[]=new int[a.length];
        Stack<Integer>st=new Stack<>();
        st.push(0);
        for(int i=1;i<a.length;i++)
        {
            while(!st.isEmpty() && a[i]<a[st.peek()])
            {
                nse[st.pop()]=i;
            }
            
            st.push(i);
        }
        while(!st.isEmpty())
        {
             nse[st.pop()]=a.length;
        }
        
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+nse[i]-i;
        }
        return sum;
        
        
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    
	    int ans=validsubarrays(a);
	    System.out.println(ans);
		
	}
}
