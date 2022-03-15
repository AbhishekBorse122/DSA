// The string consists of exactly n / 2 opening brackets '[' and n / 2 closing brackets ']'.
// Find minimum swap to to balanced the paranthesis.
import java.util.*; 
public class Min_Swap_Balanced
{
  public static int swapCount(String s)
  {
       int curLeft=0,pmtRight = 0;
       char c[]=s.toCharArray();
       for(char ch: c) {
          if(ch == '[') {
            ++curLeft;
          }else {
             --curLeft;
          }
          if(curLeft < 0) {
            curLeft = 0;
            ++pmtRight;
          }
        }
        return (pmtRight + 1) / 2;
  }
  
  public static void main(String[] args)
  {
    String s = "[]][][";
    System.out.println(swapCount(s));  
    s ="]]]]]]][[[[[[[";
    System.out.println(swapCount(s));  
    
  }
}