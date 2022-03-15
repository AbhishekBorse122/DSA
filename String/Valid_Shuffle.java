//Program to find the given String is Valid Shuffle of two Different String or Not.
import java.util.*;
public class Valid_Shuffle
{
    static String sortString(String str) 
    {
     char[] charArray = str.toCharArray();
     Arrays.sort(charArray);
     str = String.valueOf(charArray);
     return str;
    }
    static boolean isValidShuffle(String S1,String S2,String S3)
    {
      int l=S1.length(),m=S2.length(),n=S3.length();
      if(l+m!=n)
      {
       System.out.println("String is Not Valid Shuffle !!");  
       return false;
      }
      S1=sortString(S1);
      S2=sortString(S2);
      S3=sortString(S3);
      System.out.println(S1+" "+S2+" "+S3);
      int i=0,j=0,k=0;
      while(k!=n)
      {       
       if(i<l && S1.charAt(i)==S3.charAt(k)){
         i++;
       } 
       else if(j<m && S2.charAt(j)==S3.charAt(k)){
         j++;
       }
       else{
         System.out.println("Strings are Not Valid Shuffle !!"); 
         return false;  
       }
       k++;
      }
      if(i<l || j<m)// it means the any of the string is not present or 
      {
          return false;
      }
      System.out.println("Strings are Valid Shuffle !!");    
      return true;
    }
    public static void main(String args [])
    {
     String S1="abhi122";
     String S2="shek";
     String S3="abhishek122";
     isValidShuffle(S1,S2,S3);
     S3="asbhheki122";
     isValidShuffle(S1,S2,S3);
    }
}
