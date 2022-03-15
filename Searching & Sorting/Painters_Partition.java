//Time Complexity of this Program is Exponential
public class Painters_Partition
{
    static int sum(int a[],int start,int end)
    {
        int total=0;
        for(int i=start;i<=end;i++)
        {
            total+=a[i];
        }
        return total;
    }
    static int Partition(int a[],int n,int k)
    {
        if(k==1)
          return (sum(a,0,n-1)); 
        if(n==1)
            return a[0];
        int best=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++)
        {
          best=Math.min(best,Math.max(Partition(a,i,k-1),sum(a,i,n-1)));
        }
      return best;
    }
    public static void main(String args[])
    {
     int a[]={10,20,30,40};
     System.out.println("Minimum Time To Painters to Paint: "+Partition(a,a.length,2));
    }
}    