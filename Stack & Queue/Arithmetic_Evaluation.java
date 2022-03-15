import java.util.Stack;
public class Arithmetic_Evaluation
{
    static void postfix(String A)
    {
        Stack<Integer> S=new Stack<>();
        for(int i=0;i<A.length();i++)
        {
           char c=A.charAt(i);
           if(Character.isDigit(c))
           {     
            //    int temp=Character.getNumericValue(c);
                S.push(c-'0');//generate by ASCII difference
           }
           else  
           {
             int val1=S.pop();
             int val2=S.pop();
             switch(c)
              {
                  case '+': 
                          S.push(val2+val1);
                          break;
                  case '-': 
                          S.push(val2-val1);
                          break;
                  case '*': 
                          S.push(val2*val1);
                          break; 
                  case '/': 
                          S.push(val2/val1);
                          break;                       
              }
           }
        }  
        System.out.println("Result: "+S.pop());
    }
    static void prefix(String A)//there two change in postfix & prefix
    {
        Stack<Integer> S=new Stack<>();
        for(int i=A.length()-1;i>=0;i--)//traverse from end
        {
           char c=A.charAt(i);
           if(Character.isDigit(c))
           {     
                S.push(c-'0');
           }
           else  
           {
             int val2=S.pop();//this was second change 
             int val1=S.pop();
             switch(c)
              {
                  case '+': 
                          S.push(val2+val1);
                          break;
                  case '-': 
                          S.push(val2-val1);
                          break;
                  case '*': 
                          S.push(val2*val1);
                          break; 
                  case '/': 
                          S.push(val2/val1);
                          break;                       
              }
           }
        }  
        System.out.println("Result: "+S.pop());
    }
    public static void main(String args[])
    {
        String A="231*+9-";
        String B="-+7*45+20";
        postfix(A);
        prefix(B);
    }
}