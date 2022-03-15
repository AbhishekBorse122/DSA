// T-O(n)
//              10
//        11         57
//    94      15   84    18
//       23 
// Zig Zag Traversal = 10 57 11 94 15 84 18 23 
import java.util.*;
import java.util.Stack;
public class Zig_Zag_Traversal
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
  public static void zigzagTraverse(Node T)
  {
    if(T==null)
      return;
    Stack<Node> Curr=new Stack<>();  
    Stack<Node> Next=new Stack<>();  
    Curr.push(T);
    boolean LeftToRight=true;
    while(!Curr.isEmpty())
    {
     Node temp=Curr.pop();
     System.out.print(" "+temp.data);
     if(LeftToRight)
     {
       if(temp.right!=null)
       {
         Next.push(temp.right);
       }
       if(temp.left!=null)
       {
         Next.push(temp.left);
       }
     }
     else
     {
       if(temp.left!=null)
       {
         Next.push(temp.left);
       }
       if(temp.right!=null)
       {
         Next.push(temp.right);
       }
     }
     if(Curr.isEmpty())
     {
      LeftToRight=!LeftToRight;
      Stack<Node>R=Curr;
      Curr=Next;
      Next=R;
     }
    }  
  }
  public static void main(String[] args)
  {
   Zig_Zag_Traversal B= new Zig_Zag_Traversal();  
    insert(10);
    insert(11);
    insert(57);
    insert(94);
    insert(15);
    insert(84);
    insert(18);
    Root.left.left.right=new Node(23);
    System.out.print("\nZig Zag Traversal- : ");
    zigzagTraverse(Root);   
  }
}