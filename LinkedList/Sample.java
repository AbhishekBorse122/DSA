import java.util.Arrays;
import java.util.LinkedList;

public class Sample
{  
    public static void main(String[] args)
    {
     LinkedList<Integer>A =new LinkedList<>(Arrays.asList(2,3,4,5,6));
     System.out.println(A.poll());
    System.out.println(A);
    }

}


// [0,1,2,2,2,3,4,5]
// 2
// 4
// [1000000,1000001,1000002]


   //      ListNode current = list1;
   //      for (int i = 1; i < a; i++) {
   //          current = current.next;
   //      }
   //      System.out.println("Curr: "+current.val); 
   //      ListNode toRemove = current.next;
   //      current.next = list2;
   //      for (int i = 0; i < b - a + 1; i++) {
   //          toRemove = toRemove.next;
   //      }
   //      System.out.println("tRemove: "+current.val);   
   //      ListNode lastNode = lastNode(list2);
   //      lastNode.next = toRemove;
   //      return list1;
   //  }
   //  ListNode lastNode(ListNode node) {
   //      ListNode current = node;
   //      while(current.next != null) {
   //          current = current.next;
   //      }
   //      return current;         