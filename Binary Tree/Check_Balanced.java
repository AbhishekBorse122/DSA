//T-O(n)
//              10
//         11         57
//     94     15   84    18
//       23 
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class  Check_Balanced
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
 public static int height(Node N)
  {
    if(N == null)
        return 0;
    int l = height(N.left);
    int r = height(N.right);
    if(l == -1 || r == -1 || Math.abs(l - r) > 1)
       return -1;
    return Math.max(l , r) + 1;
  }
public static boolean isBalanced(Node N)
{
  if(N == null)return true;
  return (height(N) != -1);
}
public static void main(String[] args)
  {
    Check_Balanced B= new  Check_Balanced();
    insert(10);
    insert(11);
    insert(57);
    insert(94);
    insert(15);
    insert(84);
    insert(18);
    Root.left.left.right=new Node(23);
    // Root.left.left.right.left=new Node(34);
    if(isBalanced(Root))
    { System.out.print("Binary Tree is Balanced"); }
    else
    { System.out.print("Binary Tree is Not Balanced");}   
  }
}