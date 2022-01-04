import java.util.*;
public class Main
{
    public static int[] pse(int arr[])
    {
       int ans[]=new int [arr.length];
       Stack<Integer> st=new Stack<>();
       st.push(0);
       ans[0]=-1;
       for(int i=1;i<arr.length;i++)
       {
           while(!st.isEmpty()&& arr[i]<=arr[st.peek()])
           {
               st.pop();
           }
           
           if(!st.isEmpty())
           {
               ans[i]=arr[st.peek()];
           }
           
           else{
               ans[i]=-1;
           }
           
           st.push(i);
          
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
int ans[]=pse(arr);

for(int i=0;i<n;i++)
{
    System.out.println(ans[i]);
}

	}
}
