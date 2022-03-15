// Check Array is a Stack Permutation of other.
import java.util.Stack;
import java.util.Queue;
import java.util.*;
public class Stack_Permutation
{
    static boolean isStackPermutation(int ip[],int op[],int n)
    {
      Queue<Integer> I=new LinkedList<>();
      Queue<Integer> O=new LinkedList<>();
      for(int i=0;i<n;i++)
      {
        I.add(ip[i]);
        O.add(op[i]);
      }
      Stack<Integer>S=new Stack<>();
      while(!I.isEmpty())
      {
        int ele=I.poll();
        if(ele==O.peek())
        {
            O.poll();
            while(!S.isEmpty())
            {
                if(S.peek()==O.peek()){
                    S.pop();
                    O.poll();
                }
                else
                   break;
            }
        }
        else{
            S.push(ele);
        }
      }
      return (I.isEmpty() && S.isEmpty());
    }
    public static void main(String args [])
    {
        int i[]={1,2,3},o[]={2,1,3};
        System.out.println(isStackPermutation(i,o,3));
    }
}
