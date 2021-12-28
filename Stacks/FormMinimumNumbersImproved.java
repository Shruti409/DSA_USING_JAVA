import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    	int n=sc.nextInt();
	String []str=new String[n];
		//String str=sc.next();
	
		Stack<Integer>st=new Stack<>();
		for(int j=0;j<n;j++){
		    str[j]=sc.next();
		for(int i=0;i<=str[j].length();i++)
		{
		    st.push(i+1);
		    if(i==str[j].length()|| str[j].charAt(i)=='I'){
		        while(!st.isEmpty()){
		            System.out.print(st.pop());
		        }
		    }
		}
		System.out.println();
		}
		
	}
}
