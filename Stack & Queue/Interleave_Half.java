//Program to Interleave the Queue of Even number of Integers.
//eg.Q={4,5,6,7,8,9,10,11} Interleave Queue then Q will be Q={4,8,5,9,6,10,7,11} 
//T-O(n)
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class Interleave_Half
{
    public static void InterleaveQueue(Queue<Integer>Q)
    {
      if(Q.size()%2!=0)
      {
           System.out.println("Input Even Number of Integers");
      }
     Stack<Integer> S=new Stack<>();
     int half=Q.size()/2;
     for(int i=0;i<half;i++)
     {
         S.push(Q.remove());
     }
     while(!S.isEmpty())
     {
         Q.add(S.pop());
     }
     for(int i=0;i<half;i++)
     {
         Q.add(Q.remove());
     }
     for(int i=0;i<half;i++)
     {
         S.push(Q.remove());
     }
     while(!S.isEmpty())
     {
        Q.add(S.pop());
        Q.add(Q.remove());
     }
     System.out.println("Queue: "+Q);    
    }
    public static void InterleaveQueue2(Queue<Integer>Q)
    {  
     if(Q.size()%2!=0) return;
     Queue<Integer> L=new LinkedList<>();
     int n=Q.size()/2;
     int i=0;
     for(i=0;i<n;i++)
         Q.add(Q.remove());
     for(i=0;i<n;i++)
         L.add(Q.remove());
     while(!L.isEmpty()){
        Q.add(Q.remove());
        Q.add(L.remove());  
     }  
     System.out.println("Queue: "+Q);    
    }    
    public static void main(String args [])
    {
     Queue<Integer> Q=new LinkedList<>();
     Q.add(2);
     Q.add(3);
     Q.add(4);
     Q.add(5);
     Q.add(6);
     Q.add(7);
     System.out.println(Q);
     InterleaveQueue(Q);
     InterleaveQueue2(Q);
    }
}