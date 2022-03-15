//Program to find the SubArraySum is zero.
import java.util.*;
public class Zero_Sum_SubArray
{
    static boolean zeroSumArray(int a[])
    {
        Set<Integer> H=new HashSet<>();
        int Sum=0;
        for(int i=0;i<a.length;i++)
        {
            Sum=Sum+a[i];
            if(a[i]==0 || Sum==0 || H.contains(Sum))
            {
                return true;
            }
            H.add(Sum);
        }
        return false;
    }
    public static void main(String args[])
    {
     int P[]={2,3,-3,5,6,3};
     if(zeroSumArray(P)) 
        System.out.println("Found A SubArray ");
     else
        System.out.println("No SubArray Found ");          
    }
}    