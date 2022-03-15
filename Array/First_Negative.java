//Program to find the First Negative from the SubArray if negative element is not Present then print 0.
//A={-2,3-1,4,2,-1,4,2,4,6} 
public class First_Negative
{
    static void firstNegative(int A[],int K,int n)
    {
        boolean flag;
        for(int i=0;i<(n-K+1);i++)
        {
          flag=false; 
          for(int j=0;j<K;j++)
          {
             if(A[i+j]<0)
             {
              System.out.print(" "+A[i+j]);
              flag=true;
              break;
             }
          }
          if(!flag)
          {
           System.out.print(" "+"0");
          }   
        }
    }
    public static void main(String args[])
    {
     int A[]={3,-2,4,-1,5,5,-6,6,7};
     firstNegative(A,2,A.length);
    }
}