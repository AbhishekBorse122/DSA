import java.util.*;
public class NumOrFact 
{
    public static int findNumber(String S){ 
     String A[]=S.split(" ");
     int sum=0;
     boolean cond=false;
     for(int i=0;i<A.length;i++){
       if(Character.isDigit(A[i].charAt(0))){
         sum+=Character.getNumericValue(A[i].charAt(A[i].length()-1));
         cond=true;
       }
     }
     if(!cond){ return -1;}
     if(isPrime(sum)){ 
       return sum;
     }
     sum=reverse(sum);
     if(isPrime(sum)){return sum;}
     int ans=findFactor(sum);
     return ans;
    }
    public static int findFactor(int num)
    {
      int cnt=0;
      for(int i=1;i<=num;i++){
        if(num%i==0) 
           cnt++; 
      }
     return cnt; 
    }
    public static int reverse(int A)
    {
      String S=String.valueOf(A);
      StringBuilder B=new StringBuilder(S);
      B.reverse();
      return Integer.parseInt(B.toString());
    }
    public static boolean isPrime(int num)
    {
     if(num==0 || num==1)
     {
       return false;
     }
     boolean flag=false;
     for(int i=2;i<=num;i++){
       flag=(num%i==0?false:true);
     }
     return flag;
    } 
    public static void main(String args[])
    {
     String S="Hii 8 asjkjk 99 skkd 13";
     System.out.println(findNumber(S));
    }
}