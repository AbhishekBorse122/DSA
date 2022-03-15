public class IsPalindrome
{  
    static boolean isPalindrome(String a,int i,int j)
    {
     if(i>j){
       return true;
     } 
     if(a.charAt(i)!=a.charAt(j)){
       return false;
     }
     return isPalindrome(a,i+1,j-1); 
    }    
    public static void main(String[] args)
    {
      String a="indni";
      System.out.println(isPalindrome(a,0,a.length()-1));
    }
}