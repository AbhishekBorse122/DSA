public class SayDigits
{	
    public static void sayDigit(int n,String A[])
    {
     if(n==0)
       return; 
     int digit=n%10;
     n=n/10;
     sayDigit(n,A);
     System.out.print(" "+A[digit]);
    }
    public static void main(String args[])
    {
     String A[]={"Zero","One "," Two","Three","Four","Five","Six","Seven","Eight","Nine"};   
     sayDigit(6780,A);
    }
}