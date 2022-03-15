import java.util.*;
public class LinkedList
{
    public static int count=0;
    Node head;
    static class Node
    {
     int data;
     Node next;
     public Node(int d){
         data=d;
     } 
    }
    public static void frontInsert(LinkedList list,int d)
    {
      Node temp=new Node(d);
      temp.next=list.head;
      list.head=temp;
      count++;
      printList(list);
    }
    public static void posInsert(LinkedList list,int d,int pos) 
    {
      Node temp=new Node(d);
      if(list.head==null){
         System.out.println("List Is Empty!! We Can't Insert the Data At that Position!!");
        return;
      }
      else if(pos<=count){
          Node T=list.head;
          for(int i=1;i<pos-1;i++)
          {
            T=T.next;
          }
          temp.next=T.next;
          T.next=temp;      
          count++;
      } 
      else{
        System.out.println("Index "+pos+" =Invalid Position!!");
        return; 
      }
      printList(list);
    }
    public static void endInsert(LinkedList list,int d)
    {
     Node temp=new Node(d);
     temp.next=null;
     if(list.head==null)
      {
          list.head=temp;
      }
     else
      {
        Node last=list.head;
        while(last.next!=null)
        { 
            last=last.next;
        }
        last.next=temp;
      } 
      count++;
      printList(list);
    }
    public static void printList(LinkedList list)
    {
        Node current=list.head;
        System.out.print("Linked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    public static void posDelete(LinkedList list,int pos)
    {
      if(list.head==null){
          System.out.println("LinkedList is Empty!!");
      }
      else if(pos<=count){
        Node T=list.head;
        for(int i=1;i<pos-1;i++)
        {
          T=T.next;
        }
        Node S=T.next.next;
        T.next=null;
        T.next=S;      
        count--;
      } 
      else{
        System.out.println("Invalid Position!!");       
      }
     printList(list);
    }
    public static void Reverse(LinkedList L)
    {
      Node prev=null;
      Node current=L.head;
      Node N=null;
      while(current!=null) 
      {
        N=current.next;
        current.next=prev;
        prev=current;
        current=N;
      }
      L.head=prev;
      printList(L);      
    }
    public static void main(String args [])
    {
     LinkedList list=new LinkedList();
     int choice;
     do
     {
      Scanner S=new Scanner(System.in);
      System.out.println("\n1)frontInsert\n2)posInsert\n3)endInsert\n4)posDelete\n5)Reverse\n6)Exit");
      System.out.println("Enter the choice: ");
      choice=S.nextInt();
      switch(choice)
       {
         case 1:
               System.out.println("Enter the Data: ");
               int d=S.nextInt();
               frontInsert(list,d);
               break;
         case 2:     
               System.out.println("Enter the Data: ");
               int k=S.nextInt();
               System.out.println("Enter the Position: ");            
               int pos=S.nextInt();
               posInsert(list,k,pos);
               break;
         case 3:     
               System.out.println("Enter the Data: ");
               int j=S.nextInt();
               endInsert(list,j);
               break; 
         case 4:     
               System.out.println("Enter the Position: ");            
               int po=S.nextInt();
               posDelete(list,po);
               break;
         case 5:
                Reverse(list);
                break;  
         case 6:
                System.exit(0);      
                break;
         default:
               System.out.println("Invalid Input");                    
       }
    }while(choice!=6);
     //LinkedList.Node N=new LinkedList.Node(7);//By this way we can create the object of the Static inner class.
     //But if inner class is instance class if we have to create the object of it then first we create the object of outer class and then  
  }
}