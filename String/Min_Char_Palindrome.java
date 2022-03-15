//Program to find out the minimum characters required to add at the front to make string Palindrome.
//Best Approach 
public class Min_Char_Palindrome
{
    static boolean isPalindrome(String S)
    {
      int i=0,j=S.length()-1;
      while(i<j)
      {
        if(S.charAt(i)!=S.charAt(j))
         {
            return false;
         }
         i++;
         j--;
      }
      return true;
    }
    static void minChar(String S)
    {
        int cnt=0,flag=0;
        while(S.length()>0)
        {
          if(isPalindrome(S))
          {
              flag=1;
              break;
          }
          else
          {
              cnt++;
              S=S.substring(0,S.length()-1);
          }
        }
        if(flag==1)
        {
            System.out.println("Minimum Characters: "+cnt);
        }
    }
	public static void main(String args[])
	{
		String S ="aacecaaaa";
    String F="addidas";
		minChar(S);
		minChar(F);
	}
}
