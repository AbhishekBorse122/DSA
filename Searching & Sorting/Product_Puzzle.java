// Program to find the maximum sum with no two adjacent element.
// Find the prod[] such that prod[i] is equal to product of array element except the a[i]   
import java.util.*;
public class Product_Puzzle
{	
    public static void productPuzzle(int a[])
    {
        int n=a.length,temp=1;
        int prod[]=new int[n];
        Arrays.fill(prod,1);
        for(int i=0;i<n;i++) 
        {
         prod[i]=temp;
         temp*=a[i];
        }
        temp=1;
        for(int i=n-1;i>=0;i--) 
        {
         prod[i]*=temp;
         temp*=a[i];
        }
        for(int i:prod) {
         System.out.print(" "+i);
        }
    }
    public static void main(String args[])
    {
     int a[]={10,3,5,6,2};
     productPuzzle(a);
     }
}