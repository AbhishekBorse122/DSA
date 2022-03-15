import java.util.*;
import java.util.Queue; 
import java.util.Stack; 
public class Reverse_FirstK_Queue
{  
    static void reverseFirstK(Queue<Integer> Q,int K){
      Stack<Integer> S=new Stack<>();
      int i=0; 
      while(i<K){
        S.push(Q.remove());
        i++;
      }
      int n=Q.size();
      while(!S.isEmpty()){
          Q.add(S.pop());
      }
      i=0; 
      while(i<n){
         Q.add(Q.remove());
         i++;
      }  
    }
    public static void main(String[] args)
    {
      Queue<Integer> A=new LinkedList<>(Arrays.asList(4,5,6,10,7,13,8));
      reverseFirstK(A,5);
      System.out.println(A);
    }
}