// The Program is to find out the distance between the two Nodes in BinaryTree. 
// In this we findout the lowest common ancestor & then calculate the distance of n1  & n2 from LCA
// then simply add their distance values we get the distance of Two nodes.
// T-O(n)
// Recursive Approach
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class  Node_Distance
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
  public static Node LCA(Node N,int n1,int n2)
   {//LCA findOut the lowest common ancestor.
    if(N==null){
      return N;
    }
    if(N.data==n1 || N.data==n2){
      return N;
    }
    Node L=LCA(N.left,n1,n2);
    Node R=LCA(N.right,n1,n2);
    if(L!=null && R!=null){
      return N;
    }
     if(L==null && R==null){
      return null;
    }
    if(L!=null){
      return LCA(N.left,n1,n2);
    }
     else{
      return LCA(N.right,n1,n2);
    }
  }
  public static int findLevel(Node N,int n1,int level)
  {
    if(N==null)
    {
        return -1;
    }
    if(N.data==n1)
    {
        return level;
    }
    int left=findLevel(N.left,n1,level+1);
    if(left==-1)
    {
        return findLevel(N.right,n1,level+1);
    }
    return left;
  }
  public static int findDist(Node N,int n1,int n2)
  {
    Node L=LCA(N,n1,n2);
    int d1=findLevel(L,n1,0);
    int d2=findLevel(L,n2,0);
     return d1+d2;
  }
  public static void main(String[] args)
  {
    Node_Distance B= new  Node_Distance();
    Root=new Node(10);
    Root.left=new Node(2);
    Root.right=new Node(6);
    Root.left.left=new Node(8);
    Root.left.right=new Node(4);
    Root.right.left=new Node(7);    
    Root.right.right=new Node(5);     
    Root.left.left.right=new Node(9);
    System.out.println("Distance: "+findDist(Root,9,5)); 
    System.out.println("Distance: "+findDist(Root,4,5)); 
    System.out.println("Distance: "+findDist(Root,6,8)); 
    System.out.println("Distance: "+findDist(Root,10,9)); 
  }
}
//      10
//    2    6
//  8  4  7 5
//   9