//Program to sort th  Sort_LinkedList with  0's,1's & 2's.
//T-O(n) & S-O(1).
//Easy method count the Number of 0,1 & 2.
//And then set the linkedlist.  
public class Sort_LinkedList
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
    static void frontInsert(Sort_LinkedList list,int d)
    {
    Node F=new Node(d);
    F.next=list.head;
    list.head=F;
    count++;
    }
    static void printList(Sort_LinkedList list)
    {
        Node current=list.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static void sort(Node H)
    {
     int count[]={0,0,0};
     Node T=H;
     while(T!=null)
     {
        count[T.data]++;
        T=T.next;
     }
     int i=0;
     T=H;
     while(T!=null)
     {
       if(count[i]==0)  i++;
       else {
            T.data=i;
            --count[i];
            T=T.next;
        }
     }
    }
    public static void main(String args [])
    {
     Sort_LinkedList L=new  Sort_LinkedList();
     frontInsert(L,1);
     frontInsert(L,0);
     frontInsert(L,0);
     frontInsert(L,2);
     frontInsert(L,0);
     frontInsert(L,1);
     frontInsert(L,1);
     printList(L);
     sort(L.head);
     printList(L);
    } 
}