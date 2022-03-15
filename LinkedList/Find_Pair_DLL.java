//Program to find the Pair of Given Sum in Doubly LinkedList.
//LinkedList is Sorted.
//T-O(n) & S-O(1)
//It is best method for array or for linkedlist we can use two pointer.Here front pts head and back pts tail then if sum of data is equal to K 
//then front will move to next if sum is greater then back will move to prev.because of sort it is easy to implement.  
public class Find_Pair_DLL
{
    Node head;
    static class Node
    {
        Node next,prev;
        int data;
        public Node(int Data)
        {
            data=Data;
        }
    } 
    public static void frontInsert(Find_Pair_DLL L,int Data)
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
    }
    public static void printList(Node H)
    {
        Node current=H;
        System.out.print("Linked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static void findPair(Node H,int K)
    {
        Node front=H;
        Node back=H;
        while(back.next!=null)
        {
            back=back.next;
        }
        boolean found=false;
        while(front!=null && back!=null && front!=back && front.prev!=back)// last condition is that means front & back ptr is not cross each other.
        {
            if((front.data+back.data)==K){
              found=true;
              System.out.print("\n("+front.data+","+back.data+")");
              front=front.next;
              back=back.prev;
            }
           else if((front.data+back.data)<K)
              front=front.next;
           else
               back=back.prev;
        }
       if(found==false)
        {
            System.out.print("\nNo pair found");
        }
    }
    public static void main(String args [])
    {
     Find_Pair_DLL D =new Find_Pair_DLL();
     frontInsert(D,9); 
     frontInsert(D,8); 
     frontInsert(D,6); 
     frontInsert(D,5); 
     frontInsert(D,3); 
     frontInsert(D,1); 
     printList(D.head); 
     findPair(D.head,11);
    }
}