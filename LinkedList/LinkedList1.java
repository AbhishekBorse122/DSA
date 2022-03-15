//LinkedList class also extends the Queue interface along with Collection and List.
import java.lang.String;
import java.util.*;
import java.util.Arrays;
import java.util.LinkedList;
public class LinkedList1
{
    public static void main(String args[])
    {
     new LinkedList1().implementList();
    }
    public void implementList()
    {
        LinkedList<Integer> L=new LinkedList<>(Arrays.asList(31,22,21,45,64,68,99));
        System.out.println(L);
        L.addFirst(7);//removeFirst(),removeLast() & equals() this method are use to remove the object from the list. 
        L.addLast(6);//this all are some additional method that are include in the LinkedList Collection.
        L.push(34);//otherwise all method in the Linkedlist are the same as arraylist method.
        System.out.println(L);
        System.out.println("First: "+L.getFirst()+"  Last:  "+L.getLast()+"  Pop Obj: "+L.pop()+"  Peek : "+L.peek());
        System.out.println(L);
        L.removeFirst();
        L.removeLast();
        System.out.println("Poll: "+L.poll());//remove first element from the LinkedList.
        System.out.println("Size: "+L.size());
        Iterator I=L.iterator();
        while(I.hasNext())
        {
            System.out.print("  "+I.next());
        }
    }
}