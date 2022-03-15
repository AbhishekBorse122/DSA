//It is the Best and Optimize solution with O(n^2) time Complexity.
import java.util.*;
public class Triplet
{
    static boolean findTriplet(int a[],int sum)
    {
      for(int i=0;i<a.length;i++)
      {
        for(int j=0;j<a.length;j++)
         {
            for(int k=0;k<a.length;k++)
             {
                 if(a[i]+a[j]+a[k]==sum)
                 {
                     System.out.println("\n("+a[i]+","+a[j]+","+a[k]+") is a Triplet");
                     return true;
                 }
             }
         }
      }
      System.out.println("\nThere is No Triplet");
      return false;
    }
    static boolean findTriplet1(int a[],int sum)// T- O(n^2)
    {
      Arrays.sort(a); 
      int n=a.length;
      for(int i=0;i<n;i++)
      {
        int l=a[i+1];
        int r=a[n-1];
        int x=a[i];
        while(l<r){
            if(x+l+r==sum){
                System.out.println("\n("+x+","+l+","+r+") is a Triplet");
                return true;
            }
            else if(x+l+r<sum){
                l++;
            }
            else{
                r--;
            }
        }
      }
      System.out.println("\nThere is No Triplet");
      return false;
    }
    public static void main(String args[])
    {
     int P[]={3,1,6,7,1,3,2,8};
     findTriplet(P,0);
     findTriplet1(P,5);
    }
}    