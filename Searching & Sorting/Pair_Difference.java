//Find a Pair with Given Difference.
import java.util.*;
public class Pair_Difference
{	
    public static void findPair(int a[],int k)
    {
       Arrays.sort(a);
       int i=0,j=1; 
       while(i<a.length && j<a.length)
       {
           if(i!=j && (a[j]-a[i]==k ||a[i]-a[j]==k )){
             System.out.println("Pair ("+a[i]+","+a[j]+")");
             return;  
           }
           else if(a[j]-a[i]<k){
             j++;
           }
           else{
               i++;
           }
       }
       System.out.println("No Pair Found");
    }
    public static void main(String args[])
    {
     int a[]={1,8,30,40,100};
     findPair(a,10);
    }
}