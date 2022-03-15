//Program to find the Minimum Swap Required to shift the number less than or equal to given number.
//T-O(n) and S-O(1)
//In this Problem we are use the sliding window technique.
public class Minimum_Swap
{ 	
	static void countSwap(int a[], int K) 
	{ 
		int count=0;
		for(int i=0;i<a.length;i++)
		{
         if(a[i]<=K)
		   count++;
		}
		int bad=0;
	    for(int i=0;i<count;i++)
		{
         if(a[i]>K)
		   bad++;
		}
		int ans=bad;
		for(int i=0,j=count;j<a.length;i++,j++)
		{
			if(a[i]>K)
			  bad--;
			if(a[j]>K)
			  bad++;  
	        ans=Math.min(ans,bad);		  
		}
    System.out.println("Minimum Swap: "+ans);
	} 
	public static void main (String[] args) 
	{ 
		int P[] = {2,7,9,5,8,3,7,4}; 	
		countSwap(P,5); 
	} 
} 
