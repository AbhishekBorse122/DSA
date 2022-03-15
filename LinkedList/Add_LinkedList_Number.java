import java.util.*;
public class Add_LinkedList_Number
{
    public static int count=0;
    Node head;
    static class Node
    {
     int data;
     Node next;
     public Node(int d)
     {
         data=d;
     } 
    }
    public static void frontInsert(Add_LinkedList_Number list,int d)
    {
    Node temp=new Node(d);
    temp.next=list.head;
    list.head=temp;
    count++;
    }
    public static void printList(Add_LinkedList_Number list)
    {
        Node current=list.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static Node addtwoListNumber(Node F,Node S)
    {
      Stack<Integer> A1=new Stack<>();
      Stack<Integer> A2=new Stack<>();
      while(F!=null || S!=null){
        if(F!=null){
          A1.add(F.data);
          F=F.next;
        }  
        if(S!=null){
           A2.add(S.data);
           S=S.next;
        }
      }
      int carry=0;
      Node R=null;
      while(!A1.isEmpty() || !A2.isEmpty())
      {
          int a=0,b=0;
          if(!A1.isEmpty()){
              a=A1.pop();
          }
          if(!A2.isEmpty()){
              b=A2.pop();
          }
          int total=a+b+carry;
          Node temp=new Node(total%10);
          carry=total/10;
          if(R==null){
              R=temp;
          }else{
              temp.next=R;
              R=temp;
          }
      }
      if(carry!=0){
          Node temp=new Node(carry);
          temp.next=R;
          R=temp;
      }
      return R;
    }
    public static void main(String args [])
    {
     Add_LinkedList_Number F=new Add_LinkedList_Number();
     frontInsert(F,6);
     frontInsert(F,4);
     frontInsert(F,9);
     frontInsert(F,5);
     frontInsert(F,7);
     printList(F);
     Add_LinkedList_Number S=new Add_LinkedList_Number();
     frontInsert(S,4);
     frontInsert(S,8);
     printList(S);
     Add_LinkedList_Number N=new Add_LinkedList_Number();
     N.head=addtwoListNumber(F.head,S.head);
     printList(N);
    }
}