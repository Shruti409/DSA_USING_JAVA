import java.util.*;
public class Main
{
    public static int[] span(int ht[])
    {
        Stack<Integer>st=new Stack<>();
        st.push(0);
        int arr[]=new int[ht.length];
        arr[0]=1;
        for(int i=1;i<ht.length;i++)
        {
           while( !st.isEmpty()&& ht[st.peek()]<ht[i])
            {
                st.pop();
            }
            if (st.isEmpty())
            {
                arr[i]=i+1;
                st.push(i);
            }
            else{
            arr[i]=i-st.peek();
            st.push(i);
        }
        }
        
        return(arr);
        
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
	int ans[]=span(ht);
	for(int i=0;i<n;i++)
	{
	    System.out.println(ans[i]);
	}
	}
}
