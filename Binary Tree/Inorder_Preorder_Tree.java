// In this program we have given Inorder & Preorder Traversal of Binary Tree & we have to construct a tree with that.
// T-O(n)  &  S-(n) 
//         10
//     11      57 
//   94  15  84  18

import java.util.*;
import java.util.HashMap;
public class Inorder_Preorder_Tree
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
  static int preIndex=0;
  static HashMap<Integer,Integer> H=new HashMap<>();
  public static Node buildTree(int in[],int pre[],int inSta,int inEnd)
  {
      if(inSta > inEnd)
        {return null;}
      int curr=pre[preIndex++];
      Node N=new Node(curr);
      if(inSta == inEnd) 
      {
          return N;
      }  
      int inIndex=H.get(curr);
      N.left=buildTree(in,pre,inSta,inIndex-1);
      N.right=buildTree(in,pre,inIndex+1,inEnd);
      return N;
  }
  public static Node buildTreeWrap(int in[],int pre[])
  {
   int l=in.length;
   for(int i=0;i<l;i++)
   {
       H.put(in[i],i);
   }     
   return buildTree(in,pre,0,l-1);
  }
  public static void postOrder(Node N)
  {
    if(N!= null)
    {
      postOrder(N.left);
      postOrder(N.right);
      System.out.print("  "+N.data);
    }
  }
  public static void main(String[] args)
  {
    Inorder_Preorder_Tree B= new Inorder_Preorder_Tree();  
    int in[]={94,11,15,10,84,57,18}; 
    int pre[]={10,11,94,15,57,84,18};   
    Root=buildTreeWrap(in,pre);    
    System.out.print("PostOrder: ");
    postOrder(Root);
  }
}
