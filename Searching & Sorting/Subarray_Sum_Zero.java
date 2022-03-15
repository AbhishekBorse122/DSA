// Program to find the subarray sum is zero.  
// Set only stored the unique elements they are in sorted form.
import java.util.*;
public class Subarray_Sum_Zero
{	
    public static boolean zeroSubarray(int a[])
    {
       Set<Integer> S=new HashSet<>();
       int sum=0;
       for(int i=0;i<a.length;i++)
       {
           sum+=a[i];
           if(a[i]==0 || sum==0 || S.contains(sum)){
           System.out.println(sum);            
               return true;
           }
           S.add(sum);
           System.out.println(S);
       }
       return false;
    }
    public static void main(String args[])
    {
     int a[]={5,2,-2,-5,5,9};
     System.out.println(zeroSubarray(a));
     int b[]={-3,2,3,3,2,-3,1,6};
     System.out.println(zeroSubarray(b));
    }
}