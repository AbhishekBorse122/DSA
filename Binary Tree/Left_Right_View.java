// Left view of Binary Tree means the Node we can see from left view.
// Right view of Binary Tree means the Node we can see from right view.
// T-O(n)
//              10
//         11         57
//     94     15   84    18
//       23            67

//  L.V- 10 11 94 23   R.V-10 57 18
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class Left_Right_View
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
  public static void leftView(Node N)
  {
    if(N==null)
    {
      return;
    }
    Queue<Node> Q=new LinkedList<>(); 
    Q.add(N);
    while(!Q.isEmpty())
    {
     int n=Q.size();
     for(int i=0;i<n;i++)
     {
      Node temp=Q.poll(); 
      if(i==0)
      {
        System.out.print(" "+temp.data);
      }
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
  }
  public static void rightView(Node N)
  {
    if(N==null)
    {
      return;
    }
    Queue<Node> Q=new LinkedList<>(); 
    Q.add(N);
    while(!Q.isEmpty())
    {
     int n=Q.size();
     for(int i=0;i<n;i++)
     {
      Node temp=Q.poll(); 
      if(i==n-1)
      {
        System.out.print(" "+temp.data);
      }
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
  }
  public static void main(String[] args)
  {
   Left_Right_View B= new Left_Right_View();  
    insert(10);
    insert(11);
    insert(57);
    insert(94);
    insert(15);
    insert(84);
    insert(18);
    Root.left.left.right=new Node(23);
    Root.right.right.left=new Node(67);
    System.out.print("\nLeftView: ");
    leftView(Root);
    System.out.print("\nRightView: ");
    rightView(Root);    
  }
}