//Program to find the Maximum Sum such that no 2 Element Adjacent.
//T-O(n)  e.g a={1,5,7} OT-1+7=8, a={2,4,7,8,3} OT-2+7+3=12
public class MaxSum_Without_Adjacent
{
    static int findMaxSum(int a[])
    {
        int n=a.length;
        int incl=a[0],excl=0;
        int excl_new;
        for(int i=1;i<n;i++)
        {
            excl_new=(incl>excl)? incl : excl;
            incl=excl+a[i];
            excl=excl_new;
        }
        return ((incl>excl)? incl: excl);
    }
    public static void main(String args [])
    {
     int a[]={5,6,1,2,9,6,8,7};
     System.out.println("MaxSum: "+findMaxSum(a));
    }
} 
