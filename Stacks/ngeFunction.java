import java.util.*;
public class Main
{
    public static int[] nge(int arr[])
    {
       int ans[]=new int [arr.length];
       Stack<Integer> st=new Stack<>();
       st.push(0);
       for(int i=1;i<arr.length;i++)
       {
           while(!st.isEmpty()&& arr[i]>arr[st.peek()])
           {
               ans[st.pop()]=arr[i];
           }
           st.push(i);
       }
        while(!st.isEmpty())
        {
            ans[st.pop()]=-1;
            
        }
        
        return(ans);
    }
	public static void main(String[] args) {
	    int n;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
int ans[]=nge(arr);

for(int i=0;i<n;i++)
{
    System.out.println(ans[i]);
}

	}
}
