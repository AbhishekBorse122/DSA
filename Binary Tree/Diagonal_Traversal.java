//T-O(n)
//              10
//         11         57
//     94     15   84    18
//       23 
import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;
public class  Diagonal_Traversal
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
  static void diagonalTraversal(Node N)
  {// simple logic is behind this is that continuosly print the right Nodes of Binary Tree & with this add their respective left Node to the Queue 
  // so when there is no right Node is present then retrieve the Queue element & again repeat the above procedure for that Nodes.  
   Queue<Node> Q=new LinkedList<>();
   List<Integer> A=new ArrayList<>();
   if(N==null) return;
   Q.add(N);
   while(!Q.isEmpty())
   {
     Node temp=Q.poll();
     while(temp!=null)
     {
      if(temp.left!=null)
      {
        Q.add(temp.left);
      } 
      A.add(temp.data); 
      temp=temp.right;
     }
   }
   System.out.println(A);
  }
  public static void main(String[] args)
  {
    insert(10);
    insert(11);
    insert(57);
    insert(94);
    insert(15);
    insert(84);
    insert(18);
    Root.left.left.right=new Node(23);
    diagonalTraversal(Root); 
  }
}