// T-O(n)
//              10
//         11         57
//     94     15   84    18
//       23 
import java.util.*;
public class  Boundary_Traversal
{
  static Node Root;
  static List<Integer> A=new ArrayList<>();
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
  static void leftBoundary(Node N)
  {
   if(N==null) return;
   if(N.left!=null){
     A.add(N.data);
     leftBoundary(N.left);
   }else if(N.right!=null){
     A.add(N.data);
     leftBoundary(N.right);
   }
  }
  static void rightBoundary(Node N)
  {
    if(N==null) return;
    if(N.right!=null){
     rightBoundary(N.right);
     A.add(N.data);
    }else if(N.left!=null){
     rightBoundary(N.left);
     A.add(N.data);
    }
  }
  static void printLeaf(Node N)
  {
    if(N==null) return;
    printLeaf(N.left);
    if(N.left==null && N.right==null){
     A.add(N.data);
    }    
    printLeaf(N.right);
  }
  static void boundaryTraversal(Node N)
  {
    if(N==null) return;
    A.add(N.data);
    // print left boundary with top to bootom.
    leftBoundary(N.left);
    // print the leaf node for the left subtree.
    printLeaf(N.left);
    // print the right node for the left subtree. 
    printLeaf(N.right);
    // print right boundary with bottom to top.
    rightBoundary(N.right);
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
    // insert(98);
    // insert(54);
    // insert(38);
    boundaryTraversal(Root); 
  }
}