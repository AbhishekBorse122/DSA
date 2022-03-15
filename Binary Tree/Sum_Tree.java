// Convert the Binary Tree into the Sum Tree.
// Sum Tree is Tree whose Node value is sum of the left & right subtree values and leaf node values are changed to 0.
// T-O(n) S-O(1) 
public class Sum_Tree
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
  public static int toSumTree(Node N)
  {
    // base case  
    if(N==null)
      {return 0;}
    // store old values  
    int old_v=N.data;
    // recursively called for left & right subtree values and there addition value store in the Node R
    N.data=toSumTree(N.left)+toSumTree(N.right);
    // return the sum of values of nodes in left & right subtrees & old_v of this Node.
    return N.data+old_v; 
  }
  public static void InOrder(Node N)
  {
    if(N!= null)
    {
      InOrder(N.left);
      System.out.print("  "+N.data);
      InOrder(N.right);
    }
  }
  public static void main(String[] args)
  {
    Sum_Tree B= new Sum_Tree();  
    Root=new Node(10);
    Root.left=new Node(-2);
    Root.right=new Node(6);
    Root.left.left=new Node(8);
    Root.left.right=new Node(-4);
    Root.right.left=new Node(7);    
    Root.right.right=new Node(5);  
    InOrder(Root);
    System.out.print("\n");
    toSumTree(Root);    
    InOrder(Root);
  }
}
//          10
//      -2     6
//    8   -4 7   5
//               