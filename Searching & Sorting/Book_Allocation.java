//Program to find Book Allocation(GFG) to given Students.
//T-O(nlogn) S-O(1);
import java.util.Arrays;
public class Book_Allocation
{
    static int findPages(int a[],int n,int m)
    {
      int low=0,sum=0,ans=0;
      for(int i=0;i<n;i++)
      {
          sum+=a[i];
      }
      int high=sum;
      while(low<=high)//T-O(nlogn)
      {
          int mid=(low+high)/2;
          if(solve(a,n,mid,m))
          {
              ans=mid;
              high=mid-1;      
          }
          else
          {
           low=mid+1;
          }
      }
      return ans;
    }
    static boolean solve(int a[],int n,int mid,int m)
    {
        int sum=0,stu=1;
        for(int i=0;i<n;i++)
        {
            if(a[i]>mid)
             { return false;}
            if(sum+a[i]>mid)
            {
             stu++;
             sum=a[i];
             if(stu>m)
              {
                  return false;
              }
            } 
            else
            {
                sum+=a[i];
            } 
        }
        return true;
    }
    public static void main(String args[])
    {
     int P[]={12,34,67,90};
     System.out.println("Minimum Number of Pages to Student: "+findPages(P,P.length,2));
    }
}    