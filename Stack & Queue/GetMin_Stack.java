//Program to Find the Minimum From the Stack With T-O(1) & S-O(1).
//This gives GetMin() with this Complexity.
import java.util.Stack;
public class GetMin_Stack
{
    Stack<Integer>S;
    Integer Min;
    GetMin_Stack()
    {
        S=new Stack<>();
    }
    void getMin()
    {
        if(S.isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Min Element: "+Min);
        }
    }
    void push(Integer x)
    {
    //This Push Function continuosly maintain the Min value even after Min value is pop in Stack 
    //that's why it is differ from another Push Funtions same  is apply for pop Function
        if(S.isEmpty())
        {
            Min=x;
            S.push(x);
            System.out.println("Inserted Number: "+x);
            return;
        }
        if(x<Min)
        {
            S.push(2*x-Min);
            Min=x;
        }
        else
        {
           S.push(x);
        }
        System.out.println("Inserted Number: "+x);
    }
    void pop()
    {
        if(S.isEmpty())
        {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Top Most Element Removed: ");
        Integer T=S.pop();
        if(T<Min)
        {
            System.out.println(Min);
            Min=2*Min-T;
        }
        else
        {
            System.out.println(T);
        }
    }
    public static void main(String args [])
    {
      //As said in the push function you can see here that if we pop the 1Min value from stack then the 2Min value will Store in Min variable
      //So the the Push(),Pop() function Maintain this Stack in a such way that it continuosly update value if Min values are popped.
      GetMin_Stack S=new GetMin_Stack();
      S.push(49);
      S.push(99);
      S.push(36);
      S.push(89);
      S.push(34);
      S.push(76);
      S.getMin();
      S.pop();
      S.pop();
      S.getMin();
    }
} 