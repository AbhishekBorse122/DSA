// Find the array element equal to index position. Expected- T(log_n) 
// T-O(log_n)  (Binary Search)
import java.util.*;
public class Fixed_Point
{	
    static int findPoint(int a[]){
     return binarySearch(a,0,a.length-1);
    }
    static int binarySearch(int a[],int l,int h)
    {
     if(h>=l)
     {
      int mid=(l+h)/2;
      if(mid==a[mid]){return mid;}
      if(mid>a[mid]){ 
         return binarySearch(a,mid+1,h);
      }
      else{
         return binarySearch(a,l,mid-1);
      }
     }
     return -1;
    } 
    public static void main(String args[])
    {
      int a[]={-19,-4,0,1,4,7,9,13};
      System.out.print(findPoint(a));
    }
}