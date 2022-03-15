public class Sample
{
    void fib(int n)
    {
      if(n==0)
        return ;
      if(n==1)
        return ;
      int a=0,b=1,ans=0;
      for(int i=3;i<=n;i++){
        ans=a+b;
        a=b;
        b=ans;
      }    
      System.out.println(ans);
    }
    public static void main(String args[])
    {
      Sample S=new Sample();  
      S.fib(8);  
    }
}