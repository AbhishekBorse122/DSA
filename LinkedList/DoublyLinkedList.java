import java.lang.String;
public class DoublyLinkedList
{
    static int count;
    static Node head;
    static class Node
    {
        Node next,prev;
        int data;
        public Node(int Data)
        {
            data=Data;
        }
    } 
    public static void frontInsert(DoublyLinkedList L,int Data)
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
      count++;
    }
    public static void posInsert(DoublyLinkedList list,int Data,int pos)
    {
      Node C=new Node(Data); 
      if(list.head==null)
      {
          System.out.println("LinkedList is Empty!!");
      }
      else if(pos<count)
      {
          Node T=list.head;
          for(int i=1;i<pos-1;i++)
          {
            T=T.next;
          }
          C.next=T.next;
          T.next.prev=C;
          T.next=C;      
      } 
      else
      {
        System.out.println("Index "+pos+" =Invalid Position!!");
      }
      count++;
    }
    public static void endInsert(DoublyLinkedList list,int Data)
    {
     Node New=new Node(Data);
     New.next=null;
     if(list.head==null)
      {
          list.head=New;
      }
     else
      {
        Node last=list.head;
        while(last.next!=null)
        { 
            last=last.next;
        }
        last.next=New;
        New.prev=last;
      } 
      count++;
    }
    public static void printList(DoublyLinkedList list)
    {
        Node current=list.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    public static void posDelete(DoublyLinkedList list,int pos)
    {
      if(list.head==null)
      {
          System.out.println("LinkedList is Empty!!");
      }
      else if(pos<count)
      {
          Node T=list.head;
          for(int i=1;i<pos-1;i++)
          {
            T=T.next;
          }
          Node S=T.next.next;
          T.next=null;
          T.next=S;   
          S.prev=T;   
      } 
      else
      {
        System.out.println("Invalid Position!!");       
      }
      count--;
    } 
  static void reverse()
	{
		Node temp = null;
		Node current = head;
		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		if (temp != null) {
			head = temp.prev;
		}
	}
    public static void main(String args [])
    {
     DoublyLinkedList D =new DoublyLinkedList();
     frontInsert(D,34); 
     frontInsert(D,4); 
     frontInsert(D,7); 
     frontInsert(D,1); 
     frontInsert(D,43); 
     frontInsert(D,8); 
     frontInsert(D,23); 
     frontInsert(D,13); 
     printList(D); 
     reverse();
     printList(D); 
    }
}