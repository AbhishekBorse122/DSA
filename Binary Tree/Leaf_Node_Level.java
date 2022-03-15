//Check leaf Nodes are at Same Level
//T-O(n)
//Recursive Approach
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class Leaf_Node_Level
{
  static int count1,count2; 
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
  static class Leaf
  {
      int leafLevel=0;
  }  
  static Leaf L=new Leaf();
  public static boolean LeafNodes(Node N,int level,Leaf L)
  {
    if(N==null)
      return true;
    if(N.left==null && N.right==null)
    {
      if(L.leafLevel==0)
      {
         L.leafLevel=level;
         return true;
      }
      return (level==L.leafLevel);
    }  
    return LeafNodes(N.left,level+1,L)
           && LeafNodes(N.right,level+1,L) ;
  }
  public static boolean check(Node N)
  {
   int level=0;
   return LeafNodes(N,level,L); 
  }
  public static void main(String[] args)
  {
    Leaf_Node_Level B= new  Leaf_Node_Level();
    Root=new Node(10);
    Root.left=new Node(2);
    Root.right=new Node(6);
    Root.left.left=new Node(8);
    Root.left.right=new Node(4);
    Root.right.left=new Node(7);    
    Root.right.right=new Node(5);     
    Root.left.left.right=new Node(34);
    if(check(Root))
    { System.out.print("Binary Tree Leaf Nodes are at same Level"); }
    else
    { System.out.print("Binary Tree Leaf Node are Not at same Level");}   
  }
}