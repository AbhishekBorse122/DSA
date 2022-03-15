// Diameter of Tree is Number of Nodes between the two longest path.Here two longest path are 22-54 and 22-99.So Diameter of Binary Tree is
// 54-99 i.e 6.
// T-O(N)
//           22
//      42       37
//   12       99    21
// 54
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class  BinaryTree_Diameter
{
  static Node Root;
  static int Max=Integer.MIN_VALUE;
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
  public static int maxHeight(Node N)
  {
   if(N==null)
   {
     return 0;
   }
   int lHeight=maxHeight(N.left);
   int rHeight=maxHeight(N.right);
   Max=Math.max(Max,1+lHeight+rHeight);//so diameter becomes (left+right)subtree height+1 & Max variable store the Max diameter so far.
   return Math.max(lHeight,rHeight)+1;
  } 
  public static int Diameter(Node N)
  {
    if(N==null)
    {
      return 0;
    }
    int Height=maxHeight(N);//Max will return the answer for it.
    return Max;
  }
  public static void main(String[] args)
  {
    BinaryTree_Diameter B= new  BinaryTree_Diameter();
    Root=new Node(22);
    Root.left=new Node(42);
    Root.right=new Node(37);
    Root.left.left=new Node(12);
    Root.left.left.left=new Node(54);
    Root.right.left=new Node(99);    
    Root.right.right=new Node(21);    
    Diameter(Root);
    System.out.print("\nMax Diameter of Binary Tree: "+Diameter(Root));
  }
}
