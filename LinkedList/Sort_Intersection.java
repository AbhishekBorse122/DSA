import java.util.*;
public class Sort_Intersection
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
    public static void frontInsert(Sort_Intersection list,int d)
    {
    Node temp=new Node(d);
    temp.next=list.head;
    list.head=temp;
    count++;
    }
    public static void printList(Sort_Intersection list)
    {
        Node current=list.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static Node sortIntersection(Node F,Node S)//use arraylist for duplicate elements.
    {
       Node R=null,last=null; 
       while(F!=null && S!=null)
       {
           if(F.data==S.data)
           {
             Node temp=new Node(F.data);  
             if(R==null){
                  R=temp;
                  last=temp;
             }else{
                 last.next=temp;
                 last=temp;
             }    
             F=F.next;
             S=S.next;
           }
           else if(F.data>S.data){
               S=S.next;
           }
           else{
               F=F.next;
           }
       }
       return R;
    }
    public static void main(String args [])
    {
     Sort_Intersection F=new Sort_Intersection();
     frontInsert(F,9);
     frontInsert(F,8);
     frontInsert(F,7);
     frontInsert(F,6);     
     frontInsert(F,5);
     frontInsert(F,4);
     printList(F);
     Sort_Intersection S=new Sort_Intersection();
     frontInsert(S,8);
     frontInsert(S,4);
     frontInsert(S,3);
     frontInsert(S,1);
     printList(S);
     Sort_Intersection N=new Sort_Intersection();
     N.head=sortIntersection(F.head,S.head);
     printList(N);
    }
}