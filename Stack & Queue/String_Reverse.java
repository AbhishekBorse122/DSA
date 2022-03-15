import java.util.Stack;
public class String_Reverse
{
    static void revere(String P)
    {
      Stack<Character> S=new Stack<>();
      for(int i=0;i<P.length();i++)
      {
         S.push(P.charAt(i));
      }
      P="";
      while(!S.isEmpty())
      {
       P+=S.pop();
      }
      System.out.println(P);
    }
    public static void main(String args [])
    {
      String P="abhishek";
      revere(P);
    }
}