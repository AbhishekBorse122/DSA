//Program to find the largest Substring Palindrome.
//T-O(n^2) & S-O(1)
public class Longest_Palindrome
{
    static String longestPalindrome(String S)
    {
      int start=0,end=1;
      int l,h,n=S.length();
      for(int i=1;i<n;i++)
      {
        //even substring
        l=i-1;
        h=i;
        while(l>=0 && h<n && S.charAt(l)==S.charAt(h))
        {
          if(h-l+1>end)
          {
            start=l;
            end=h-l+1;
          }
          l--;
          h++;
        }
        //odd substring
        l=i-1;
        h=i+1;
        while(l>=0 && h<n && S.charAt(l)==S.charAt(h))
        {
          if(h-l+1>end)
          {
            start=l;
            end=h-l+1;
          }
          l--;
          h++;
        }
      }  
      return S.substring(start,start+end);
    }
    public static void main(String args [])
    {
     String S="forGeeksskeeGfor";
     System.out.println("Palindrome: "+longestPalindrome(S));
    }
}