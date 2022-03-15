import java.util.Queue;
import java.util.LinkedList;
public class StackByQueue
{
    static Queue<Integer> Q1=new LinkedList<>();
    static Queue<Integer> Q2=new LinkedList<>();

    //basically we store the content of Stack in Q1 but Q2 required to manage the Stack in Queue Q1.  
    static void pushStack(int x)
    {
     Q2.add(x);//Q2 always empty before the add this element because 
     while(!Q1.isEmpty())
     {
         Q2.add(Q1.remove());
     }
     Queue<Integer> temp=Q1;
     Q1=Q2;// at the end it transfer the name of Q2 to Q1 it reduce the time complexity of push operation. 
     Q2=temp;// at the end Q2 is empty
    }
    static void popStack()
    {
        if(Q1.isEmpty())
        {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("DeQueue: "+Q1.remove());
    } 
    static void printStack()
    {
      System.out.println(Q1);
    }
    public static void main(String args [])
    {
     pushStack(14);
     pushStack(22);
     pushStack(93);
     printStack();
     popStack();
     pushStack(34);
     pushStack(43);
     printStack();
    } 
}
