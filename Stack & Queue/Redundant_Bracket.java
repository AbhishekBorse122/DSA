//Expression is redundant if only operand with brackets (a)+b & if two or more bracket for single operator ((a+b))
import java.util.Stack;
public class Redundant_Bracket
{
	static boolean isRedundant(String A)
	{
		  Stack<Character> S = new Stack<>();
      char [] arr=A.toCharArray();
    	for(char c:arr)
		  {
            if(c==')')
            {
                char top=S.pop();
                boolean flag=true;
                while(top!='(')
                {
                  if(top=='+' || top=='-' || top=='*' || top=='/')
                  {
                    flag=false;
                  }
                  top=S.pop();
                }
                if(flag){
                  return true;
                }
            }
            else{
              S.push(c);
            }
		  }
     return false;
	}
	public static void main(String[] args)
	{
     String A="((a+c))+(b+c)";
     System.out.print(isRedundant(A));
   }
}
