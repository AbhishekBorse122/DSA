//Create a Binary Tree from the Bracket containing String.
// T-O(n) S-O(1)
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class String_Binary_Tree
{
  static Node Root;
  static class Node
  {
    int data;
    Node left,right;
    Node(int data)
    {
      this.data = data;
      left=right= null;        
    }
  }
  static int start=0;
  public static Node constructTree(String S)
  {
   if(S.length()==0|| S==null)
   {
       return null;
   }   
   if(start>=S.length())
   {
    return null;
   }
   boolean neg=false;
   if(S.charAt(start)=='-')
   {
       neg=true;
       start++;
   }
   int num=0;
   while(start<S.length() && Character.isDigit(S.charAt(start)))
   {
    int digit=Character.getNumericValue(S.charAt(start));
    num=num*10+digit;
    start++;   
   }
   if(neg)
   {
       num=-num;
   }
   Node N=new Node(num);
   if(start>=S.length())
   {
      return N;
   }
   if(start<S.length() && S.charAt(start)=='(')
   {
       start++;
       N.left=constructTree(S);
   }
   if(start<S.length() && S.charAt(start)==')')
   {
       start++;
       return N;
   }
    if(start<S.length() && S.charAt(start)=='(')
   {
       start++;
       N.right=constructTree(S);
   }
   if(start<S.length() && S.charAt(start)==')')
   {
       start++;
       return N;
   }
   return N;
  }
  public static void preOrder(Node N)
  {
    if(N!= null)
    {
      System.out.print("  "+N.data);
      preOrder(N.left);
      preOrder(N.right);
    }
  }
  public static void main(String[] args)
  {
    String_Binary_Tree B= new String_Binary_Tree();  
    String S="4(2(3)(1))(6(5))";
    Node N=constructTree(S);
    preOrder(N);
  }
}
