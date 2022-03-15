// Find nth term in fibonacci series.
import java.util.*;
public class Fibonacci
{	
    public static int fib(int n)
    {
      if(n==1)
        return 0;
      if(n==2 || n==3)
        return 1;
      return (fib(n-1)+fib(n-2));    
    }
    public static void main(String args[])
    {
     System.out.print(fib(8));
    }
}