import java.lang.String;
import java.util.*;
public class Add1_LinkedList
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
    public static void frontInsert(Add1_LinkedList list,int d)
    {
    Node temp=new Node(d);
    temp.next=list.head;
    list.head=temp;
    count++;
    }
    public static void printList(Add1_LinkedList list)
    {
        Node current=list.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    public static void addOne(Add1_LinkedList L)
    {
     Node last=null;
     Node curr=L.head;
     while(curr.next!=null)// iterate for the last node which is not 9.
     {
         if(curr.data!=9) last=curr;
         curr=curr.next;
     }
     if(curr.data!=9){// if LL last node is not 9 then just increment last node and return.
         curr.data++;
         return;
     }
     if(last==null){// if LL is of type 9 9 9 9 
         last=new Node(0);
         last.next=L.head;
         L.head=last;
     }
     last.data++;
     last=last.next;
     while(last!=null){// put the next values as 0
         last.data=0;
         last=last.next;
     }
    }
    public static void main(String args [])
    {
     Add1_LinkedList A=new Add1_LinkedList();  // this are the 3 different situation handle in the addOne function
     frontInsert(A,9);
     frontInsert(A,9);
     frontInsert(A,9);
     frontInsert(A,9);
     addOne(A);
     printList(A);
     Add1_LinkedList B=new Add1_LinkedList();
     frontInsert(B,9);
     frontInsert(B,9);
     frontInsert(B,0);
     frontInsert(B,1);
     addOne(B);
     printList(B); 
     Add1_LinkedList C=new Add1_LinkedList();
     frontInsert(C,9);
     frontInsert(C,2);
     frontInsert(C,9);
     frontInsert(C,1);
     addOne(C);
     printList(C); 
    }
}