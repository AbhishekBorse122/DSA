import java.util.*;
public class Sample 
{
   public static void main(String args[]) 
   {
     Map<String, Integer> M = new HashMap<>();
     M.put("A",3454);
     M.put("B",5423);
     M.put("D",9012);
     M.put("C",9824);
     M.put("E",3783);
     for(String S:M.keySet()){
         System.out.println(M.get(S));
     }
   }
}