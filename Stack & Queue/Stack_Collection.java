import java.util.Stack;
public class Stack_Collection
{  
    public static void main(String[] args)
    {
       Stack<Integer>S=new Stack<>();
       S.add(45);
       S.push(34);
       S.add(55);
       S.add(75);
       S.add(14);
       S.push(76);
       System.out.println(S);
       System.out.println(S.peek());
       System.out.println(S.remove(2));
       System.out.println(S.pop());
       System.out.println(S.indexOf(34));    
    }
}