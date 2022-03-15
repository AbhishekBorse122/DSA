// Program to determine the subset sum of equal to given number  
import java.util.*;
public class Subset_Sum
{	
    public static boolean isSubset(int a[],int n,int K)
    {
        if(K==0)
          return true;
        if(n==0)
          return false;
        if(a[n-1]>K)
          return isSubset(a,n-1,K);
        return (isSubset(a,n-1,K) || isSubset(a,n-1,K-a[n-1]));  
    }
    public static void main(String args[])
    {
     int a[]={3,34,4,12,5,2};
     System.out.println(isSubset(a,a.length,45));
     System.out.println(isSubset(a,a.length,30));
    }
}