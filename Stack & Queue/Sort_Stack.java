//Program to find Sort the Stack using the Recursion. 
//T-O(n*n) worst-case 
import java.util.Stack;
public class Sort_Stack
{
    static Stack<Integer> S=new Stack<>();
    public static void sortInsert(int x)
    {
      if(S.size()==0 || x> S.peek())
      {
          S.push(x);
          return;
      }
      int temp=S.pop();
      sortInsert(x);
      S.push(temp);
    }
    public static void sortStack()
    {
        if(!S.isEmpty())
        {
            int x=S.pop();
            sortStack();
            sortInsert(x);
        }
    }
    public static void main(String args [])
    {
     S.push(39);
     S.push(51);
     S.push(31);
     S.push(22);
     S.push(14);
     System.out.println("Stack: "+S);
     sortStack();
     System.out.println("Stack Reverse: "+S);
    }
}