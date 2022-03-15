import java.lang.String;
public class Stack_Middle
{
    static final int Max=100;
    static int count;
    int top=-1;
    int a[]=new int[Max];
    boolean isEmpty()
    {
        return (top<0);
    }
    void push(int X)
    {
        if(top>=Max-1)
        {
            System.out.println("Stack Is OverFlow!");
        }
        else
        {
            top++;
            a[top]=X;
            count++;
        }
    }
    int pop()
    {
        if(top<0)
        {
            System.out.println("Stack is UnderFlow!!");
            return -1;
        }
        else
        {
         int x=a[top];
         top--;
         count--;
         System.out.println("Pop: "+x);
         return x;
        }
    }
    public void printStack()
    {
     System.out.print("\nStack:  ");   
      for(int i=0;i<count;i++)
      {
       System.out.print("  "+a[i]);   
      }  
     System.out.print("\n");   
    }
    void Middle()
    {
        int m=count/2;
        if(count==-1)
        {
          System.out.println("Stack is Empty");
        }
        else if(count%2==1)
        {
            System.out.println("Middle of Stack: "+a[m]);
        }
        else
        {
          System.out.println("Number of Element in Stack are Odd");
        }
    }
    public static void main(String args [])
    {
      Stack_Middle S=new Stack_Middle();
      S.push(3);
      S.push(4);
      S.push(5);
      S.push(6);
      S.push(7);
      S.push(9);
      S.printStack();
      S.Middle();
    }
}