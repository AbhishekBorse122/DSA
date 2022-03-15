//Program to Find that Trees are Isomorphic or Not.
//Tree is are isomorphic if one of them can be obtained from the other by series of flips. 
import java.util.*;
public class Tree_Isomorphism
{
 static Node Root1,Root2;  
 static class Node
 {
   int data;
   Node left,right;
   Node(int data)
   {
       this.data=data;
       left=right=null;
   }
 };
 public static boolean isIsomorphic(Node N,Node M)
 {
    //if both are not point then trees are isomorphic by defination
     if(N==null && M==null){   
       return true;
     } 
    //if one of them is null then they are not isomorphic
     if(N==null || M==null){
         return false;
     }
    //  if the data is not same then return false
     if(N.data!=M.data){
         return false;
     } 
     return ((isIsomorphic(N.left,M.left) && isIsomorphic(N.right,M.right)) || (isIsomorphic(N.left,M.right) &&isIsomorphic(N.right,M.left)));
 }
 public static void main(String args[])
 {
    Tree_Isomorphism B= new Tree_Isomorphism();  
    Root1=new Node(1);
    Root1.left=new Node(2);
    Root1.right=new Node(3);
    Root1.left.left=new Node(4);
    Root1.left.right=new Node(5);
    Root1.right.left=new Node(6);    
    Root1.left.right.left=new Node(7); 
    Root1.left.right.right=new Node(8); 

    Root2=new Node(1);
    Root2.right=new Node(2);
    Root2.left=new Node(3);
    Root2.right.left=new Node(4);
    Root2.right.right=new Node(5);    
    Root2.left.right=new Node(6);
    Root2.right.right.right=new Node(7); 
    Root2.right.right.left=new Node(8); 
    System.out.println("Trees Isomorphic: "+isIsomorphic(Root1,Root2));
 }
}