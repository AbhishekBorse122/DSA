// Median of Sorted & Unsorted Array Of Any Size.
//T-O(n) & S-O(n+m)
import java.util.*;
public class Median_Array
{ 
  public static void FindMedian(int a[],int b[],int m,int n)
  {
    int i=0,j=0;
    int M[]=new int[n+m];
    int c=0;
    Arrays.sort(a);
    Arrays.sort(b);
    while (i < m && j < n) 
    {
      if (a[i] < b[j])
        M[c++]=a[i++];
      else if (a[i] > b[j])
        M[c++]=b[j++];
      else {
          M[c++]=b[j];
          M[c++]=b[j++];
          j++;
          i++;
        }
    } 
    while (i < m)
      M[c++]=a[i++];
    while (j < n) 
      M[c++]=b[j++];
      int L=M.length;
    //  for (int k : M) {
    //     System.out.print(" "+k);       
    //  }
   if(L%2==0)
    {
      double Median=(M[L/2-1]+M[L/2])/2.0;
      System.out.println("Median: "+Median);
    } 
    else{
      System.out.println("Median: "+M[L/2]);
    } 
  }
	public static void main (String[] args) 
	{ 
		int P[] = {1,12,15,26,38}; 	
    int Q[] = {2,13,17,18,30,45};
    FindMedian(P,Q,P.length,Q.length);
	} 
} 

