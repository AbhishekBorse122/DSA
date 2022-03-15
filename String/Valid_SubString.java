import java.util.Stack;
public class Valid_SubString
{
	static int findMaxLen(String S)
	{
		Stack<Character> A= new Stack<>();
        A.push('/');
        int count=0;
		for (int i=0;i<S.length();i++)
		{
            char x=S.charAt(i);
            if(S.charAt(i)=='(')
            {
              A.push(x);
            }
            switch(x)
            {
                case ')':
                        char y=A.pop();
                        if(y=='(')
                         { count++;}
						else
					     {
							 A.push(y);
						 }	 
                        break;
            }	
		}
		return count*2;
	}
	public static void main(String[] args)
	{
		String S = "((()()";
		System.out.println("Length: "+findMaxLen(S));
        S="()()((())))))((((())))))))))";
		System.out.println("Length: "+findMaxLen(S));

	}
}
