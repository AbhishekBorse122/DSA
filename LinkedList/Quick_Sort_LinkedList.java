//Program to Sort the LinkedList using Merge Sort Algorithm.
//T-O(n*log_n) S-O(1)
//Quick Sort is Efficiennt Sorting Algorithm but Merge Sort is Mostly Preferred to Sort the LinkedList.
public class Quick_Sort_LinkedList
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
    static void frontInsert(Quick_Sort_LinkedList L,int d)
    {
      Node F=new Node(d);
      F.next=L.head;
      L.head=F;
    }
    static void printList(Quick_Sort_LinkedList L)
    {
        Node current=L.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static void QuickSort(Node Start,Node End)
    {   
      if(Start==null || Start== End || Start==End.next)
      {
        return;
      }
      Node Pivot_Prev=partition(Start,End);
      QuickSort(Start,Pivot_Prev);
      if(Pivot_Prev!=null && Pivot_Prev==Start)
      {
        QuickSort(Pivot_Prev.next,End);
      }
      else if(Pivot_Prev!=null && Pivot_Prev.next!=null)
      {
        QuickSort(Pivot_Prev.next.next,End);
      }
    }
    static Node partition(Node Start,Node End)
    {
     if(Start==null || End==null || Start==End)
     {
       return Start;
     }
     Node Pivot_Prev=Start;
     Node Curr=Start;
     int Pivot=End.data;
     while(Start!=End)
      {
       if(Start.data<Pivot)
       {
         Pivot_Prev=Curr;
         int temp=Curr.data;
         Curr.data=Start.data;
         Start.data=temp;
         Curr=Curr.next;
       }
      Start=Start.next;
      } 
      int temp=Curr.data;
      Curr.data=Pivot;
      End.data=temp;
      return Pivot_Prev;
    } 
    public static void main(String args[])
    {
     Quick_Sort_LinkedList L=new Quick_Sort_LinkedList();
     frontInsert(L,14);
     frontInsert(L,27);
     frontInsert(L,72);
     frontInsert(L,13);
     frontInsert(L,21);
     frontInsert(L,19);
     frontInsert(L,91);
     printList(L);
     Node E=L.head;
     while(E.next!=null)
     {
       E=E.next;
     }
     QuickSort(L.head,E);
     System.out.print("\nAfter Sorting");
     printList(L);
    }
}