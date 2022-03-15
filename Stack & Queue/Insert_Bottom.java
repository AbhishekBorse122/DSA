// There is another approach in which we use the one more stack and pop out all element of stack 1 and push it into stack 2
// insert the element in the stack 1 and then again push the all element if stack 2 into stack 1.
import java.util.Stack;
public class Insert_Bottom
{
	static Stack<Integer> recursion(Stack<Integer> S, int N)
	{
		if(S.isEmpty()){
			S.push(N);
        }    
		else {
			int X = S.pop();
			S = recursion(S, N);
			S.push(X);
		}
	    return S;
	}
	static void insertToBottom(Stack<Integer> S, int N)
	{
		System.out.println(S);
		S = recursion(S, N);
		System.out.println(S);	    
	}	
	public static void main(String[] args) 
	{
		Stack<Integer> S = new Stack<Integer>();
		S.push(5);
		S.push(4);
		S.push(3);
		S.push(2);
		S.push(1);	
		insertToBottom(S, 7);
	}
}