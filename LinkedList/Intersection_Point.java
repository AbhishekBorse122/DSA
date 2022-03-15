//Program to find the Intersection_Point of two LinkedList. 
//ex.L1 => 1>2>3>5>--\
//                    9 > 10  at this Intersection_Point is 9
//   L2 => 3>8 > 6>--/              
//T-O(m+n) & S-O(1) n & m is Number of Nodes in LinkedList.
//When problem is about the two linkedlist then two pointer method is very efficient.
//Two Pointer Method use here.
public class Intersection_Point
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
    static void frontInsert(Intersection_Point L1,int d)
    {
      Node F=new Node(d);
      F.next=L1.head;
      L1.head=F;
    }
    static void printList(Intersection_Point L1)
    {
        Node current=L1.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static Node intersectPoint(Node F,Node S)
    {
      if (F == null || S == null) return null;
      Node T1=F,T2=S;
      while(T1!=T2)//it run till the T1 is not equal to T2
      {
        T1=T1.next;
        T2=T2.next;
        if(T1==null){
          T1=S;
        }
        if(T2==null){
          T2=F;
        }
      }
      System.out.print("\nIntersection Point: "+T1.data+" ");
      return T1;
    }
    public static void main(String args[])
    {
     Intersection_Point L1=new Intersection_Point();
     frontInsert(L1,17);
     frontInsert(L1,14);
     frontInsert(L1,11);
     frontInsert(L1,9);
     frontInsert(L1,7);
     frontInsert(L1,3);
     frontInsert(L1,2);
     printList(L1);
     Intersection_Point L2=new Intersection_Point();
     frontInsert(L2,17);
     frontInsert(L2,12);
     frontInsert(L2,19);
     L2.head.next.next.next=L1.head.next.next.next.next;
     printList(L2);
     intersectPoint(L1.head,L2.head);
    }
}