// Postorder Traversal by Iterative Method.
// We use Stack for Postorder Traversal.
// T-O(n)
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class Preorder_Iterative
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
  public static void insert(int Data)
  {
      if(Root==null)
      {
        Root=new Node(Data);
        return;
      }
      Node temp=Root;
      Queue<Node> Q=new LinkedList<>();
      Q.add(temp);
      while(!Q.isEmpty())
      {
        temp=Q.remove();
        if(temp.left==null)
        {
          temp.left=new Node(Data);
          break;
        }
        else
        {
          Q.add(temp.left);
        }
        if(temp.right==null)
        {
          temp.right=new Node(Data);
          break;
        }
        else
        {
          Q.add(temp.right);
        }
      } 
  }
  public static void preOrder(Node N)
  {
    if(N==null)
       return;
    Stack<Node> S=new Stack<>();
    Node Curr=N;
    // Traverse the Tree
    while(Curr!=null || !S.isEmpty())
    {
        while(Curr!=null)
        {
           System.out.print(" "+Curr.data);
           if(Curr.right!=null) 
           { 
             S.push(Curr.right); 
           }
           Curr=Curr.left;
        }
        if(!S.isEmpty())
        {
          Curr=S.pop();
        }
    }  
  }
  public static void main(String[] args)
  {
    Preorder_Iterative B= new Preorder_Iterative();  
    insert(13);
    insert(12);
    insert(11);
    insert(10);
    insert(9);
    insert(7);
    insert(8);
    System.out.print("\nPreOrder: ");
    preOrder(Root);
  }
}
//          10
//     11        57
//  94    15  84    18