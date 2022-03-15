import java.util.*;
public class Pair_Sum
{
    static class Pair
    {
      int n1,n2;
      Pair(int n1,int n2)
      {
          this.n1=n1;
          this.n2=n2;
      }
    }
    static void sumPairs(int a[],int n,int K)
    {
        int l=0,r=n-1;
        Arrays.sort(a);
        while(l<r)
        {
            if(a[l]+a[r]==K)
            {
                System.out.println(a[l]+" "+a[r]);
                l++;
                r--;
            }
            else if(a[l]+a[r]<K){
                l++;
            }
            else{
                r--;
            }
        }
    }
    static int countPairs(int a[],int n,int K)
    {//this is not correct program
        int l=0,r=n-1;
        ArrayList<Pair> A=new ArrayList<>();
        Arrays.sort(a);
        while(l<r)
        {
            if(a[l]+a[r]==K)
            {
                System.out.println(a[l]+" "+a[r]);
                Pair P=new Pair(a[l],a[r]);
                Pair R=new Pair(a[r],a[l]); 
                if(!A.contains(P) && !A.contains(R))
                {
                    A.add(P);
                }    
                l++;
                r--;
            }
            else if(a[l]+a[r]<K){
                l++;
            }
            else{
                r--;
            }
        }
        return A.size();
    }
    public static void main(String args[])
    {
    int a[]=new int[]{-1,1,1,2,3,4,5,6,6,7,};
    sumPairs(a,a.length,5);
    }
}