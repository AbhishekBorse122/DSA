//Program to Count the Triplets of Given Sum in Doubly LinkedList.
//LinkedList is Sorted
//Here we use 3 ptr Curr,first & last.first pts to the Next node of curr ptr and last pts to last of linkedlist.
//T-O(n*n) & S-O(1)
public class Count_Triplets_DLL
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
    static void frontInsert(Count_Triplets_DLL L,int Data)
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
    static void countTriplets(Node H,int K)
    {
      if(H==null)
      {
        return;
      }  
      Node Curr,first,last;
      int count=0;
      last=H;
      while(last.next!=null)
          last=last.next;
      for(Curr=H;Curr!=null;Curr=Curr.next)//this loop will run till the end
      {
        first=Curr.next;
        count+=countPairs(first,last,K-Curr.data);//& we are find the pair because we subtract the data of Curr node and now looking for
      }//two pair so all three form  the triplet if we found the pair.
      System.out.print("\nTriplets: "+count); 
    }
    static int countPairs(Node first,Node last,int K)
    {
        int count=0;
        while(first!=null && last!=null && first!=last && last.next!=first)
        {
            if((first.data+last.data)==K){
                first=first.next;
                last=last.prev;
                count++;
            }
            else if((first.data+last.data)<K)    
              first=first.next;  
            else
              last=last.prev;
        }
      return count;
    }
    public static void main(String args [])
    {
     Count_Triplets_DLL D =new Count_Triplets_DLL();
     frontInsert(D,9); 
     frontInsert(D,8); 
     frontInsert(D,6); 
     frontInsert(D,5); 
     frontInsert(D,4); 
     frontInsert(D,3); 
     frontInsert(D,2); 
     frontInsert(D,1); 
     printList(D.head); 
     countTriplets(D.head,8);
    }
}