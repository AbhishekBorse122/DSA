// There is small error in program
import java.util.*;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.LinkedList;
public class Bottom_View
{
  static Node Root;
  static class Node
  {
    int data,hd;
    Node left,right;
    Node(int data)
    {
      this.data = data;
      hd=Integer.MAX_VALUE;
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
  public static void bottomView(Node N)
  {
    if(N==null) return;
    int hd=0;
    Map<Integer,Integer> M=new TreeMap<>();
    Queue<Node> Q=new LinkedList<>();
    N.hd=hd;
    Q.add(N);
    while(!Q.isEmpty())
    {
      Node temp=Q.remove();
      hd=temp.hd;
      M.put(hd,temp.data);
      if(temp.left!=null)
      {
        temp.left.hd=hd-1;
        Q.add(temp.left);
      }
      if(temp.right!=null)
      {
        temp.right.hd=hd+1;
        Q.add(temp.right);        
      }
    }
    Set<Entry<Integer,Integer>> S=M.entrySet();
    Iterator<Entry<Integer,Integer>>I=S.iterator();
    while(I.hasNext()){
      Map.Entry<Integer,Integer> Me=I.next();
      System.out.print(" "+Me.getValue());
    }
  }
  public static void main(String[] args)
  {
    insert(10);
    insert(11);
    insert(57);
    insert(94);
    insert(15);
    insert(84);
    insert(18);
    Root.left.left.right=new Node(23);
    System.out.print("\nLeftView: ");
    bottomView(Root);
  }
}
//              10
//         11         57
//     94     15   84    18
//       23 

