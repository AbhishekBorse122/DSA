//Maximum Sum of Nodes in Binary Tree such that no Two are adjacent
//T-O(n)
//          10
//        1     3     // 4+5+10+2+5=26 no two nodes are adjacent
//     2    3      5
//   1     4 5
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class MaxSum_Nodes
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
  };
  public static Pair maxSumUtil(Node N)
  {
      if(N==null)
      {
        Pair P=new Pair(0,0);
        return P;
      }
      Pair S1=maxSumUtil(N.left);
      Pair S2=maxSumUtil(N.right);
      Pair Sum=new Pair(0,0);

      Sum.first=S1.second+S2.second+N.data;
      Sum.second=Math.max(S1.first,S1.second)+Math.max(S2.first,S2.second);
      return Sum;           
  }
  static class Pair
  {
   int first,second;
   Pair(int first,int second)
   {
    this.first=first;
    this.second=second;
   } 
  };
  public static int maxSum(Node N)
  {
   Pair P=maxSumUtil(N);
   return Math.max(P.first,P.second);
  }
  public static void main(String[] args)
  {
    Root=new Node(10);
    Root.left=new Node(1);
    Root.right=new Node(3);
    Root.left.left=new Node(2);
    Root.right.right=new Node(5);
    Root.left.left.left=new Node(1);
    Root.left.right=new Node(3);
    Root.left.right.left=new Node(4);
    Root.left.right.right=new Node(5);
    System.out.print("Sum Of Longest Path: "+maxSum(Root));   
  }
}
