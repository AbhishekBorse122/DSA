//Program to GetMax form stack.
import java.util.Stack;
public class GetMax_Stack
{
    Stack<Integer>S;
    Integer Max;
    GetMax_Stack()
    {
        S=new Stack<>();
    }
    void getMax()
    {
        if(S.isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Max Element: "+Max);
        }
    }
    void push(Integer x)
    {
        if(S.isEmpty())
        {
            Max=x;
            S.push(x);
            System.out.println("Inserted Number: "+x);
            return;
        }
        if(x>Max)
        {
            S.push(2*x-Max);
            Max=x;
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
        if(T>Max)
        {
            System.out.println(Max);
            Max=2*Max-T;
        }
        else
        {
            System.out.println(T);
        }
    }
    public static void main(String args [])
    {
      GetMax_Stack S=new GetMax_Stack();
      S.push(49);
      S.push(99);
      S.push(36);
      S.push(89);
      S.push(100);
      S.push(76);
      S.getMax();
      S.pop();
      S.pop();
      S.getMax();
    }
}