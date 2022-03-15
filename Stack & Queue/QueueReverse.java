import java.lang.String;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.*;
public class QueueReverse
{
    static Queue<Integer> Q;
    static void Reverse(Queue<Integer> Q1)
    {
     Stack<Integer> S=new Stack<>();
     while(!Q.isEmpty())
      {
          S.add(Q.peek());
          Q.remove();
      }
     while(!S.isEmpty())
      {
          Q.add(S.peek());
          S.pop();
      } 
    }
    public static void main(String args [])
    {
      Q=new LinkedList<>();
       Q.add(1); //this is peek element for the queue and for stack element inserted at the end is peek element. 
       Q.add(2); 
       Q.add(3); 
       Q.add(4); 
       Q.add(5); 
       Q.add(6); 
       Q.add(7); 
       Q.add(8); 
       Q.add(9); 
       System.out.println("Queue1: "+Q);
       Reverse(Q); 
       System.out.println("Queue2: "+Q);
    }

}