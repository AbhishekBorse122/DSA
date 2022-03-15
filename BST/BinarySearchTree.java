// Binary ST insertion we insert data in BST by recursive method so that's why we use two method insert & insertUtil for BST.
import java.util.Queue;
import java.util.LinkedList;
import java.util.*;
public class BinarySearchTree
{
  Node Root;
  static class Node
  {
    int data;
    Node left;
    Node right;
    Node(int data)
    {
      this.data = data;
      left=right= null;        
    }
  }
  public void insert(int data)
  {
    Root = insertUtil(Root,data);
  }
  public Node insertUtil(Node N, int data)
  {
    if(N == null)
    {
      return new Node(data);
    }
    if(data < N.data)
    {
      N.left = insertUtil(N.left, data);
    }
    else if(data > N.data)
    {
      N.right = insertUtil(N.right, data);
    }
    return N;
  }
  public int findMin(Node N)
  {
    while(N.left!=null)
    {
      N=N.left;
    }
    return N.data;
  }
  public int findMax(Node N)
  {
    while(N.right!=null)
     {
      N=N.right;
     }
     return(N.data);
  }
  public void Delete(int Data)
  {
   Root=DeleteNode(Root,Data);
  }
  public Node DeleteNode(Node N,int Data)
  {
    if (N==null)
    {
      return N;
    }
    if(Data<N.data)
    {
      N.left=DeleteNode(N.left,Data);
    }
    else if(Data>N.data)
    {
      N.right=DeleteNode(N.right,Data);
    }
    else
    {
      if(N.left==null)
      {
        return N.right;
      }
      else if(N.right==null)
      {
        return N.left;
      }
      N.data=findMax(N.left);
      N.left=DeleteNode(N.left,N.data);
    }
   return N;
  }
  public boolean find(int Data)
  {
    Node current = Root;
    while(current.data != Data)
    {
      if( Data < current.data)
        current = current.left;
      else
        current = current.right;
      if(current == null)
      {
        System.out.println(Data+" Node is Not Found");
        return false;
      }
    }
    System.out.println(Data+" Node is Found");
    return true;
  }
  public void inOrder(Node N)
  {
    if(N!= null)
    {
      inOrder(N.left);
      System.out.print("  "+N.data);
      inOrder(N.right);
    }
  }
  public void preOrder(Node N)
  {
    if(N != null){
      System.out.print("  "+N.data);
      preOrder(N.left);           
      preOrder(N.right);
    }
  }
  public void postOrder(Node N)
  {
    if(N != null)
    {
      postOrder(N.left);
      postOrder(N.right);
      System.out.print("  "+N.data);
    }
  }
  public void LevelOrder(Node N)
  {
    Node temp;
    Queue<Node> Q=new LinkedList<>(); 
    if(Root==null)
    {
      return;
    }
    else
    {
     Q.add(Root);
    } 
    while(!Q.isEmpty())
    {
      temp=Q.remove();
      System.out.print("  "+temp.data);
      if(temp.left!=null)
      {
        Q.add(temp.left);
      }
      if(temp.right!=null)
      {
        Q.add(temp.right);
      }
    }
  }
  public int size(Node N)
  {
     if(N==null)
     {
       return 0;
     } 
    else
    {
      return(size(N.left)+1+size(N.right));
    }
  }
  public static void main(String[] args)
  {
    BinarySearchTree b= new BinarySearchTree();
    b.insert(20);
    b.insert(70);
    b.insert(40);
    b.insert(30);
    b.insert(90);
    b.insert(60);
    System.out.println();
    b.find(60);
    b.find(45);
    System.out.println("Size: "+b.size(b.Root));
    System.out.print("Inorder: ");
    b.inOrder(b.Root);
    System.out.print("\nPreorder: ");
    b.preOrder(b.Root);
    System.out.print("\nPostorder: ");
    b.postOrder(b.Root);
    System.out.print("\nLevelorder: ");
    b.LevelOrder(b.Root);
    b.Delete(60);
    System.out.print("\nAfter Deletion Inorder: ");
    b.inOrder(b.Root);
    System.out.println("\nMax Element: "+b.findMax(b.Root));
    System.out.println("Max Element: "+b.findMin(b.Root));
    

  }
}