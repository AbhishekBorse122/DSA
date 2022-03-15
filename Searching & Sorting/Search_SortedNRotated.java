//Program to Search the element in Sorted & Rotated Array With the Log_n time Complexity.
//A={5,6,7,8,9,1,2,3} 
//T-O(log_n) S-O(1);
import java.util.Arrays;
public class Search_SortedNRotated
{
    static int pivotBS(int a[],int k)
    {
      int n=a.length;
      int pivot=findPivot(a,0,n-1);
      if(pivot==-1)
        return BinarySearch(a,0,n-1,k);
      if(a[pivot]==k)
        return pivot;
      if(a[0]<=k)
          return BinarySearch(a,0,pivot-1,k);
      return BinarySearch(a,pivot+1,n-1,k);
    }
    static int BinarySearch(int a[],int i,int j,int k)
    {
        if(i>j)
          return -1;
        int mid=(i+j)/2;
        if(k==a[mid])
          return mid;
        if(k>a[mid])
          return BinarySearch(a,mid+1,j,k);    
        return BinarySearch(a,i,mid-1,k);    
    }
    static int findPivot(int a[],int i,int j)
    {
        if(i>j)
            return -1;
        if(i==j)    
            return i;
        int mid=(i+j)/2;
        if(mid<j && a[mid]>a[mid+1])
            return mid;
        if(mid>i && a[mid]<a[mid-1])
            return mid-1;
        if(a[i]>=a[j])
          return findPivot(a,i,mid-1);    
        return findPivot(a,mid+1,j);    
    }
    public static void main(String args [])
    {
     int a[]={3,4,5,7,8,1,2,3};
     System.out.println("Element Index: "+pivotBS(a,1));
     System.out.println(findPivot(a,0,a.length));
    }
} 
