package Stacks;
import java.util.Stack;

public class JavaStacks {

	public static void main(String[] args) {
		Stack<Integer>st =new Stack<>();
		//st.pop(); it will throw run time exception
		if(!st.isEmpty())
		{
			st.pop();
		}
		
		st.push(10);//insert element in stack
		st.push(20);
		st.push(30);
		System.out.println(st);//print stack 
		System.out.println(st.peek());//it will return top most element of stack
		st.pop();//remove  and return topmost element of stack
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.isEmpty());// return true if stack is empty
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.isEmpty());
		st.push(10000);
		System.out.println(st);
		

	}

}
