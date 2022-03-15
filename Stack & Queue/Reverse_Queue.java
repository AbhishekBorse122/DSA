//Program to Reverse the Queue using the Recursion.
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class Reverse_Queue
{
   static Queue<Integer> Q=new LinkedList<>();
   static void insertFront(int x)
   {
       Q.add(x);
   }
   static void reverse()//T-O(n) S-O(1);
   {
       //Run the if statement still the Q is not Empty.
       if(!Q.isEmpty())
       {
        int x=Q.poll();
        reverse();
        insertFront(x);
       }
   }
   static void reverse_K_element(int K)//T-O(n+k)
   {
      Stack<Integer> S=new Stack<>();//S-O(n) bcz of this.
      if(Q.isEmpty() || K>Q.size() || K==0){ return; }   
      for(int i=0;i<K;i++) {
          S.push(Q.remove());
      }  
      while(!S.isEmpty()){
          Q.add(S.pop());
      }
      for(int i=0;i<Q.size()-K;i++) {
        Q.add(Q.remove());
      }
      System.out.println("Queue Reverse With "+K+" Element: "+Q);
   }
   public static void main(String args[])
   {
    Q.add(16);
    Q.add(34);
    Q.add(44);
    Q.add(23);
    Q.add(54);
    Q.add(26);
    System.out.println("Queue Before Reverse: "+Q);
    reverse();//whole Queue will be Reverse.
    System.out.println("Queue After Reverse: "+Q);
    reverse_K_element(3);//first 3 elements of Queue is reverse        

    Queue<Integer>L=new LinkedList<>();
    L.add(34);
    L.add(32);
   }
}