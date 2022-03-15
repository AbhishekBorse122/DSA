//Bishu is fighter a[] is power of ith soldier and Q is number of fight rounds and p[] power of bishu in ith round  
// we have to find out the number of killed soldier in each round and killed soldier cumulative power.
import java.util.*;
public class Bishu_Soldiers
{	
    public static void killSoldiers(int a[],int Q,int p[])
    {
      int n=a.length,k=0;
      for(int i=0;i<Q;i++)
      {
         int count=0,sum=0;
         for(int j=0;j<n;j++)
         {
            if(a[j]<=p[k])
             {
             sum+=a[j];
             count++;
             }
         }
         System.out.println(count+" "+sum);
         k++;
      }
    }
    public static void main(String args[])
    {
     int a[]={1,2,3,4,5,6,7};
     int p[]={3,10,2};
     killSoldiers(a,3,p);
    }
}