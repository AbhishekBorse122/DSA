import java.lang.String;
class StackImplement
{
    static final int Max=10;
    static int count;
    int top=-1;
    int a[]=new int[Max];
    boolean isEmpty(){
       return (top<0);
    }
    boolean push(int X){
        if(top>=Max-1){
            System.out.println("Stack Is OverFlow for "+X);
            return false;
        }
        else{
            a[++top]=X;
            count++;
            return true;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack is UnderFlow!!");
            return 0;
        }
        else{
         int x=a[top--];
         count--;
         System.out.println("Pop: "+x);
         return x;
        }
    }
    boolean Search(int x){
      for(int i=0;i<count;i++){
          if(a[i]==x){
            System.out.println("Element Found At Index: "+i);
            return true;
          }
      }
      return false;
    }
    int peek(){
       if(top<0){
            System.out.println("Stack is UnderFlow!!");
            return 0;
        }
       else{
         System.out.println("Peek: ");
         return a[top];
        }
    }
    public void printStack(){
      System.out.print("\nStack:  ");   
      for(int i=0;i<count;i++){
       System.out.print("  "+a[i]);   
      }  
    }
    void stackCursor(){
        System.out.println("\nStackCursor: Index "+count);
    }
}
public class Stack
{
 public static void main(String args [])
 {
   StackImplement S=new StackImplement();
   S.push(3);
   S.push(4);
   S.push(5);
   S.push(6);
   S.push(7);
   S.printStack();
   S.stackCursor();
   S.pop();
   System.out.println(S.Search(5));
   System.out.println("Empty: "+S.isEmpty());
   S.printStack();
 }
}
