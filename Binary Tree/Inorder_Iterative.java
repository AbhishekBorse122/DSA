// Inorder Traversal by Iterative Method.
// We use Stack for Inorder Traversal.
// T-O(n)
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class Inorder_Iterative
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
  public static void inOrder(Node N)
  {
    if(N==null)
       return;
    Stack<Node> S=new Stack<>();
    Node Curr=N;
    // Traverse the Tree
    while(Curr!=null || !S.isEmpty())
    {
    //Reach the end of left most Node 
        while(Curr!=null) //repeatedly add the left node & curr element is null then points the current to its right node
        {
            S.push(Curr);
            Curr=Curr.left;
        }
    //Current is null at this point 
        Curr=S.pop(); 
        System.out.print(" "+Curr.data);
    //We are visited the Node & left subtree now we Visited the right subtree.   
        Curr=Curr.right;
    }   
  }
  public static void main(String[] args)
  {
    Inorder_Iterative B= new Inorder_Iterative();  
    insert(10);
    insert(11);
    insert(57);
    insert(94);
    insert(15);
    insert(84);
    insert(18);
    System.out.print("\nInOrder: ");
    inOrder(Root);
  }
}
//          10
//     11        57
//  94    15  84    18