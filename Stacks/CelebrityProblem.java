import java.util.*;
public class Main
{
    public static int celeb(int M[][])
    {
Stack<Integer> st=new Stack<>();
for(int i=0;i<M.length;i++)
{
	st.push(i); // saare elements ko stack mei push krdo phele (0,1,2,3.....)

}
//while loop for elimination of candidates jo celebrities nhi ho sakte and selection of potential candidate.

while(st.size()!=1) //jab tak stack mei sirf ek element ni reh jata tab tk do elements
//pop kro and check for celebrity condition.
{
	int banda1=st.pop();
	int banda2=st.pop();

	if(M[banda1][banda2]==1)
	{
		//agr banda 1 banda 2 ko janta hai to banda 1 celebrity ni ho sakta 
		//so will push banda2 in stack back 
		st.push(banda2);

	}

	else{
//banda 1 banda2 ko nhi janta so banda 2 kabhi celebrity ni ho sakta
//push banda1 in stack back
st.push(banda1);

	}
}

int potentialcandidate=st.pop();//jo banda last mei stack mei reh jayega wo celebrity
//ho sakta hai but we have to check two conditions

//condition1 :celebrity kisi ko nhi janta 
//so its row should be all zero
for(int i=0;i<M.length;i++)
{
	if( (M[potentialcandidate][i]!=0 ) || (potentialcandidate!=i && M[i][potentialcandidate]!=1 ))
	 //agar potentialcandidate kisi ko bhi janata hai wo celeb nhi ho sakta
	 {
		
		 return 0;
	 }
}
//conditin2 : celeb ko sab jante ho except itself
//its columns should be 1
//for(int i=0;i<M.length;i++)
//{
//	if(potentialcandidate!=i && M[i][potentialcandidate]!=1)
//	{
//		System.out.println("No Celebrity");
//		 return;

//	}
//}
//agr sari condition satsify ho gyi thn print potentialcandidate.

return potentialcandidate;
        
        
        
    }
	public static void main(String[] args) {
	     Scanner s=new Scanner(System.in);
int n=s.nextInt();
int M[][]=new int[n][n];
for(int i=0;i<n;i++){
 for(int j=0;j<n;j++){
M[i][j]=s.nextInt();}} 
int potentialcandidate=celeb(M);
if(potentialcandidate!=0)
System.out.println(potentialcandidate);
else
 System.out.println("No Celebrity");

	
	}
}
