import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int heightarr[]= new int[n];
		for(int i=0;i<heightarr.length;i++)
		{
           heightarr[i]=sc.nextInt();
		}
		int span[]=new int[n];
		Arrays.fill(span, 1);
		
		for(int i=1;i<heightarr.length;i++)//forward loop jis building pe khde ho
		{
			for(int j=i-1;j>=0;j--) //previous buildings se comparision
			{
				if(heightarr[j]<heightarr[i])
				{
					span[i]++;
				}
				else
				{
					break;
				}
			}
			
		}
		
		
		for(int i=0;i<heightarr.length;i++)
		{
			System.out.print(span[i]+" ");
		}
    
    	System.out.println("END");
	}

}
