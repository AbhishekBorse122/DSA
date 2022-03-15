//Program to find the Intersection of two LinkedList. 
//T-O(n) & S-O(1)
//We can also use the another method i.e we store one List to HashSet then compare the every element of second list with the HashSet
//if element is present already in the Set then that was common element.
public class LinkedList_Intersection
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
    static void frontInsert(LinkedList_Intersection L1,int d)
    {
      Node F=new Node(d);
      F.next=L1.head;
      L1.head=F;
    }
    static void printList(LinkedList_Intersection L1)
    {
        Node current=L1.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static void Intersection(LinkedList_Intersection L1,LinkedList_Intersection L2)
    {
      Node T1=L1.head,T2=L2.head;  
      System.out.print("\nIntersection: ");
      while(T1!=null && T2!=null)
      {
        if(T1.data==T2.data)
         {
           System.out.print(" "+T1.data);
           T1=T1.next;
           T2=T2.next;
         }
        else if(T1.data<T2.data)
         {
            T1=T1.next;
         } 
        else
         {
            T2=T2.next;
         }     
      }
    }
    public static void main(String args[])
    {
     LinkedList_Intersection L1=new LinkedList_Intersection();
     frontInsert(L1,14);
     frontInsert(L1,11);
     frontInsert(L1,9);
     frontInsert(L1,7);
     frontInsert(L1,3);
     frontInsert(L1,2);
     printList(L1);
     LinkedList_Intersection L2=new LinkedList_Intersection();
     frontInsert(L2,14);
     frontInsert(L2,13);
     frontInsert(L2,10);
     frontInsert(L2,7);
     frontInsert(L2,1);
     printList(L2);
     Intersection(L1,L2);
    }
}