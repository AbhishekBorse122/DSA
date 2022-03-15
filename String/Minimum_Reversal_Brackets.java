//Program to find the minimum reversal required to make Expression Balanced.
//T-O(n) & S-O(n)
//It is Efficient approcah & this program only take a String with '{' or '}' brakets not for differ brackets.
import java.util.*;
import java.util.Stack;
public class Minimum_Reversal_Brackets
{
    static int minimumReversal(String S)
    { 
        int l=S.length();//     String S="}{{}{}";
        if(l%2!=0)
        {
            return -1;
        }
        Stack<Character> A=new Stack<>();
        for(int i=0;i<l;i++)
        {
         char c=S.charAt(i);   
         if(c=='}' && !A.empty())
          {
           if(A.peek()=='{')
            {
              A.pop();
            }
            else
             A.push(c);
          }
          else
           A.push(c);   
        }
       int reduce=A.size();
       int n=0;
       while(!A.empty() && A.peek()=='{')
       {
           A.pop();
           n++;
       } 
       return(reduce/2+n%2);
    }
    public static void main(String args [])
    {
     String S="}{{}{{";
     System.out.print("Minimum Reversal: "+minimumReversal(S));
    }
}