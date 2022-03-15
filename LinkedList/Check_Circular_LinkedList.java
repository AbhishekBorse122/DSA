//Program to check the of LinkedList is Circular or Not.
//T-O(n) S-O(1)
public class Check_Circular_LinkedList
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
    static void frontInsert(Check_Circular_LinkedList L,int d)
    {
      Node F=new Node(d);
      F.next=L.head;
      L.head=F;
    }
    static void printList(Check_Circular_LinkedList L)
    {
        Node current=L.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static boolean checkCircular(Node H)
    {
        if(H==null)
        {
            return true;
        }
        Node T=H.next;
        while(T!=null && T!=H)
        {
            T=T.next;
        }
        return(T==H);
    }
    public static void main(String args[])
    {
     Check_Circular_LinkedList L=new Check_Circular_LinkedList();
     frontInsert(L,14);
     frontInsert(L,27);
     frontInsert(L,72);
     frontInsert(L,13);
     System.out.println(checkCircular(L.head));
     L.head.next.next.next.next=L.head;
     System.out.println(checkCircular(L.head));
    }
}