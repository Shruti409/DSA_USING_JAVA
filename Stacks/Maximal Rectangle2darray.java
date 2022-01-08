import java.util.*;
public class Main
{
    public static int histogram(int ht[])
    //step3 it will find bar of maximum area  in each histogram
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
    
     public static  int maximalRectangle(char[][] matrix)
     {
         int maxans=Integer.MIN_VALUE;
         int ht[]=new int[matrix[0].length]; //step1 create a histogram by iteration on each row of 2d array
         //ht[]={0,0,0,0,0}//default value will be zero
         for(int i=0;i<matrix.length;i++)
         {
             for(int j=0;j<matrix[0].length;j++)
             {
                 if(matrix[i][j]=='1')
                 ht[j]=ht[j]+1;//for i=0; ht[0]=1,ht[1]=0 ,ht[2]=1,ht[3]=0,ht[4]=0;
                 //ht[]={1,0,1,0,0} for first row
                 
                 else
                 ht[j]=0;
             }
             
             int area=histogram(ht); //step 2 call histogram function will will find bar with maxium area in each histogram
             maxans=Math.max(area,maxans);
         }
         
         return maxans;
         
     }
	public static void main(String[] args) {
	    int r,c;
	    Scanner sc=new Scanner(System.in);
	    r=sc.nextInt();
	    c=sc.nextInt();
	    char ch[][]=new char[r][c];
	    
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            ch[i][j]= sc.next().charAt(0); //character input in java
	        }
	    }
	    
	    int area=maximalRectangle(ch);
	    System.out.println(area);
	    
	}
}
