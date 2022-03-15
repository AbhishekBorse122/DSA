//Check Trees are Mirror Trees or Not.
//T-O(n)
//Recursive Approach
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class  Check_Mirror_Trees
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
  public static boolean areMirror(Node a,Node b)
  {
    //Base case : both Empty
    if(a==null && b==null)
      return true;
    // If only one is Empty  
    if(a==null || b==null)
      return false;  
    return a.data==b.data && areMirror(a.left,b.right) && areMirror(a.right,b.left);
  }
  public static void main(String[] args)
  {
    Check_Mirror_Trees B= new  Check_Mirror_Trees();
    Node a=new Node(1);
    a.left=new Node(2);
    a.right=new Node(3);
    a.left.left=new Node(4);
    a.left.right=new Node(5);

    Node b=new Node(1);
    b.left=new Node(3);
    b.right=new Node(2);
    b.right.left=new Node(5);    
    b.right.right=new Node(4);     
    if(areMirror(a,b)==true)
    { System.out.print("This Binary Trees are Mirror of Each Other"); }
    else
    { System.out.print("This Binary Trees are Not Mirror of Each Other"); }
  }
}