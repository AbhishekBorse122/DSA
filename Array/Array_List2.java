import java.util.*;
import java.lang.String;
public class Array_List2
{
    public static void main(String [] args)
    {
       ArrayList<Integer> K=new ArrayList<>();
       K.add(9);
       K.add(5);
       ArrayList<Integer> J=new ArrayList<>();
       J.add(44);
       J.add(53);
       J.add(33);
       J.add(23);
       Array_List2 N=new Array_List2();
       N.run1(K,J);
    }
    public void run1(ArrayList<Integer>B,ArrayList<Integer>C) 
    {
    ArrayList<Integer> A=new ArrayList<>();
    A.add(4);
    A.add(3);
    System.out.println(A);
    A.addAll(B);//all element will be added
    System.out.println(A);
    A.addAll(1,C);//all element of C is added in the A from index 1 to above.
    System.out.println(A);
    System.out.println(A);
    System.out.println(A.contains(5));
    A.set(4,56);
    System.out.println(A);
    System.out.println(A.indexOf(44));
    System.out.println(A.size());    //
    Collections.sort(A);
    System.out.println("Sorted Array: "+A);
    A.clear();//removeAll(Collection Object) is a same method to remove the object from the list.
    }
    
}