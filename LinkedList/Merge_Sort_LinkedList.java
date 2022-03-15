//Program to Sort the LinkedList using Merge Sort Algorithm.
//T-O(n*log_n) S-O(1)
//Merge Sort is Efficient Sorting Algorithm
public class Merge_Sort_LinkedList
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    } 
    static void frontInsert(Merge_Sort_LinkedList L,int d)
    {
      Node F=new Node(d);
      F.next=L.head;
      L.head=F;
    }
    static void printList(Merge_Sort_LinkedList L)
    {
        Node current=L.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static Node sortedMerge(Node Left,Node Right)
    {
     Node Res=null;
      if(Left==null)//if Left is null then return Right 
         return Right;
      if(Right==null)//if Right is null then return Left.
        return Left;
      if(Left.data<=Right.data){
        Res=Left;
        Res.next=sortedMerge(Left.next,Right);
       } 
      else
       {
        Res=Right;
        Res.next=sortedMerge(Left,Right.next);   
       }  
     return Res;
    }
    static Node mergeSort(Node H)
    {   
      if(H==null || H.next==null)  return H;
      Node Mid=getMiddle(H);//find the middle Node of the LinkedList
      Node nextMid=Mid.next;
      Mid.next=null;
      Node Left=mergeSort(H);//this recursive function execute till it break the whole List in Single Single Node.
      Node Right=mergeSort(nextMid);
      Node sortList=sortedMerge(Left,Right);
      return sortList;
    }
    static Node getMiddle(Node H)
    {
      if(H==null)//return if Node is empty.
      {
        return H;
      }
      Node slow=H,fast=H;//slow ptr move by 1 position and fast ptr will move by the 2 position
      while(fast.next!=null && fast.next.next!=null)//this loop execute only if the two Node are present after the Node which is point by fast ptr
      {
        slow=slow.next;//move slow ptr by 1
        fast=fast.next.next;//move fast ptr by 2
      }
      //at the end of this loop slow will pt the middle or middle+1 for odd Nodes LinkedList
      return slow;
    }
    public static void main(String args[])
    {
     Merge_Sort_LinkedList L=new Merge_Sort_LinkedList();
     frontInsert(L,14);
     frontInsert(L,27);
     frontInsert(L,72);
     frontInsert(L,13);
     frontInsert(L,21);
     frontInsert(L,19);
     frontInsert(L,91);
     printList(L);
     L.head=mergeSort(L.head);
     System.out.print("\nAfter Sorting");
     printList(L);
    }
}