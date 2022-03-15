// Program to find the square Root.
// Using the Binary Search Algo to find the square root.
// T-O(log_n)
public class Square_Root
{	
    public static int squareRoot(int K)
    {
      if(K==0 || K==1){return K;}  
      int l=1,r=K,ans=0;  
      while(l<=r)
      {
          int mid=(l+r)/2;
          if(mid*mid==K)
          {
              return mid;
          }
          if(mid*mid<K){ 
              l=mid+1;
              ans=mid;
          }else{
              r=mid-1;
          }
      }
      return ans;
    } 
    public static int squareRoot1(int K)// T-O(n)
    {
        int i=1,ans=0;
        while(ans<=K)
        {
            i++;
            ans=i*i;
        }
        return i-1;
    }
    public static void main(String args[])
    {
     System.out.println(squareRoot(50));
     System.out.println(squareRoot1(81));
    }
}