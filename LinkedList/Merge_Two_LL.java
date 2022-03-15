public class Merge_Two_LL
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
    static void frontInsert(Merge_Two_LL L,int d)
    {
      Node F=new Node(d);
      F.next=L.head;
      L.head=F;
    }
    static void printList(Merge_Two_LL L)
    {
        Node current=L.head;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static Node mergeTwoList(Node l1,Node l2)
    {
    Node head = new Node(0);//add one Node to new list 
    Node p=head;
    Node p1=l1;
    Node p2=l2;
    while(p1!=null && p2!=null){//then link the sorted node one by one 
        if(p1.data < p2.data){
            p.next = p1;
            p1 = p1.next;
        }else{
            p.next = p2;
            p2 = p2.next;
        }
        p=p.next;
    }
    if(p1!=null){
        p.next = p1;
    }
    if(p2!=null){
        p.next = p2;
    }
    return head.next;// return the list after added Node i.e after Node having value 0 
    }
    public static void main(String args[])
    {
     Merge_Two_LL L1=new Merge_Two_LL();
     frontInsert(L1,89);
     frontInsert(L1,67);
     frontInsert(L1,51);
     frontInsert(L1,44);
     frontInsert(L1,17);
     printList(L1);
     Merge_Two_LL L2=new Merge_Two_LL();
     frontInsert(L2,86);
     frontInsert(L2,34);
     frontInsert(L2,19);
     frontInsert(L2,23);
     frontInsert(L2,12);
     printList(L2);
     Merge_Two_LL L=new Merge_Two_LL();
     L.head=mergeTwoList(L1.head,L2.head);
     printList(L);
    }
}