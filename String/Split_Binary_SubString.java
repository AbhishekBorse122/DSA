//Program to Split Binary String Substring with equal 0's and 1's.
//T-O(N) S-O(1)  N-length of SubString.
public class Split_Binary_SubString
{
    static void maxSubstr(String S)
    {
      int count0=0,count1=0;    
      int cnt=0; 
      for(int i=0;i<S.length();i++) 
      { 
        if(S.charAt(i)=='0')
         {
          count0++;
         }
        else
         {
          count1++;
         }
         if(count0==count1)
         {
             cnt++;
         }
      }
      if(count0!=count1)
      {
        System.out.println("Binary String Splitting is Not Possible");
        return;
      }   
      System.out.println("Binary String Can Split Into Substring: "+cnt);
    }
    public static void main(String args [])
    {
     String S="0111000011";
     maxSubstr(S);
    }
}