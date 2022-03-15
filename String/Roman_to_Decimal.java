import java.util.Map;
import java.util.HashMap;
public class Roman_to_Decimal
{
    private static final Map<Character,Integer> R=new HashMap<Character,Integer>()
    {
        {
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        }
    };
    static int toDecimal(String S)
    {
      int sum=0,n=S.length();
      for(int i=0;i<n;i++)
      {
        if(i!=n-1 && R.get(S.charAt(i))<R.get(S.charAt(i+1)))
        {
          sum+=R.get(S.charAt(i+1))-R.get(S.charAt(i));
          i++;
        }
        else
        {
           sum+=R.get(S.charAt(i));
        }
      } 
      return sum;
    }
    public static void main(String args [])
    {
      String S="MCMIV";
      System.out.println(S+" in Integer: "+toDecimal(S));
    }
} 