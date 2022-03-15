//Program to Reverse the LinkedList with Given Size 
//T-O(n) & S-O(n/k)
public class Reverse_Given_Size_DLL
{
    Node head;
    static class Node
    {
        Node next,prev;
        int data;
        public Node(int Data)
        {
            data=Data;
        }
    } 
    static void frontInsert(Reverse_Given_Size_DLL L,int Data)
    {
      Node F=new Node(Data);
      F.next=F.prev=null;
      if(L.head==null)
      {
        L.head=F;
      }
      else
      {
        F.next=L.head;
        L.head.prev=F;
        L.head=F;
      }
    }
    public static void printList(Node H)
    {
        Node current=H;
        System.out.print("\nDoubly Linked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static Node Reverse(Node H,int k)
    {
        if(H==null)
        {
            return null;
        }
        Node Next=null;
        Node Prev=null;
        Node Curr=H;
        int count=0; 
        while(count<k && Curr!=null)
        {
          Next=Curr.next;
          Curr.next=Prev;
          Prev=Curr;
          Curr=Next;
          count++;
        }
        if(Next!=null)
        {
          H.next=Reverse(Next,k);
          H.next.prev=H;
        }
        return Prev;
    }
    public static void main(String args [])
    {
     Reverse_Given_Size_DLL L=new Reverse_Given_Size_DLL();
     frontInsert(L,34);
     frontInsert(L,12);
     frontInsert(L,19);
     frontInsert(L,23);
     frontInsert(L,86);
     frontInsert(L,51);
     frontInsert(L,44);
     frontInsert(L,67);
     printList(L.head);
     L.head=Reverse(L.head,3);
     printList(L.head);
     L.head=Reverse(L.head,3); 
    }
}