//This is Brute force approach to find out the pattern in given string.But time complexity is high so to reduce the time complexity we are 
//use the Rabin Karp Algorithm.In which Hashing is used to find out the pattern.
//T-O(n^2) & S-(1)
public class Find_Pattern
{
    static void findPattern(String S,String pat)
    { 
        int N=S.length();
        int M=pat.length();
        for(int i=0;i<=N-M;i++)
        {
         int j; 
          for(j=0;j<M;j++)  
          { 
             if(S.charAt(i+j)!=pat.charAt(j))
             {
                 break;
             }
          }
          if(j==M) 
          {
              System.out.println("Pattern Found At Index: "+i);
          } 
        }  
    }
    public static void main(String args [])
    {
     String S="Borse Abhishek Kailas Abhishek";
     String pat="Abhi";
     findPattern(S,pat);
    }
}
