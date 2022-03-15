// Program to find the missing number in AP.
import java.util.*;
public class Missing_Number_AP
{	
    public static int missingNumber(int a[],int l,int h,int d)
    {
      int mid;
      while(l<=h)
      {
          mid=(l+h)/2;
          if((a[mid]-a[0])/d==mid){
              l=mid+1;
          }else{
              h=mid-1;
          }
      }
      return a[h]+d;
    }
    public static int findMissing(int a[],int n)
    {
     int diff=(a[n-1]-a[0])/n;
     return missingNumber(a,0,n-1,diff);
    }
    public static void main(String args[])
    {
     int a[]={5,10,20,25,30,35};
     System.out.println(findMissing(a,a.length));
     }
}