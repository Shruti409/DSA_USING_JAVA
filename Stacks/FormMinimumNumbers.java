import java.util.*;
public class Main
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
String str=sc.next();
Stack<Integer>st=new Stack<>();

for(int i=0;i<=str.length();i++)//condition for pushing
{
	st.push(i+1);
	if(i==str.length()||str.charAt(i)=='I')//pop karne ki condition
	{
		while(!st.isEmpty()) {
		System.out.print(st.pop());
		}
	}
	
}

	}

}
