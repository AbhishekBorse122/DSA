//Program to find the Next Greater Element is same like next permutation.
import java.util.*;
public class Next_Greater
{
    static void nextGreater(int a[],int n)
    {
       int i;
       for(i=n-1;i>0;i--)
        {
          if(a[i]>a[i-1])
          {
              break;
          }
        }
        if(i==0)
        {
           System.out.println("Not Possible"); 
        }
        else
        {
            int x=a[i-1],min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]>x && a[j] < a[min])
                {
                    min=j;
                }
            }
            swap(a,i-1,min);
            Arrays.sort(a,i,n);
            System.out.print("Next Number with Same Set of Digits is ");
            for(i=0;i<n;i++)
            {
                System.out.print(a[i]);
            }
        }
    }
    static void swap(int s[],int l,int r)
    {
        int temp=s[l];
        s[l]=s[r];
        s[r]=temp;
    }
    public static void main(String args [])
    {
     int P[]={1,4,3};
     nextGreater(P,P.length);
    }
}