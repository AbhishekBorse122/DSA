import java.lang.String;
import java.util.*;
public class Circular_LinkedList
{
    Node head;
    static int count=0;
    static class Node
    {
     int data;
     Node next;
     public Node(int d)
     {
         data=d;
     } 
    }
    public static void endInsert(Circular_LinkedList L,int d)
    {
      Node F=new Node(d);
      Node T=L.head;
      F.next=L.head;
      if(L.head!=null)
      {
        while(T.next!=L.head)
        {
          T=T.next;
        }  
        T.next=F;
      }
      else
      {
        F.next=F;
        L.head=F;
      }
      count++;
    }
    public static void printList(Node H)
    {
       Node T=H;
       System.out.print("\nCircular LinkedList: ");
      if(H!=null)
       {
        do
        {
         System.out.print(T.data+" ");
         T=T.next;
        }while(T!=H);
       }  
    }
    public static void posDelete(Node H,int pos)
    {
      if(H==null)
      {
          System.out.println("Circular_LinkedList is Empty!!");
      }
      else if(pos<count)
      {
          Node T=H;
          for(int i=1;i<pos-1;i++)
          {
            T=T.next;
          }
          Node S=T.next.next;
          T.next=null;
          T.next=S;      
      } 
      else
      {
        System.out.println("Invalid Position!!");       
      }
      count--;
    }
    static void endDelete(Node H)
    {
      Node T=H.next;
      if(H==null)
      {
        System.out.println("List is Empty");
      }
      while(T.next.next!=H)
      {
        T=T.next;
      }
      T.next=H;
      count--;
    }
    public static Node Reverse(Node H)
    {
      if(H==null)
      {
        return null;
      }
      Node prev=null;
      Node current=H;
      Node N;
      do
      {
        N=current.next;
        current.next=prev;
        prev=current;
        current=N;
      }while(current!=H);  
      H.next=prev;
      H=prev;  
      return H;
    }
    public static void main(String args [])
    {
     Circular_LinkedList L=new Circular_LinkedList();
     endInsert(L,22);
     endInsert(L,13);
     endInsert(L,12);
     endInsert(L,45);
     endInsert(L,67);
     endInsert(L,27);
     endInsert(L,71);
     endInsert(L,98);
     printList(L.head);
     endDelete(L.head);//By this we can delete the data of end Node.
     printList(L.head);
     posDelete(L.head,3);//you cannot delete the end Node data by this Method.    
     printList(L.head);
     Node H=Reverse(L.head);
     printList(H);
     Node K=Reverse(L.head);
     printList(K);
  }
}