//Check leaf Nodes are at Same h
//T-O(n)
//Recursive Approach
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class Leaf_Node_Level2
{
  static Node Root;
  static boolean ans;
  static int M=-1;
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
  public static void LeafNodes(Node N,int h)
  {
    if(N==null) return;
    if(!ans) return; 
    if(N.left==null && N.right==null){
      System.out.println(M+" "+h);
      if(M==-1){
         M=h;
      }else{
        if(h!=M){
          ans=false;
        }
      }
      return;
    }  
    LeafNodes(N.left,h+1);
    LeafNodes(N.right,h+1);
  }
  public static boolean check(Node N)
  {
   int h=0;
   ans=true;
   LeafNodes(N,h);
   return ans; 
  }
  public static void main(String[] args)
  {
  Leaf_Node_Level2 B= new Leaf_Node_Level2();
    Root=new Node(10);
    Root.left=new Node(2);
    Root.right=new Node(6);
    Root.left.left=new Node(8);
    Root.left.right=new Node(4);
    Root.right.left=new Node(7);    
    Root.right.right=new Node(5);     
    Root.left.left.right=new Node(34);
    if(check(Root))
    { System.out.print("Binary Tree Leaf Nodes are at same level"); }
    else
    { System.out.print("Binary Tree Leaf Node are Not at same level");}   
  }
}