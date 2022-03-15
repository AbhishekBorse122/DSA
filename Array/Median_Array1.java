//Median of two Different Size Sorted Array.
//T-O(n) & S-O(1)
public class Median_Array1
{ 	
	public static void FindMedian(int a[],int b[],int n,int m) 
	{ 
      int Median=0,k=a.length/2,l=b.length/2;
      if(n%2!=0 && m%2!=0)
      {
         Median=(a[k]+b[l])/2;
      }  
      if(n%2==0 && m%2==0)
      {
       Median=(a[k]+a[k-1]+b[l]+b[l-1])/2;
      }
      if(n%2!=0 && m%2==0)
      {
        Median=(a[k]+b[l]+b[l-1])/2;
      }
      if(n%2==0 && m%2!=0) 
      {
         Median=(a[k]+a[k-1]+b[l])/2;
      }
      System.out.println("Median: "+Median);
	} 
	public static void main (String[] args) 
	{ 
		int P[] = {3,4,5,8,9}; 	
        int Q[] = {5,7,8,9,10,13,18};
        FindMedian(P,Q,P.length,Q.length);
	} 
} 

