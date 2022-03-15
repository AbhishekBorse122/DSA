// Program to Check the Paranthesis are balanced or not.
// T-O(n) S-O(n)
// Logic is that when open bracket come then add into stack and close bracket is come then check 
// same type of open bracket is present then move further otherwise print false.
import java.util.Stack;
public class Balanced_Parenthesis
{
    static boolean isBalanced(String S)
    {
      int n=S.length();
      Stack<Character> A=new Stack<>(); //String P="{[]()[()()]}"
      for(int i=0;i<n;i++)
      {
       char x=S.charAt(i);
       if(x=='{' || x=='[' || x=='('){
           A.push(x);
       }
       if(A.isEmpty())
          return false;
       char check;   
       switch(x)
       {
          case ')':
               check=A.pop();
               if(check=='{' || check=='[')
                   return false;
               break;   
          case '}':
               check=A.pop();
               if(check=='(' || check=='[')
                   return false;
               break;    
          case ']':
               check=A.pop(); 
               if(check=='{' || check=='(')
                   return false;        
               break;                       
        }   
      } 
      return (A.isEmpty());
    }
    public static void main(String args [])
    {
      String P="{[]()[()()]}";
      System.out.print("Is Balanced: "+isBalanced(P));
    }
}