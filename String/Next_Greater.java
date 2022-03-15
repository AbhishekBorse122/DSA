import java.util.*;
public class Next_Greater
{
    static void nextGreater(int a[],int n)
    {
        int pos=0;
        for(int i=n-1;i>0;i--)
        {
            if(a[i]>a[i-1])
            {
                pos=i;
                break;
            }
        }
        if(pos==0)
        {
        System.out.println("Not Possible"); 
        return;
        }
        int temp=pos;
        for(int i=pos;i<n;i++)
        {
            if(a[i]>a[pos-1] && a[i]<=a[temp])
            {
                temp=i; 
            }
        }
        int swap=a[temp];
        a[temp]=a[pos-1];
        a[pos-1]=swap;
        Reverse(a,pos,n-1);
        print(a);
    }
    static void print(int a[])
    {
        System.out.print("\n");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
    static void Reverse(int s[],int start,int end)
    {
       while(start<end)
       {
           int temp=s[start];
           s[start++]=s[end];
           s[end--]=temp;
       }
    }
    public static void main(String args[])
    {
     int a[]={5,1,8,5,2,1};
     nextGreater(a,a.length);
    }
}