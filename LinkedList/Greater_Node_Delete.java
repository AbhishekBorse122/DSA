//Program to find Multiplication of Two Number Represent the LinkedList.
//T-O(n) & S-O(1).
public class Greater_Node_Delete
{
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
    static void frontInsert(Greater_Node_Delete list,int d)
    {
     Node F=new Node(d);
     F.next=list.head;
     list.head=F;
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
    static void deleteGreater(Node H1,Node H2)//we have to just return the multiplication 
    {
        'u'
    }
    public static void main(String args [])
    {
     Greater_Node_Delete L=new  Greater_Node_Delete();
     frontInsert(L,6);
     frontInsert(L,4);
     frontInsert(L,9);
     frontInsert(L,4);
     frontInsert(L,8);
     printList(L.head);
     deleteGreater(L.head);
    } 
}