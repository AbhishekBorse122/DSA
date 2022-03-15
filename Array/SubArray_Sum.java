//Program to find the SubArray with Given Sum.
//T-O(n*n)
public class SubArray_Sum
{
    static boolean isSumSubArray(int a[],int n,int sum)
    {
       boolean S[][]=new boolean[sum+1][n+1];
       for(int i=0;i<=n;i++)
       {
           S[0][i]=true; 
       }
       for(int i=1;i<=sum;i++)
       {
           S[i][0]=false;
       }
       for(int i=1;i<=sum;i++)
       {
           for(int j=1;j<=n;j++)
           {
               S[i][j]=S[i][j-1];
               if(i>=a[j-1])
                   S[i][j]=S[i-a[j-1]][j-1];
           }
       }
       return S[sum][n];
    }
    public static void main(String args[])
    {
     int a[]={2,3,4,3,1,11,22};
     System.out.println("Is SubArray of Given Sum is Found : "+isSumSubArray(a,a.length,10));
    }
}    
