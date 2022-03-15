//(V.Imp)Program to Count the minimum edit Operation.In this problem we have a given the two string 1 and 2 and we have to perform the opeartion 
//insert,replace or remove so we have to count the minimum number of operation required to equal the String.
//T-O(m*n) S-O(m*n)
public class Edit_Distance
{
    static int countOpertion(String S,String P,int m,int n)
    {
     int d[][]=new int[n+1][n+1];
     for(int i=0;i<=n;i++)
      {
         for(int j=0;j<=n;j++)
         {
            if(i==0)
              d[i][j]=j;
            else if(j==0)
              d[i][j]=i;
            else if(S.charAt(i-1)==P.charAt(j-1))
              d[i][j]=d[i-1][j-1];
            else
              d[i][j]=1+min(d[i][j-1],d[i-1][j],d[i-1][j-1]);
         }
      }
      return d[m][n];
    }
    static int min(int x,int y,int z)
    {
        if(x<=y && x<=z)
            return x;
        else if(x>=y && y<=z)
            return y;    
        else
            return z;
    }
    public static void main(String args [])
    {
      String A="abhi",P="prat";//here all string will performed replace opeartion.
      System.out.println("Edit Operation: "+countOpertion(A,P,A.length(),P.length()));
    }
}