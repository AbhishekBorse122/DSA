import java.lang.String;
import java.util.Stack;
import java.util.*;
public class StackReverse
{
    static Stack<Character> S=new Stack();
    static void insertBottom(char x)
    {
      if(S.isEmpty())
         {
             S.push(x);
         }
      else
         {
             char a=S.peek();
             S.pop();
             insertBottom(x);
             S.push(a);
         }   
    }
    static void reverse()
    {
        if(S.size()>0)
        {
        char x=S.peek();
        S.pop();
        reverse();
        insertBottom(x);  
        }
    }
    public static void main(String args [])
    {
        S.push('a');
        S.push('3');
        S.push('+');
        S.push('1');
        S.push('4');
        System.out.println("Stack: "+S);
        reverse();
        System.out.println("Stack Reverse: "+S);        
    }
}