import java.lang.String;
import java.util.*;
public class Remove_Duplicate
{
    public static int count=0;
    Node head;
    static class Node
    {
     int data;
     Node next;
     public Node(int d)
     {
         data=d;
     } 
    }
    public static void frontInsert(Remove_Duplicate list,int d)
    {
    Node temp=new Node(d);
    temp.next=list.head;
    list.head=temp;
    count++;
    }
    public static void printList(Remove_Duplicate list)
    {
        Node current=list.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    public static void removeDuplicate(Remove_Duplicate L)//for sorted LinkedList
    {
      if(L.head==null){
          return; 
      }
      Node curr=L.head.next;
      Node prev=L.head;
      while(curr!=null)
      {
        if(prev.data==curr.data){
         prev.next=curr.next;
         curr=curr.next;
         continue;
        }
        prev=curr;
        curr=curr.next;
      }
    }
    public static void removeDuplicate1(Remove_Duplicate L)//for unsorted LinkedList
    {
      if(L.head==null){
          return; 
      }     
      ArrayList<Integer> A=new ArrayList<>();
      Node curr=L.head.next;
      Node prev=L.head;
      A.add(prev.data);
      while(curr!=null)
      {
        if(A.contains(curr.data)){
         prev.next=curr.next;
         curr=curr.next;
         continue;
        }
        prev=curr;
        A.add(prev.data);
        curr=curr.next;
      }
    }
    public static void main(String args [])
    {
     Remove_Duplicate R=new Remove_Duplicate();
     frontInsert(R,11);
     frontInsert(R,10);
     frontInsert(R,9);
     frontInsert(R,5);
     frontInsert(R,7);
     frontInsert(R,5);
     frontInsert(R,7);
     frontInsert(R,5);
     frontInsert(R,3);
     frontInsert(R,7);
     printList(R);
    //  removeDuplicate(R);// make sure that list is sorted
     removeDuplicate1(R);//  unsorted LinkedList
     printList(R);
    }
}