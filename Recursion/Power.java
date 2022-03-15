// If we have to find the power we directly use the for or while loop.
// But by recurive function we find the Power in few operations.
// Recurrence Relation if (a,b) b is odd then power=a*(a^b/2)*(a^b/2)
// b is even then power= (a^b/2)*(a^b/2)
public class Power
{  
    static int findPower(int a,int b)
    {
      if(b==0){
          return 1;
      }
      if(b==1){
          return a;
      }
      int ans=findPower(a,b/2);
      if(b%2==0){
         return ans*ans;
      }else{
        return a*ans*ans;
      }
    }
    public static void main(String[] args)
    {
      int a=2,b=15;
      System.out.println(findPower(a,b));
    }
}
