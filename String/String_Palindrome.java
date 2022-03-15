public class String_Palindrome
{
    static boolean isPalindrome(String S)
    {
      int i=0,j=S.length()-1;
      while(i<j)
      {
          if(S.charAt(i)!=S.charAt(j))
          {
            System.out.print("String is Not Palindrome");  
            return false;
          }
          i++;
          j--;
        System.out.println("i: "+i); 
      }
      System.out.println("String is Palindrome");
      return true;
    }
    public static void main(String args[])
    {
        String S="MAKAMAKAM";
        isPalindrome(S);
    }
}