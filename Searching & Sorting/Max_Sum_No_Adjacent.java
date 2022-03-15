// Program to find the maximum sum with no two adjacent element.
import java.util.*;
public class Max_Sum_No_Adjacent
{	
    public static int maxSum(int a[])
    {
        int incl=a[0];
        int excl=0;
        int excl_new;
        for(int i=1;i<a.length;i++) 
        {
            excl_new=(incl>excl ? incl:excl);
            incl=excl+a[i];
            excl=excl_new;
        }
        return (incl>excl?incl:excl);
    }
    public static void main(String args[])
    {
     int a[]={5,5,10,100,10,5};
     System.out.println(maxSum(a));
    }
}