//Program to Move the Last Node to Front of LinkedList. 
//T-O(n) & S-O(1)
public class Move_LastToFirst
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
    static void frontInsert(Move_LastToFirst L,int d)
    {
      Node F=new Node(d);
      F.next=L.head;
      L.head=F;
    }
    static void printList(Move_LastToFirst L)
    {
        Node current=L.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static void lastToFirst(Move_LastToFirst L)
    {
      Node T=L.head;
      int count=0,Data=0;
      while(T!=null)//first count the Nodes in LinkedList.
      {
          if(T.next==null)
          {
            Data=T.data;
          }
          T=T.next;
          count++;
      }
      Node N=L.head;
      for(int i=1;i<count-1;i++)//Move the N ptr to the Second last Node
      {
        N=N.next;
      }
      N.next=null;//And remove the address of last Node from the Node N.
      frontInsert(L,Data);//Add the last Node to First. 
    }
    static void lastToFirst1(Move_LastToFirst L)//it is optimized version from the previous one.
    {
      if(L.head==null || L.head.next==null){
        return;
      }
      Node temp=L.head;
      while(temp.next.next!=null)
      {
        temp=temp.next;
      }
      Node F=temp.next;
      temp.next=null;
      F.next=L.head;
      L.head=F;
    }    
    public static void main(String args[])
    {
     Move_LastToFirst L=new Move_LastToFirst();
     frontInsert(L,34);
     frontInsert(L,29);
     frontInsert(L,57);
     frontInsert(L,23);
     frontInsert(L,16);
     frontInsert(L,97);
     printList(L);
     lastToFirst(L);
     printList(L);
     lastToFirst1(L);
     printList(L);
     lastToFirst1(L);
     printList(L);
    }
}