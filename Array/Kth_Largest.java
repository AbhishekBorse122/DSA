//Program To find Out Kth Largest/Smallest Element of the Array.
import java.util.Arrays;
public class Kth_Largest
{
    public void K_Small(int a[],int k)
    { 
      Arrays.sort(a);
      int MIN=a[k-1];
      System.out.println(k+"th MIN: "+MIN);
    }
    public void K_Large(int a[],int k)
    {
      Arrays.sort(a);
      int MAX=a[a.length-k];
      System.out.println(k+"th MAX: "+MAX);
    }
    public static void main(String args [])
    {
     int P[]={22,32,17,83,91,34,65,41};
     Kth_Largest A=new Kth_Largest();
     A.K_Small(P,2);
     A.K_Large(P,2);
    }
}