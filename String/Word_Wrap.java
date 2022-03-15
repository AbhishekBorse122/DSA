//(V.Imp)Program to Solve the Word Wrap Problem.In this problem we have a given the length of each word in the Array Each line contain only x spaces
//(here 6 Space)and arrange the word with minimum line and minimum blank spaces.This problem can solve with greedy approach but it not give optimal 
//solution for every case.Dynamic Prog. can give optimal solution almost at every case.
//T-O(n^2) S-O(n^2)
public class Word_Wrap
{
    static final int Max=Integer.MAX_VALUE;
    static void wordWrap(int l[],int n,int M)
    {
     int extras[][]=new int[n+1][n+1];
     int lc[][]=new int[n+1][n+1];
     int c[]=new int[n+1];
     int p[]=new int[n+1];
     for(int i=1;i<=n;i++)
     {
         extras[i][i]=M-l[i-1];
         for(int j=i+1;j<=n;j++)
         {
             extras[i][j]=extras[i][j-1]-l[j-1]-1;
         }         
     }
     for(int i=1;i<=n;i++)
     {
         for(int j=i;j<=n;j++)
         {
             if(extras[i][j]<0)
                lc[i][j]=Max;
             else if(j==n && extras[i][j]>=0)
                lc[i][j]=0;
             else
                lc[i][j]=extras[i][j]*extras[i][j];       
         }
     }
     c[0]=0;
     for(int j=1;j<=n;j++)
     {
      c[j]=Max;
      for(int i=1;i<=j;i++)
       {
         if(c[i-1]!=Max && lc[i][j]!=Max && (c[i-1]+lc[i][j]<c[j]))
         {
             c[j]=c[i-1]+lc[i][j];
             p[j]=i;
         }
       }
     }
     printSolution(p,n);
    }
    static int printSolution(int A[],int n)
    {
     int k;
     if(A[n]==1)
        k=1;
     else
        k=printSolution(A,A[n]-1)+1;
        System.out.println("Line  "+k+" :From  "+A[n]+"  to "+n);
        return k;      
    }
    public static void main(String args [])
    {
     int S[]={3,2,2,5};
     int M=6;
     wordWrap(S,S.length,M);
    }
}