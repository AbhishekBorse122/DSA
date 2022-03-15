import java.lang.String;
import java.util.Stack;
import java.util.*;
import java.util.Arrays;
public class StackSort
{
    public static void main(String args [])
    {
     Stack<Integer> S=new Stack<>();
     S.add(45);
     S.add(24);
     S.add(55);
     S.add(39);
     S.add(22);
     S.add(41);
     Stack<Integer> SortedStack=SortStack(S);
     System.out.println("   "+SortedStack);
    }
    public static Stack<Integer> SortStack(Stack<Integer> A)
    {
      Stack<Integer> temp=new Stack<>();
      while(!A.isEmpty())
      {
         int t=A.pop();
         while(!temp.isEmpty() && temp.peek()>t)
         {
           A.push(temp.pop());
         }
         temp.push(t);
      }
      return temp;
    }
}