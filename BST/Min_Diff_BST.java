import java.util.*;
public class Min_Diff_BST
{
    static Node prev = null;
    static int ans = Integer.MAX_VALUE;
    static Node Root=null;
    static class Node
    {
      int data;
      Node left,right;
      Node(int data){
         this.data=data;
      }
    }    
    public static void inorder(Node Root){
        if(Root != null){
            inorder(Root.left);
            if(prev != null){
                ans = Math.min(ans, Root.data - prev.data);
            }
            prev = Root;
            inorder(Root.right);
        }
    }
    public static int getMinimumDifference(Node Root) {
        inorder(Root);
        return ans;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
      Root = new Node(1);
      Root.right = new Node(5);
      Root.right.left = new Node(3);
      Root.right.left.left = new Node(2);
      Root.right.left.right = new Node(4);
      System.out.print("Minimum Difference: "+getMinimumDifference(Root));
  }
}