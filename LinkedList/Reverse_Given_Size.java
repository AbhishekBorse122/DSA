// Program to Reverse the LinkedList in group of Given Size 
// T-O(n) & S-O(n/k)
public class Reverse_Given_Size
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    } 
    static void frontInsert(Reverse_Given_Size list,int d)
    {
      Node F=new Node(d);
      F.next=list.head;
      list.head=F;
    }
    static void printList(Reverse_Given_Size list)
    {
        Node current=list.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    } 
    static Node Reverse(Node H,int k)
    {
        if(H==null){
            return null;
        }
        Node N=null;
        Node prev=null;
        Node curr=H;
        int count=0; 
        while(count<k && curr!=null){
          N=curr.next;
          curr.next=prev;
          prev=curr;
          curr=N;
          count++;
        }
        if(N!=null)//1 group complete then another group started.
        {
          H.next=Reverse(N,k);
        }
        return prev;// this all function run till the last group reversal. 
    }
    public static void main(String args[])
    {
     Reverse_Given_Size L=new Reverse_Given_Size();
     frontInsert(L,34);
     frontInsert(L,12);
     frontInsert(L,19);
     frontInsert(L,23);
     frontInsert(L,86);
     frontInsert(L,51);
     frontInsert(L,44);
     frontInsert(L,67);
     printList(L);
     L.head=Reverse(L.head,3);
     printList(L);
    }
}