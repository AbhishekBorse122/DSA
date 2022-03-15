// Searh in an array where adjacent differ is at most k.
import java.util.*;
public class Adjacent_Differ
{	
    public static int searchAdjacentDiffer(int a[],int k,int x)
    {
        int i=0;
        while(i<a.length)
        {
          if(a[i]==x){
            return i;
          }
          i=i+Math.max(1,Math.abs(a[i]-x)/k);
        }
        return -1;
    }
    public static void main(String args[])
    {
     int a[]={2,4,5,7,7,6};
     System.out.print(searchAdjacentDiffer(a,2,6));
    }
}