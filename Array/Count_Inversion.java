//Program to find to Count the Inversion for Array {4,3,5,7,1}=(4,3)(4,1)(3,1)(5,1)(7,1) i.e 5 count Inversion
//So basically Brute Force Approach takes T-O(n*n) but by Merge Sort we can count Inversion with T-O(nlogn)
import java.util.*;
public class Count_Inversion
{
    static int mergeCount(int a[],int l,int m,int r)
    {
      int []L=Arrays.copyOfRange(a,l,m+1);
      int []R=Arrays.copyOfRange(a,m+1,r+1);
      int i=0,j=0,k=l,swaps=0;
      while(i<L.length && j<R.length)
      {
        if(L[i]<=R[j])
        {
          a[k++]=L[i++];
        }
        else
        {
          a[k++]=R[j++];
          swaps+=(m+1)-(l+i);
        }
      }
      while(i<L.length)
      {
        a[k++]=L[i++];
      }
      while(j<R.length)
      {
        a[k++]=R[j++];
      }
      return swaps;
    }
    static int MergeInversionCount(int a[],int l,int r)//T-O(nlogn) Merge Sort
    {
      int count=0;
      if(l<r)
      {
        int m=(l+r)/2;
        count+=MergeInversionCount(a,l,m);
        count+=MergeInversionCount(a,m+1,r);
        count+=mergeCount(a,l,m,r);
      }
      return count;
    }
    public static void main(String args [])
    {
     int P[]={1,4,8,2,5,7};
     System.out.println("Approach Inversion Count: "+MergeInversionCount(P,0,P.length-1));
    }
}