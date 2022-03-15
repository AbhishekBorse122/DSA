import java.util.*;
public class Special_Palindrome
{
    public static boolean isPalindrome(String A){
        StringBuilder S=new StringBuilder(A);
        S.reverse();
        String N=S.toString();
        if(A.equals(N)){
            return true;
        }
         return false; 
    }
    public static String add(String A){
        StringBuilder S=new StringBuilder(A);
        S.reverse();
        String B=S.toString();
        int temp=Integer.valueOf(A)+Integer.valueOf(B);
        String ans=String.valueOf(temp);
        return ans;
    }
    public static int findPalindrome(int a){
        String S=String.valueOf(a);
        S=add(S);
        while(!isPalindrome(S)){
         S=add(S);
        }
        int ans=Integer.valueOf(S);
        return ans;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value: ");
        int a=s.nextInt();
        System.out.println(findPalindrome(a));
        s.close();
    }
}