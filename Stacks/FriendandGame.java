import java.util.*;
public class Main
{
    
public static void fng(String str)
{
  String ans="";
  Stack<Integer>st=new Stack<>(); //creating object of stack
  for(int i=0;i<=str.length();i++) // condition for length of output
  {
st.push(i+1); //push karne wali values
char ch='D';
if(i<str.length()&& (str.charAt(i)-'0')%2==0)
ch='I';
//pop ki condition

if(i==str.length() || ch=='I')
{

    while(!st.isEmpty())
    {
        ans=ans+st.pop();
    }
}


  }
  System.out.println(ans);


}


public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
int tc=sc.nextInt();
while(tc-->0)
{

String input=sc.next();
fng(input);


}




}

}
