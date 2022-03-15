//Sorting and Reversing in the LinkedList.We can't apply the Arrays method on the linkedlist directly. 
import java.lang.String;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.*;
public class LinkedList2
{
 public static void main(String args [])
 {
  new LinkedList2().implementList();
 }   
 public void implementList()
 {
     LinkedList<Integer> L=new LinkedList<>(Arrays.asList(9,5,6,8,6,1,3));
     System.out.print(" "+L);
     ArrayList<Integer> A=new ArrayList<>(L);
     Collections.reverse(A);
     LinkedList<Integer> New=new LinkedList<>(A);
     System.out.print("\nReverse:  "+New);
     Collections.sort(A);
     LinkedList<Integer> N=new LinkedList<>(A);
     System.out.print("\nSorted:  "+N);
 }
}