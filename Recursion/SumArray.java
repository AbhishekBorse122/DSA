// Find the Sum of Array By Recursion
public class SumArray
{  
    static int sum=0;
    static int reverseSum(int a[],int n)
    {
      if(n==0){
          return sum+a[n];
      }
      sum+=a[n];
      return reverseSum(a,n-1);
    }
    public static void main(String[] args)
    {
      int a[]={10,3};
      System.out.println(reverseSum(a,a.length-1));
    }
}