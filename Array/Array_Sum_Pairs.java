//Program to find all pairs in Integer array Whose sum is equal to given Number.
//Repetation of number in the array is not allowed.
//Time: O(N2) Space: O(1)
public class Array_Sum_Pairs
{
    static void findPairs(int a[],int num)
    {
     for(int i=0;i<a.length;i++)
     {
         for(int j=0;j<a.length;j++)
         {
             if(a[i]+a[j]==num && i!=j)
              {
                  System.out.print(" ("+a[i]+","+a[j]+") ");
              }
         }
      }
    }
    public static void main(String args [])
    {
     int P[]={3,2,4,7,1,9,8,5,10};
     findPairs(P,10);
    }
}