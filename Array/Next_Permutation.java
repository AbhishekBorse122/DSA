//Program to find the Next Permutation i.e Next greater number of permutation 
public class Next_Permutation
{
    static void nextPermutation(int a[])
    {
       int k=-1;
       int n=a.length;
       for(int i=n-1;i>0;i--)
        {
          if(a[i]>a[i-1])
          {
              k=i;
              break;
          }
        }
        if(k==-1)//if this codition is true that means the array has a last permutation.
        {
             Reverse(a,0,a.length-1);
        }
        else
        {
            int prev=k;
            for(int i=k+1;i<n;i++)
            {
            if(a[i]>a[k-1] && a[i] <= a[prev])
                {
                    prev=i;
                }
            } 
            swap(a,k-1,prev);
            Reverse(a,k,a.length-1);
        }
    }
    static void swap(int s[],int l,int r)
    {
        int temp=s[l];
        s[l]=s[r];
        s[r]=temp;
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
    static void print(int a[])
    {
        System.out.print("\n");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
    public static void main(String args [])
    {
     int P[]={5,4,8,9,3,5,5,1,4,2};
     nextPermutation(P);
     print(P);
    }
}