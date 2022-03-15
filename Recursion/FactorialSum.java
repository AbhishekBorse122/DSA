public class FactorialSum
{
  public static int factorial(int n)
  {
      if(n==0 || n==1)
         return 1;
      return n*factorial(n-1);    
  }  
  public static int findSum(int n)
  {
   int fact=factorial(n);
   int sum=0,temp=0;
   while(fact>=10){
     sum+=fact%10;
     fact=fact/10;
   }
   return sum+fact;
  }
  public static void main(String a[])
  {
   //System.out.println(factorial(11));   
   System.out.println(findSum(11));
  }
}