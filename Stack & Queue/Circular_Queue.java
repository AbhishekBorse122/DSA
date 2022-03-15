import java.util.*;
public class Circular_Queue
{
    static ArrayList<Integer> Q=new ArrayList<>();
    static int front=-1,rear=-1,size=6;
    static void EnQueue(int x)      
    {
      if((front==0 && rear==size-1) ||(rear==(front-1)%(size-1))){
         System.out.println("Queue is Full.");
      }
      else if(front==-1){
          front=0;
          rear=0;
          Q.add(rear,x);
      } 
      else if(rear==size-1 && front!=0){
          rear=0;
          Q.set(rear,x);
      }
      else{
          if(front<=++rear){
           Q.add(rear,x);
          }
          else{
           Q.set(rear,x);
          }
       } 
    } 
    static void DeQueue()
    {
      int temp;  
      if((front==-1)){
         System.out.println("Queue is Empty.");
      }
      temp=Q.remove(front);
      if(front==rear){
          front=-1;
          rear=-1;
      }
      else if(front==size-1){
        front=0;
       } 
      else{
        front++;
      }
      System.out.println("DeQueue: "+temp);
    }
    static void Queue()
    {
        System.out.println(Q);
    }
    public static void main(String args [])
    {
      Circular_Queue S=new Circular_Queue(); 
      EnQueue(13);
      EnQueue(41);
      EnQueue(35);
      EnQueue(89);
      EnQueue(76);
      EnQueue(98);
      EnQueue(23);
      Queue();
      DeQueue();
      EnQueue(65);
      Queue();
      DeQueue();
    } 
}
