//Function to merge the two Sorted array without using extra space S-O(1).
import java.util.*;
public class Merge_Array
{
    static void Merge(int a[],int b[],int n,int m)
    {
    int i = 0;
    int temp = 0;
    // iterate while loop till last element
    // of array 1(sorted) is greater than first element
    // of array 2(sorted)
      while (a[n - 1] > b[0])
      {
        if (a[i] > b[0])
        {
            temp = a[i];
            a[i] = b[0];
            b[0] = temp;
            Arrays.sort(b);
        }
        i++;
      }
      print(a);
      print(b);
    }
    static void print(int a[])
    {
        System.out.print("\n");
        for(int i:a)
        {
            System.out.print(" "+i);
        }
    }
    public static void main(String args [])
    {
    int P[]={1,5,9,10,15,20};
    int Q[]={2,3,8,13};
    Merge(P,Q,P.length,Q.length);
    }
}