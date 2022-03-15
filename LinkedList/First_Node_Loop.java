//Program to find the first Node of Loop in LinkedList.
//Based on Floyd's Algorithm.
public class First_Node_Loop
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
    static void frontInsert(First_Node_Loop L,int d)
    {
      Node F=new Node(d);
      F.next=L.head;
      L.head=F;
    }
    static void printList(First_Node_Loop L)
    {
        Node current=L.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static void findFirst(First_Node_Loop L)//floyd's detection Algorithm
    {
        Node slow=L.head,fast=L.head;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                firstNode(slow,L.head);
                return;
            }
        }
        return;
    }
    static void firstNode(Node S,Node H)
    {
        Node ptr1=S;
        Node ptr2=S;
        int k=1;
        while(ptr1.next!=ptr2)
        {
            ptr1=ptr1.next;
            k++;
        }
        ptr1=H;
        ptr2=H;
        for(int i=0;i<k;i++)
        {
          ptr2=ptr2.next;
        }
        while(ptr2!=ptr1)
        {
         ptr1=ptr1.next;
         ptr2=ptr2.next;
        }
        System.out.print("\nFirst Node of Loop: "+ptr1.data);
    }
    public static void main(String args[])
    {
     First_Node_Loop L=new First_Node_Loop();
     frontInsert(L,34);
     frontInsert(L,12);
     frontInsert(L,19);
     frontInsert(L,23);
     frontInsert(L,86);
     frontInsert(L,51);
     frontInsert(L,44);
     frontInsert(L,67);
     printList(L);
     L.head.next.next.next.next.next.next.next=L.head.next.next;//here we are create a loop
     findFirst(L);//Delete The Loop from the LinkedList
    }
}