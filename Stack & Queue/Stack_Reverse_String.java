import java.lang.String;
public class Stack_Reverse_String
{
    static final int Max=100;
    static int count;
    int top=-1;
    char a[]=new char[Max];
    void push(char X)
    {
        if(top>=Max-1)
        {
            System.out.println("Stack Is OverFlow!");
        }
        else
        {
            a[top+1]=X;
            top++;
            count++;
        }
    }
    char pop()
    {
        if(top<0)
        {
            System.out.println("Stack is UnderFlow!!");
            return 'n';
        }
        else
        {
         char x=a[top];
         top--;
         count--;
         return x;
        }
    }
    void reverseString(String S)
    {
        for(int i=0;i<S.length();i++)
        {
            push(S.charAt(i));
        }
        String R="";
        for(int i=0;i<S.length();i++)
        {
            R+=pop();
        }
        System.out.println("Reverse String: "+R);
    }
    public static void main(String args [])
    {
      Stack_Reverse_String S=new Stack_Reverse_String();
      S.reverseString("ABHISHEK");
    }
}