//Program to find Product_Puzzle with T-O(n).
//eg.a={2,3,4,2,5} r={120,80,60,120,48}
import java.util.Arrays;
public class Product_Puzzle
{
    static void productArray(int a[])
    {//T-O(n) & S-O(n)
      int n=a.length;
      if(n==1)
      {
          System.out.print(0);
          return;
      }     
      int left[]=new int[n];
      int right[]=new int[n];
      int prod[]=new int[n];
      left[0]=1;
      right[n-1]=1;
      for(int i=1;i<n;i++)
      {
          left[i]=a[i-1]*left[i-1];
      }    
      for(int j=n-2;j>=0;j--)
      {
          right[j]=a[j+1]*right[j+1];
      } 
      for(int i=0;i<n;i++)
      {
          prod[i]=right[i]*left[i];
      } 
      System.out.print("\nProduct: ");
      for(int i=0;i<n;i++)
      {
          System.out.print(" "+prod[i]);
      } 
    }
    static void productArray1(int a[])
    {//T-O(n*n) & S-O(1)
        int n=a.length;
        int prod[]=new int[n];
        Arrays.fill(prod,1);
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
               if(j!=i)
               {
                prod[i]=prod[i]*a[j];
               } 
           }
        }
        System.out.print("\nProduct1: ");
        for(int i=0;i<prod.length;i++)
        {
            System.out.print(" "+prod[i]);
        }
    }
    public static void main(String args[])
    {
     int P[]={3,7,1,4,5};
     productArray(P);
     productArray1(P);     
    }
}    