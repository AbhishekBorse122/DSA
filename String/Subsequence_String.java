//Program to print all the Subsequence of String.
import java.util.*;
public class Subsequence_String
{
    static ArrayList<String> A=new ArrayList<>();
    static void sequenceString(String S,String ans)
    {   
     if(S.length()==0)
      {
        //System.out.print(ans+" ");
        A.add(ans);
        return;
      } 
     sequenceString(S.substring(1),ans+S.charAt(0));
     sequenceString(S.substring(1),ans);
    }
    public static void main(String args [])
    {
     String S="ABHI";
     sequenceString(S,"");
     System.out.print(A);
    }
}