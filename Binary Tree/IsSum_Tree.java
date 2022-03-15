// T-O(n) S-O(1) 
import java.util.*;
public class IsSum_Tree
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
  public static int sum(Node N)
    {
        if(N == null)
        {
            return 0;
        }
        return (sum(N.left)+N.data+sum(N.right));
  }
  public static int IsSumTree(Node N)
  {
        int ls,rs;
        // If Node is NULL or it's a leaf Node then return true
        if(N== null || (N.left == null && N.right == null))
        {
            return 1;
        }
        // Get sum of Nodes in left and
        // right subtrees
        ls = sum(N.left);
        rs = sum(N.right);
        // If the Node and both of its
        // children satisfy the property
        // return 1 else 0
        if((N.data == ls + rs) && IsSumTree(N.left) != 0 && IsSumTree(N.right) != 0)
        {
            return 1;
        }
        return 0;      
  }
  public static void main(String[] args)
  {
    IsSum_Tree B= new IsSum_Tree();  
    Root=new Node(10);
    Root.left=new Node(-2);
    Root.right=new Node(6);
    Root.left.left=new Node(8);
    Root.left.right=new Node(-4);
    Root.right.left=new Node(7);    
    Root.right.right=new Node(5);  
    if(IsSumTree(Root)!=0){
        System.out.print("Then Binary Tree is Sum Tree");
    }else{
        System.out.print("Then Binary Tree is Not Sum Tree");
    }    
  }
}
