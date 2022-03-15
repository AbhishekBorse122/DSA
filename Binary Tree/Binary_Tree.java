import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class Binary_Tree
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
  public static void inOrder(Node N)
  {
    if(N!= null)
    {
      inOrder(N.left);
      System.out.print("  "+N.data);
      inOrder(N.right);
    }
  }
  public static void preOrder(Node N)
  {
    if(N != null){
      System.out.print("  "+N.data);
      preOrder(N.left);           
      preOrder(N.right);
    }
  }
  public static void postOrder(Node N)
  {
    if(N != null)
    {
      postOrder(N.left);
      postOrder(N.right);
      System.out.print("  "+N.data);
    }
  }
  public static void LevelOrder(Node N)
  {
    Node T;
    Queue<Node> Q=new LinkedList<>(); 
    if(Root==null)
    {
      return;
    }
    Q.add(Root);
    while(!Q.isEmpty())
    {
      T=Q.remove();// remove first from the Queue
      System.out.print("  "+T.data);
      if(T.left!=null)  // just add the left and right node of the first to Queue if node exist.
      {
        Q.add(T.left);
      }
      if(T.right!=null)
      {
        Q.add(T.right);
      }
    }
  }
  public static void main(String[] args)
  {
    Binary_Tree B= new Binary_Tree();  
    insert(10);
    insert(11);
    insert(57);
    insert(94);
    insert(15);
    insert(84);
    insert(18);
    System.out.print("\nInOrder: ");
    inOrder(B.Root);
    System.out.print("\nPreOrder: ");
    preOrder(Root);
    System.out.print("\nPostOrder: ");
    postOrder(Root);
    System.out.print("\nLevelOrder: ");
    LevelOrder(Root);
  }
}
//        10
//    11      57
//  94  15  84  18