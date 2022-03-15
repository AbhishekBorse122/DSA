import java.util.Stack;
public class Longest_Valid
{
	static int isValid(String A)
	{
		Stack<Integer> S = new Stack<>();
	    S.push(-1);
        int result=Integer.MIN_VALUE;
    	for(int i=0;i<A.length();i++) 
		{                           
            if(A.charAt(i)=='('){
                S.push(i);
            }
            else
            {
                if(!S.isEmpty()){
                    S.pop();
                }
                if(!S.isEmpty()){
                    result=Math.max(result,i-S.peek());
                }
                else{
                    S.push(i);
                }
            }
		}
        return result;
	}
	public static void main(String[] args)
	{
     String A="((())()";
     System.out.print(isValid(A));
   }
}
