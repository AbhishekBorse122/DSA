import java.lang.String;
import java.util.Stack;
import java.util.*;
import java.util.LinkedList;
import java.util.Iterator;
public class Stack1
{
    public static void main(String args[])
    {
     new Stack1().ImplementStack();
    }
    public void ImplementStack()
    { 
      int a[]={3,4,5,6,7,8,9};    
      Stack<Integer> S=new Stack<>();
      for(int i=0;i<a.length;i++)
       {
           S.add(a[i]);
       }
      S.add(6,2);
      System.out.println("Stack: "+S); 
      System.out.println("Peek: "+S.peek()); 
      System.out.println("Pop Element: "+S.pop()); 
      S.push(34);
      System.out.println("Stack: "+S); 
      System.out.println("Index 4: "+S.get(4));     
      Iterator<Integer> I=S.iterator();
      while(I.hasNext())
       {
         if(I.next() %2!=0)
           {
               I.remove();
           }
       } 
     System.out.println("Stack: "+S);
     Scanner Sc=new Scanner(System.in);
     LinkedList<Integer> L=new LinkedList<>();
     for(int i=0;i<3;i++)
      {
        System.out.println("Enter a Element: ");
        L.add(Integer.valueOf(Sc.nextInt()));
      }
     S.addAll(L); 
     System.out.println("Stack: "+S);  
     System.out.println("Contains The Element: "+S.containsAll(L));
     System.out.println("It Contains: "+S.contains(34));
    }
}
