//Program to find Multiplication of Two Number Represent the LinkedList.
//T-O(n) & S-O(1).
public class Multiplication_LinkedList
{
    static int count=0;
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
    static void frontInsert(Multiplication_LinkedList list,int d)
    {
    Node F=new Node(d);
    F.next=list.head;
    list.head=F;
    count++;
    }
    static void printList(Node H)
    {
        Node current=H;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static void MultiplyTwoList(Node H1,Node H2)//we have to just return the multiplication 
    {
     int num1=0,num2=0;
     while(H1!=null || H2!=null)//we are just create the numbers
     {
        if(H1!=null) 
        {
         num1=num1*10+H1.data;
         H1=H1.next;
        }
        if(H2!=null)
        {
         num2=num2*10+H2.data;
         H2=H2.next;
        }
     }  
     System.out.print("\nMultiplication: "+(num1*num2));// & multiply them
    }
    public static void main(String args [])
    {
     Multiplication_LinkedList L=new  Multiplication_LinkedList();
     frontInsert(L,6);
     frontInsert(L,4);
     frontInsert(L,9);
     printList(L.head);
     Multiplication_LinkedList L1=new  Multiplication_LinkedList();
     frontInsert(L1,4);
     frontInsert(L1,8);
     printList(L1.head);
     MultiplyTwoList(L.head,L1.head);
    } 
}