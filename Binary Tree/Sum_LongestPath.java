//Sum of Nodes of Longest Path from the Root to Leaf Node 
//T-O(n)
// Sum of Longest Path is 30 if two longest path is exist in the Binary T then max sum will consider 
//         10 
//       3    6
//     8  4  7  5
//   9            1
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class  Sum_LongestPath
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
  static int maxSum;
  static int maxLen;
  public static void sumOfPath(Node N,int sum,int len)
  {
   if(N==null){
     if(maxLen<len){
       maxLen=len;
       maxSum=sum;
     }
     else if(maxLen==len && maxSum<sum){
      maxSum=sum;
     }
     return;
   }
   sumOfPath(N.left,sum+N.data,len+1);
   sumOfPath(N.right,sum+N.data,len+1);
  }
  public static int sumOfPathUtil(Node N)
  {
    if(N==null){
      return 0;
    }
    maxSum=Integer.MIN_VALUE;
    maxLen=0;
    sumOfPath(N,0,0);
    return maxSum;
  }
  public static void main(String[] args)
  {
    Sum_LongestPath B= new  Sum_LongestPath();
    Root=new Node(10);
    Root.left=new Node(3);
    Root.right=new Node(6);
    Root.left.left=new Node(8);
    Root.left.right=new Node(4);
    Root.right.left=new Node(7);    
    Root.right.right=new Node(5);     
    Root.left.left.left=new Node(9);
    Root.right.right.right=new Node(1);
    System.out.print("Sum Of Longest Path: "+sumOfPathUtil(Root));   
  }
}
