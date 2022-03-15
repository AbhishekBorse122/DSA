// Find the the key in Array By Recursion
public class IsFound
{  
    static boolean isFound(int a[],int s,int key)
    {
      if(s==a.length){
          return false;
      }
      if(a[s]==key){
         return true;
      }
      return isFound(a,s+1,key);
    }
    public static void main(String[] args)
    {
      int a[]={10,53,20,50,19,34,21,68,90};
      System.out.println(isFound(a,0,10));
    }
}