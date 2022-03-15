//Program is use to Minimize the maximum Height(VeryImportant)
import java.util.*;
public class Minimize_Height
{
    static int getMinDiff(int a[],int n,int k)
    { 
     if(n==1)
      return 0;
     Arrays.sort(a);
     int ans=a[n-1]-a[0];
     int small=a[0]+k;
     int big=a[n-1]-k;
     int temp;
     if(small>big)
     {
        temp=small;
        small=big;
        big=temp;
     }
     for(int i=1;i<n-1;i++)
     {
         int sub=a[i]-k;
         int add=a[i]+k;
         if(sub>=small || add<=big)
           continue;
         if(big-sub <= add-small)
           small=sub;
         else
           big=add;    
     }
     return Math.min(ans,big-small);
    }
    public static void main(String args [])
    {
     int P[]={6 ,1 ,9 ,1 ,1 ,7 ,9 ,5 ,2 ,10};
     System.out.println("Max Difference: "+getMinDiff(P,P.length,4));
    }
}
// 4
// 10
// 
