import java.util.Stack;
public class Notation_Conversion
{	
    static String getInfix(String A)
    {
	  Stack<String> s = new Stack<String>();
	  for (int i = 0; i < A.length(); i++)
	  {
        char c=A.charAt(i);
		if (Character.isLetter(c))
		{
		 s.push(Character.toString(A.charAt(i)) + "");
		}
		else
		{
			String val1 = s.pop();
			String val2 = s.pop();
			s.push("(" + val2 + A.charAt(i)+val1 + ")");
		}
	 } 
	 return s.peek();
    }
    public static void main(String args[]) 
    {
	 String A = "ab*c+";
	 System.out.println(getInfix(A)); 
    }
}

