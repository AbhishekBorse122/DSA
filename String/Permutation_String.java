//Program to print all the Permutation of String.
//Backtraking Algorithm.
//T-O(n*n!) n-No of permutation,n!-permutation.
//It will print all the distinct permutation 
import java.util.List;
import java.util.ArrayList;
public class Permutation_String
{
    static void printPermutation(String S,String Answer)
    {   
        if(S.length()==0)
        {
          System.out.print(Answer+" ");
          return;
        }
        for(int i=0;i<S.length();i++)
        {
          char c=S.charAt(i);
          String left=S.substring(0,i);
          String right=S.substring(i+1);
          String R=left+right;
          printPermutation(R,Answer+c);
        }
    }
    public static void main(String args [])
    {
     String S="STD";
     String Answer="";
     printPermutation(S,Answer);
    }
}