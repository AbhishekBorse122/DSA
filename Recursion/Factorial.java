import java.util.*;
public class Factorial
{	
    static int count=0; 
    public static int factorial(int n)
    {
        count++;
        if(n==1){
          return 1;
        }  
      return n*factorial(n-1);
    }
    public static void main(String args[])
    {
     System.out.println(factorial(3));
     System.out.println(count);
     System.out.println(factorial(4));
     System.out.println(factorial(5));
    }
}