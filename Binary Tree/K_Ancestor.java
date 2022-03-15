// Program to find the Kth Ancestor of Binary Tree.
// First we find the element from the Binary tree & then backtrack k times to reach the element.
// T-O(n)
// Recursive Approach
import java.util.*;
public class  K_Ancestor
{
  static Node Root,temp;
  static int k;
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
  public static Node kthAncestor(Node N,int nodeValue)
  {
    if(N==null) {
        return null;
    }
    if(N.data==nodeValue || (temp=kthAncestor(N.left,nodeValue)) !=null || (temp=kthAncestor(N.right,nodeValue))!=null)
    {
          if(k>0){
              k--;
          }
          else if(k==0){
              System.out.println("Kth Ancestor is: "+N.data);
              return null; 
          }
          return N;
    } 
      return null;
  }
  public static void main(String[] args)
  {
    K_Ancestor B= new  K_Ancestor();
    Root=new Node(10);
    Root.left=new Node(2);
    Root.right=new Node(6);
    Root.left.left=new Node(8);
    Root.left.right=new Node(4);
    Root.right.left=new Node(7);    
    Root.right.right=new Node(5);     
    Root.left.left.right=new Node(9);
    k=3;//ancestor
    Node parent=kthAncestor(Root,9);
    if(parent!=null){
    System.out.println("Kth Ancestor: -1"); 
    } 
  }
}
//      10
//    2    6
//  8  4  7 5
//   9