//This program is to find out the minimum flips required to Alternate the Binary Number.
//The number 0s & 1s are must be same or -1 by other number i.e 0s-3 or 4 & 1s-4 or 3.Otherwise program will not give correct output. 
public class Binary_Flips
{
    static int getFlips(String S,char c)
    {
       int count=0;
       for(int i=0;i<S.length();i++)
       {
           if(S.charAt(i)!=c)
               count++;
            c=(c=='0'?'1':'0');
       }
       return count;
    }
    static int minFlips(String S)
    {      
      return Math.min(getFlips(S,'0'),getFlips(S,'1'));
    }
    public static void main(String args [])
    {
      String S="0001010111";
      System.out.println("Minimum Flips: "+minFlips(S));
    }
} 