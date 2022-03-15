public class Palindromic_Subsequence
{
    static int countPS(String S)
    { 
        int l=S.length();
        int c[][]=new int[l][l];
        for(int i=0;i<l;i++)
        {
            c[i][i]=1;
        }
        for(int i=2;i<=l;i++)
        {
          for(int j=0;j<=l-i;i++)  
          {
            int k=i+j-1;
            if(S.charAt(j)==S.charAt(k))
             {
              c[j][k]=c[j][k-1]+c[j+1][k]+1;
             }
            else
             {
              c[j][k]=c[j][k-1]+c[j+1][k]-c[j+1][k-1];
             }
          }     
        }
      return c[0][l-1];
    }
    public static void main(String args [])
    {
     String S="abcd";
     System.out.print("Maximum Palindromic Subsequence: "+countPS(S));
    }
}
