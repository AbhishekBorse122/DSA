//Program to find the Middle of LinkedList using two pointer Technique.
//T-O(n) S-O(1)
//We can also find it by counting Nodes & then find Middle By Count/2 or Count/2+1.
public class Middle_LinkedList
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
    static void frontInsert(Middle_LinkedList L,int d)
    {
      Node F=new Node(d);
      F.next=L.head;
      L.head=F;
    }
    static void printList(Middle_LinkedList L)
    {
        Node current=L.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static void Middle(Node H)
    {
        if(H==null)//return if Node is empty.
            return;
        Node slow=H,fast=H;//slow ptr move by 1 position and fast ptr will move by the 2 position
        while(fast!=null && fast.next!=null)//this loop execute only if the two Node are present after the Node which is point by fast ptr
        {
            slow=slow.next;//move slow ptr by 1
            fast=fast.next.next;//move fast ptr by 2
        }
        //at the end of this loop slow will pt the middle or middle+1 for odd Nodes LinkedList
        System.out.print("\nMiddle Node: "+slow.data);
    }
    public static void main(String args[])
    {
     Middle_LinkedList L=new Middle_LinkedList();
    //  frontInsert(L,14);
     frontInsert(L,27);
     frontInsert(L,72);
     frontInsert(L,13);
     frontInsert(L,21);
     frontInsert(L,19);
     frontInsert(L,91);
     frontInsert(L,26);
     printList(L);
     Middle(L.head);
    }
}