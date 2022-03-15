//Program to check the of LinkedList is Palindrome or Not.
//T-O(n) S-O(n)
//Another optimize method is that find middle of Linkedlist make two halves reverse the second halve and compare it with the 
//first halve if both are same then it is Palindrome.But it is easy with even number of Nodes and some changes for the 
//odd number of Nodes in LinkedList. 
import java.util.Stack;
public class Palindrome_LinkedList
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    } 
    static void frontInsert(Palindrome_LinkedList L,int d)
    {
      Node F=new Node(d);
      F.next=L.head;
      L.head=F;
    }
    static void printList(Node H)
    {
        Node current=H;
        System.out.print("\nLinked List: ");
        while(current!=null)
         {
         System.out.print("  "+current.data);  
         current=current.next;
         }
    }
    static void checkPalindrome(Node H)
    {
      Stack<Integer> S=new Stack<>();
      Node T=H;
      while(T!=null){
        S.add(T.data);
        T=T.next;
      }
      T=H;
      while(T!=null)
      {
        if(S.pop()==T.data){
          // S.pop();   
          T=T.next;
        }
        else{
           System.out.print("\nLinked List is not Palindrome");
          return;
        }
      }
      System.out.print("\nLinked List is Palindrome");
    }
    public static void main(String args[])
    {
     Palindrome_LinkedList L=new Palindrome_LinkedList();
     frontInsert(L,1);
     frontInsert(L,5);
     frontInsert(L,3);
     frontInsert(L,5);
     frontInsert(L,5);
     frontInsert(L,3);
     frontInsert(L,1);
     printList(L.head);
     checkPalindrome(L.head);
    }
}