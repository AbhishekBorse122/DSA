// Postorder Traversal by Iterative Method.
// We use Stack for Postorder Traversal.
// T-O(n)
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class Postorder_Iterative
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
  public static void Postorder(Node N)
  {
    if(N==null)
       return;
    Stack<Node> S=new Stack<>();
    Node Curr=N;
    while(true)
    {
        while(Curr!=null)
        {
            S.push(Curr);
            S.push(Curr);
            Curr=Curr.left;
        }
        if(S.isEmpty())
        { 
          return;
        }
        Curr=S.pop();
        if(!S.isEmpty() && S.peek()==Curr)
        {
          Curr=Curr.right;
        }  
        else
        { 
          System.out.print(" "+Curr.data);   
          Curr=null;      
        }  
    }   
  }
  public static void main(String[] args)
  {
    Postorder_Iterative B= new Postorder_Iterative();  
    insert(10);
    insert(11);
    insert(57);
    insert(94);
    insert(15);
    insert(84);
    insert(18);
    System.out.print("\nPostorder: ");
    Postorder(Root);
  }
}
//          10
//     11        57
//  94    15  84    18