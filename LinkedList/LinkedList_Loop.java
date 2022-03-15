//Program to Detect the Loop in the LinkedList(Floyd's Algorithm)
//T-O(n) & S-O(1)
//It is very Simple technique of two Pointers are use fast & slow ptr.fast ptr move by two and slow ptr move by one 
//if loop is present in the linkedlist then both ptr will meet at a any node that means loop is present in the linkedlist. 
public class LinkedList_Loop
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
    static void frontInsert(LinkedList_Loop L,int d)
    {
      Node F=new Node(d);
      F.next=L.head;
      L.head=F;
    }
    static void printList(LinkedList_Loop L)
    {
        Node current=L.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    } 
    static void detectLoop(LinkedList_Loop L)
    { 
      Node slow=L.head,fast=L.head;
      int flag=0;
      while(slow!=null && fast!=null && fast.next!=null)
      {
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)
        {
          flag=1;
          break;
        }
      }
      if(flag==1)
       {
         System.out.print("\nLoop Found");
       }
      else
       {
         System.out.print("\nNo Loop Found");
       } 
    }
    public static void main(String args[])
    {
     LinkedList_Loop L=new LinkedList_Loop();
     frontInsert(L,34);
     frontInsert(L,12);
     frontInsert(L,19);
     frontInsert(L,23);
     frontInsert(L,86);
     frontInsert(L,51);
     frontInsert(L,44);
    // frontInsert(L,67);
     printList(L);
     L.head.next.next.next.next.next.next.next=L.head.next;
     detectLoop(L);
    }
}