//Height of Tree is find by Recursive Function.
//T-O(n)
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class  BinaryTree_Height
{
  static Node Root;
  // static int count=0;//to check the how many times the function is run
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
    // count++;
    if(N==null)
    {
     return 0;
    } 
    int lHeight=maxHeight(N.left);
    int rHeight=maxHeight(N.right);
    return(Math.max(lHeight,rHeight)+1);
  }
  public static void main(String[] args)
  {
    BinaryTree_Height B= new  BinaryTree_Height(); 
    Root=new Node(22);
    Root.left=new Node(42);
    Root.right=new Node(37);
    Root.left.left=new Node(12);
    Root.left.right=new Node(54);
    Root.right.left=new Node(99);    
    Root.right.right=new Node(21);    
    System.out.print("\nMax Height of Binary Tree: "+maxHeight(Root));
    // System.out.print("\n"+count);
  }
}
//        22
//    42      37
//  12  54  99  21