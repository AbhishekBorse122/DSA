// Program to count the triplet having sum less than given value.  
import java.util.*;
public class Count_Triplet
{	
    public static int countTriplet(int a[],int X)
    {
      Arrays.sort(a);
      int count=0;
      for(int i=0;i<a.length-2;i++)
      {
        int j=i+1,k=a.length-1;
        while(j<k){
            if(a[i]+a[j]+a[k]>=X){
                k--;
            }
            else{
                count+=(k-j);
                j++;
            }
        }
      }
      return count;
    }
    public static void main(String args[])
    {
     int a[]={5,1,3,4,7};
     System.out.println(countTriplet(a,12));
    }
}