// Minimum Merge Operation required to make array Palindrome.
public class Array_Palindrome
{
    static void  minOperations(int a[]) 
    { 
        int n=a.length;
        int oper=0,i=0,j=n-1;
        while(i<=j)
        {
          if(a[i]==a[j])
          {
              i++;
              j--;
          }
          else if(a[i]>a[j])
          {
              j--;
              a[j]+=a[j+1];
              oper++;
          }
          else
          {
              a[++i]+=a[i-1];
              oper++;
          }
        }
    System.out.print("Minimum Operation to make Array Palindrome: "+oper);
 }
 public static void main(String[] args) 
 {
    int a[] = {1,2,5,8,2,5,1};// Array will become {1,7,8,7,1}
    minOperations(a);
  }
}
