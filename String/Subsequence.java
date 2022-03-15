//Program to find the length of longest subsequence.
//This is dynamic programming approch
//T-O(n^2) S-O(n);
public class Subsequence
{
    static void longSequence(int a[])
    {
       int l[]=new int[a.length];
       int max=0;
       for(int i=0;i<a.length;i++)
       {
           l[i]=1;
       }
       for(int i=1;i<a.length;i++)       
       {
           for(int j=0;j<i;j++)
           {
               if(a[i]>a[j] && l[i]<l[j]+1)
              {
               l[i]=l[j]+1;
              }     
           } 
       }
       for(int i=0;i<a.length;i++)
       {
           if(max<l[i])
             max=l[i];
       }
       System.out.print("Length of Longest Subsequence: "+max);
    }
    public static void main(String [] args)
    {
     int P[]={23,12,22,41,24,21,34};
     longSequence(P);
    }
}    