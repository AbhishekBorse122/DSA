//This program is find out with different techinques.
//T-O(MAX*n*logn) n-is number of string in array & MAX-is the MAX number of character in array. 
import java.util.Arrays;
public class Long_Common_Prefix
{
    static String findPrefix(String S[])
    {
      int n=S.length;
      if(n==0)
        return "";
      if(n==1)
        return S[0];
      Arrays.sort(S);//String are sort on the basis of their Alphabetical Order.
      int end=0,k=0,l=n-1;
      while(k<l)// find the smallest word from the String Array
      {
        end=Math.min(S[k].length(),S[l].length());
        k++;
        l--;
      }
      int i=0;
      while(i<end && S[0].charAt(i)==S[n-1].charAt(i)){// prefix length will be less than that smallest word 
        i++;
      }   
      String P=S[0].substring(0,i);
      return P; 
    }
    public static void main(String args [])
    {
      String S[]={"addids","addition","adam","add"};
      System.out.println("Long Common Prefix: "+findPrefix(S));
    }
} 