//Program to find the Median of Row of Sorted 2D Array.
//T-O(n) & S-O(1) 
public class Matrix_Median
{ 	
	static void rowMedian(int a[][],int m) 
	{
		int n,k,Median;
		for(int i=0;i<m;i++)
		{
			n=a[i].length;
			k=n/2;
			if(n%2!=0)
			{
				Median=(a[i][k])/2;
			}
			else 
			{
				Median=(a[i][k]+a[i][k-1])/2;
			}
			System.out.println("Median of Row "+m+": "+Median);
		}
    } 
	public static void main (String[] args) 
	{ 
		int P[][]={{1,4,5,7,8,9,}, 	
                   {1,3,6,7,8},
                   {3,5,9,11}};
        rowMedian(P,P.length);
	} 
} 

