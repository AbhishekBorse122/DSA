//Program to find out the pattern in the String.In which Rabin Karp Algo is used and use the hashing technique to find out the pattern.
//T-O(n+m) average case & O(nm) in worst case.
public class Rabin_Karp_Algo
{
    static final int d=256;
    static void findPattern(String S,String pat,int q)
    { 
        int M=pat.length();
        int N=S.length(),i,j;
        int p=0,t=0,h=1;
        for(i=0;i<M-1;i++)
        {
          h=(h*d)%q;
        }
        for(i=0;i<M;i++)
        {
          p=(d*p+pat.charAt(i))%q;
          t=(d*t+S.charAt(i))%q;
        }    
        for(i=0;i<=N-M;i++)  
        {
          if(p==t)
           {
             for(j=0;j<M;j++)
             {
                if(S.charAt(i+j)!=pat.charAt(j))
                {
                    break;
                } 
             }
             if(j==M)
               System.out.println("Pattern Found At Index: "+i);        
            }
          if(i<N-M)
           {
            t=(d*(t-S.charAt(i)*h)+S.charAt(i+M))%q;
            if(t<0)
              t=t+q;
           }    
        }
    }
    public static void main(String args [])
    {
     String S="Borse Abhishek Kailas";
     String pat="Abhi";
     int q=10;
     findPattern(S,pat,q);
    }
}
