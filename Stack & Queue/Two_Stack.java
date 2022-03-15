// Program to implement the Two_Stack in Array.
// We are implement the 1st stack at left side & 2nd at right side. 
// It is an efficient way two implement a two stack in a Single Array.
import java.lang.String;
public class Two_Stack
{
    int top1,top2,size;
    int a[];
    Two_Stack(int n){
     size=n;
     a=new int[n];
     top1=-1;
     top2=n;   
    }
    void push1(int data)
    {
        if(top1<top2-1){
            a[++top1]=data;
        }
        else{
            System.out.println("Stack Is Full!");          
        }
    }
    void push2(int data)
    {
        if(top1<top2-1){
            a[--top2]=data;
        }
        else{
            System.out.println("Stack Is OverFlow!");
        }
    }
    void pop1(){
        if(top1>0){
         int x=a[top1];
         top1--;
         System.out.println("\nPop Element of Stack1: "+x);
        }
        else{
        System.out.println("Stack is UnderFlow!!");
        }
    }
    void pop2() {
        if(top2<size){
         int x=a[top2];
         top2++;
         System.out.println("\nPop Element of Stack1: "+x);
        }
        else{
        System.out.println("Stack is UnderFlow!!");
        }
    }
    public void printS1()
    {
      System.out.print("\nStack1:  ");   
      for(int i=0;i<=top1 && top1>-1;i++)
      {
       System.out.print("  "+a[i]);   
      }  
    }
    public void printS2(){
      System.out.print("\nStack2:  ");   
      for(int i=size-1;i>=top2 && top2<size;i--)
      {
       System.out.print("  "+a[i]);   
      }  
    }
    public static void main(String args [])
    { 
      Two_Stack S1=new Two_Stack(3);
      S1.push1(22);
      S1.push1(41);
      S1.push1(17);
      S1.push1(78);
      S1.printS1();
      S1.pop1();
      S1.printS1();
      S1.push2(34);
      S1.push2(13);
      S1.push2(28);
      S1.push2(17);
      S1.push2(54);
      S1.printS2();
      S1.pop2();
      S1.printS2();
      S1.push1(39);
      S1.push2(99);
      S1.printS1();
      S1.printS2();
    }
}