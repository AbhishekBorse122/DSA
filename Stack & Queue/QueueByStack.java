import java.util.Stack;
import java.util.*;
public class QueueByStack
{
    static Stack<Integer> S1=new Stack<>();
    static Stack<Integer> S2=new Stack<>();
    //basically we store the content of Queue in S1 but S2 required to Manage the Queue in Stack.  
    static void EnQueue(int x)
    {
      while(!S1.isEmpty())
      {
         S2.push(S1.pop());
      }
      S1.push(x);
      while(!S2.isEmpty())
      {
         S1.push(S2.pop());
      }
    }
    static void DeQueue()
    {
        if(S1.isEmpty())
        {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("DeQueue: "+S1.pop());
    } 
    static void printQueue()
    {
      System.out.println(S1);
    }
    public static void main(String args [])
    {
     EnQueue(4);
     EnQueue(6);
     EnQueue(7);
     EnQueue(9);
     printQueue();
     DeQueue();
     DeQueue();
     EnQueue(5);
     printQueue();
     System.out.println(S1.peek());
    }
}
