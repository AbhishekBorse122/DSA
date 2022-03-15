//Program to find the duplicate element from the Array.
import java.util.*;
import java.util.Map;
public class Duplicate_Char
{
    static void findDuplicate(String S)//It takes T- O(n^2).
    {
      int i=0;
      ArrayList<Character> A=new ArrayList<>();
      while(i<S.length())
      {
          for(int j=0;j<S.length();j++)
          {
            if(S.charAt(i)==S.charAt(j) && i!=j)
            {
               if(!A.contains(S.charAt(i)))
                 A.add(S.charAt(i)); 
            }
          }
          i++;  
      }
      System.out.println(A);
    }
    static void findDuplicate1(String S)//This is Best Method with T-O(N) & S-O(n)
    {
        Map<Character,Integer> M=new HashMap<>();
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
             if(M.containsKey(c)){               
                 M.put(c,M.get(c)+1);
             }
             else{
                 M.put(c,1);                 
             }
         }
         for(Map.Entry<Character,Integer> E: M.entrySet())
         {
             if(E.getValue()>1)
             {
                 System.out.print(" "+E.getKey());
             }
         }
    }
    public static void main(String args [])
    {
     String S="GeeksForGeeks";
     findDuplicate(S);
     findDuplicate1(S);
    }
}