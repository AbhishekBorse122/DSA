// Find four element having sum equal to given element.
// T-O(n^2) & S-O(n^2)
import java.util.*;
public class Four_Element_Sum
{	
    static class Pair
    {
        int a,b;
        public Pair(int a,int b)
        {
        this.a=a;
        this.b=b;
        }
    }
    public static void findFourEle(int a[],int X)
    {
        int n=a.length;
        Map<Integer,Pair> H=new HashMap<>();
        for(int i=0;i<n-1;i++)
        {
           for(int j=i+1;j<n;j++){
               H.put(a[i]+a[j],new Pair(i,j));
           }
        }
        for(int i=0;i<n-1;i++)
        {
           for(int j=i+1;j<n;j++)
           {
            int sum=a[i]+a[j];
             if(H.containsKey(X-sum))
             {
               Pair P=H.get(X-sum);
               if(P.a!=i && P.b!=j && P.a!=j && P.b!=i)
               {
                   System.out.println(a[i]+" "+a[j]+" "+a[P.a]+" "+a[P.b]);
                   return;
               }
             }
           }
        }
    }
    public static void main(String args[])
    {
     int a[]={10,20,30,30,40,1,2};
     findFourEle(a,91);
    }
}