//Program to Count the Triplets whose Sum is less than the given Sum.
//T-O(nlogn) S-O(1)
import java.util.*;
public class Count_Triplets
{
    static void countTriplets(int a[],int sum)
    {
        int n=a.length;
        Arrays.sort(a);
        int j,k,count=0;
        for(int i=0;i<n-2;i++)
        {
          j=i+1;k=n-1;  
          while(j<k)
          {
            if(a[i]+a[j]+a[k]>=sum)
              k--;
            else{
              count+=k-j;  // bcz all value beafore the k are less less so count will beacome K-j
              j++;
            }    
          }
        }
     System.out.println("Triplets: "+count);
    }
    public static void main(String args [])
    {
     int a[]={2,3,8,7,1,4,6,5};
     countTriplets(a,12);
    }
} 

