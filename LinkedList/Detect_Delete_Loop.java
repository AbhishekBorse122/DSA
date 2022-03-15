public class Detect_Delete_Loop 
{
    Node head; 
    class Node 
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void frontInsert(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    public boolean detectLoop()
    {
        Node slow = head, fast = head;
        while (slow!= null && fast != null && fast.next != null)
         {
            System.out.println(slow.data+" -- "+fast.data);
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
            System.out.print(slow.data+" "+fast.data);  
            return true;
            }
        }
      return false;
    }
    public int detectNremoveLoop()
    {
        Node slow = head, fast = head;
        while (slow!= null && fast != null && fast.next != null)
         {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
             deleteLoop(head,slow);
             return 1;
            }
        }
        return 0;
    }
    void deleteLoop(Node H,Node loop)
    {
      Node ptr1=loop;
      Node ptr2=loop;
      int k=1;
      //count the number of Nodes in the loop of LinkedList.
      while(ptr1.next!=ptr2){
       ptr1=ptr1.next;
       k++;
      }
      ptr1=H;//point to the head .
      ptr2=H;
      for(int i=0;i<k;i++)//move ptr2 to k node from head 
      {
          ptr2=ptr2.next;
      }
      while(ptr1!=ptr2){//then ptr1 & ptr2 are same at 1 common pt & it is the loop intersection pt.
       ptr1=ptr1.next;
       ptr2=ptr2.next;       
      }    
      while(ptr1!=ptr2.next){//then move the ptr2 to last node
       ptr2=ptr2.next;       
      }    
      ptr2.next=null;// put null value into the last Node.next value so loop will be deleted.
    }
    public static void main(String args[])
    {
        Detect_Delete_Loop list = new Detect_Delete_Loop();
        list.frontInsert(20);
        list.frontInsert(4);
        list.frontInsert(15);
        list.frontInsert(10);
        list.frontInsert(24);
        list.frontInsert(29);
        list.head.next.next.next.next.next.next =  list.head.next.next;
        System.out.print(list.detectLoop());
        list.detectNremoveLoop();
        // System.out.print(list.detectLoop());
    }
}