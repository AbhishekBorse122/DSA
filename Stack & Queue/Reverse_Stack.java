// Program to find Reverse the Stack using the Recursion. 
// T-O(n*n) worst case
import java.util.Stack;
public class Reverse_Stack
{
    static Stack<Integer> S=new Stack<>();
    public static void recursion(int x)
    {
      if(S.isEmpty()){
          S.push(x);
      }
      else{
          int y=S.pop();
          recursion(x);
          S.push(y);
      }
    }
    public static void reverseStack()
    {
        if(!S.isEmpty()) {
            int x=S.pop();
            reverseStack();
            recursion(x);
        }
    }
    public static void main(String args [])
    {
      S.push(3);
      S.push(4);
      S.push(5);
      S.push(6);
      S.push(7);
      System.out.println("Stack: "+S);
      reverseStack();
      System.out.println("Reverse: "+S);
    }
}