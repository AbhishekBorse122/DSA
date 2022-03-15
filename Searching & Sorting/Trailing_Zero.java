//Program to find Trailing Zero.
//T-O(nlogn) S-O(1);
import java.util.Scanner;
public class Trailing_Zero
{
    static int findNumber(int n)
    {
        if(n==1)
        {
          return 5;
        }
        int low=0,high=5*n;
        while(low<high)
        {
          int mid=(low+high)>>1;
          if(check(mid,n))
          {
              high=mid;    
          }
          else
          {
           low=mid+1;
          }
        }
      return low;
    }
    static boolean check(int p,int n)
    {
        int temp=p,count=0,f=5;
        while(f<=temp)
        {
            count+=temp/f;
            f=f*5;
        }
        return(count>=n);
    }
    public static void main(String args[])
    {
     Scanner S=new Scanner(System.in);
     System.out.println("Number whose factorial has 3"+" Trailing Zero: "+findNumber(3));
    }
}    