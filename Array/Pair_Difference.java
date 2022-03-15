//Program to find the Pair with the Given Diffrence.
//T-O(nlogn)  while loop has Time Complexity of O(nlogn)
//We can find the answer of this with Brute Force approcah but T-O(n*n) i.e for loop within for loop.
import java.util.*;
public class Pair_Difference
{
    static boolean findPair(int a[],int Diff)
    {
        int n=a.length;
        int i=0,j=1;
        Arrays.sort(a);
        while(i<n && j<n)
        {
            if(i!=j && a[j]-a[i]==Diff )
             { 
               System.out.println("Pair: ("+a[i]+" , "+a[j]+")");
               return true;
             } 
            else if(a[j]-a[i]<Diff)
               j++;
            else
               i++;
        }
        return false;
    }
    public static void main(String args [])
    {
     int a[]={80,73,41,92,51,11,44,25};
     findPair(a,12);
    }
} 
