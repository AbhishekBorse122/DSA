//Add each Node one by one in queue & while removing it just swap its left & right child node if exist 
//T-O(n)
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class  Mirror_Tree
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
public static void Mirror(Node N)
{
 if(N==null) return;
 Queue<Node> Q=new LinkedList<>();
 Q.add(N);   
 while(!Q.isEmpty())
 {
     Node Curr=Q.remove();
     Node temp=Curr.left;
     Curr.left=Curr.right;
     Curr.right=temp;
     if(Curr.left!=null)
     {
      Q.add(Curr.left);
     }
     if(Curr.right!=null)
     {
      Q.add(Curr.right);
     } 
 }
}
public static void inOrder(Node N)
{
    if(N!= null)
    {
      inOrder(N.left);
      System.out.print("  "+N.data);
      inOrder(N.right);
    }
}
public static void main(String[] args)
{
    Mirror_Tree B= new  Mirror_Tree();
    Root=new Node(22);
    Root.left=new Node(42);
    Root.right=new Node(37);
    Root.left.left=new Node(12);
    Root.left.left.left=new Node(54);
    Root.right.left=new Node(99);    
    Root.right.right=new Node(21);    
    System.out.print("\nTraversal Before Mirror: ");
    inOrder(Root);
    Mirror(Root);
    System.out.print("\nTraversal After Mirror: ");
    inOrder(Root);
}
}
//           22                             22
//      42       37        -->           37    42
//   12       99    21                21   99     12 
// 54                                                54