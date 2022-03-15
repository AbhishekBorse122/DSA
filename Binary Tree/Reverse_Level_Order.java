//Simple Techinque is used to Reverse the Level Order.We use Stack along with the Queue & just EnQueue the 
//right child before the left child.This 2 change we made.
//T-O(n)
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class Reverse_Level_Order
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
  public static void ReverseLevelOrder(Node N)
  {
    Node T;
    Queue<Node> Q=new LinkedList<>(); 
    Stack<Node> S=new Stack<>();
    if(Root==null)
    {
      return;
    }
    Q.add(Root); 
    while(!Q.isEmpty())
    {
      T=Q.remove();
      S.push(T);
      // EnQueue Right child first then Left Child
      if(T.right!=null)
      {
        Q.add(T.right);
      }
      if(T.left!=null)
      {
        Q.add(T.left);
      }
    }
    while(!S.isEmpty())
    {
     Node temp=S.pop();
     System.out.print(" "+temp.data);
    }
  }
public static void main(String[] args)
  {
    Reverse_Level_Order B= new Reverse_Level_Order();
    Root=new Node(22);
    Root.left=new Node(42);
    Root.right=new Node(37);
    Root.left.left=new Node(12);
    Root.left.right=new Node(54);
    Root.right.left=new Node(99);    
    Root.right.right=new Node(21);    
    System.out.print("\nReverse LevelOrder: ");
    ReverseLevelOrder(Root);
  }
}
//           22                
//      42        37               
//   12    54  99    21         
// 
// 