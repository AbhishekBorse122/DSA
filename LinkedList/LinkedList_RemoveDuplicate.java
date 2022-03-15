//Program to Remove the Duplicate from the sorted & UnSorted LinkedList 
// For Sorted - T-O(n) & S-O(1)
// For Unsorted- T-O(n) & S-O(n)
import java.util.HashSet;
public class LinkedList_RemoveDuplicate
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
    static void frontInsert(LinkedList_RemoveDuplicate L,int d)
    {
      Node F=new Node(d);
      F.next=L.head;
      L.head=F;
    }
    static void printList(LinkedList_RemoveDuplicate L)
    {
        Node current=L.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static void removeDuplicate1(LinkedList_RemoveDuplicate L)//For Sorted List 
    {
     Node Curr=L.head;
     while(Curr!=null)//loop run till the last node.
      {
        Node temp=Curr;//Now the temp & Curr are points to the same node
        while(temp!=null && temp.data==Curr.data)
        {//this loop move the temp till the new element node is not occur.
          temp=temp.next;
        }//at the end temp points to new element node.
        Curr.next=temp;//Curr.next holds the address of new element Node 
        Curr=Curr.next;//Curr points to this new element Node.
      }
    }
    static void removeDuplicate2(LinkedList_RemoveDuplicate L)//For Unsorted List.
    {
     HashSet<Integer> H=new HashSet<>();
     Node Curr=L.head;
     Node Prev=null;
     while(Curr!=null)
     {
       int value=Curr.data;
       if(H.contains(value))//if element is already in the HashSet then Remove the element i.e Node
        {
          Prev.next=Curr.next;//& connect the Next Node of Deleted Node with the Prec=v Node.
        }
       else//Otherwise add this Value to HashSet 
        {
          H.add(value);
          Prev=Curr;//& Prev maintain the previous Node of the Current Node. 
        }
      Curr=Curr.next;
     } 
    }
    public static void main(String args[])
    {
         LinkedList_RemoveDuplicate L=new LinkedList_RemoveDuplicate();
     frontInsert(L,34);
     frontInsert(L,29);
     frontInsert(L,29);
     frontInsert(L,23);
     frontInsert(L,16);
     printList(L);
     removeDuplicate1(L);
     printList(L);
         LinkedList_RemoveDuplicate L1=new LinkedList_RemoveDuplicate();
     frontInsert(L1,42);
     frontInsert(L1,89);
     frontInsert(L1,66);    
     frontInsert(L1,75);
     frontInsert(L1,46);
     frontInsert(L1,66);
     frontInsert(L1,75);
     printList(L1);
     removeDuplicate2(L1);
     printList(L1);
    }
}