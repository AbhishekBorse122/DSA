//Maximum Sum of SubTree of Binary Tree
//T-O(n)
//          -1
//        3    6       here maxSum is 6+7+5+1=19
//      8 -4  7  5
//   -9           1
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class SubTree_Sum
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
  static int R=Integer.MIN_VALUE;
  public static int findMaxSum(Node N)
  {
   if(N==null) return 0;
   int curr=N.data+findMaxSum(N.left)+findMaxSum(N.right);
   R=Math.max(R,curr);
   return curr;
  }
  public static int subTreeSum(Node N)
  {
    if(N==null){
      return 0;
    }
    findMaxSum(N);
    return R;
  }
  public static void main(String[] args)
  {
    SubTree_Sum B= new  SubTree_Sum();
    Root=new Node(-1);
    Root.left=new Node(3);
    Root.right=new Node(6);
    Root.left.left=new Node(8);
    Root.left.right=new Node(-4);
    Root.right.left=new Node(7);    
    Root.right.right=new Node(5);     
    Root.left.left.left=new Node(-9);
    Root.right.right.right=new Node(1);
    System.out.print("Maximum Sum of SubTree: "+subTreeSum(Root));   
  }
}
