//Program to find Kth Element of Two Sorted Arrays.
// S-O(n) T-O(n)
import java.util.Arrays;
public class Kth_Element
{
    static int KthElement(int a[],int b[],int K)
    {
     int i = 0,temp = 0;
     int n = a.length; 
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
      return (K<=n? a[K-1]:b[K-n-1]);
    }
    public static void main(String args[])
    {
     int P[]={2,3,6,7,9};
     int R[]={1,4,8,10};
     System.out.print(KthElement(P,R,8));
    }
}    