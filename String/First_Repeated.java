//This program is to find the first_Repeated String in A Senetence.
//This solution is with T-O(n) & S-O(n); 
import java.util.*;
public class First_Repeated
{
    //we can find out the solution by the brute force approach
    static void firstRepeated(String S)
    {
     ArrayList<String> A=new ArrayList<String>();
     String N[]=S.split("\\s");
     for(int i=0;i<S.length();i++)
     {
        if(!A.contains(N[i])){
           A.add(N[i]);
        }
        else{
           System.out.print(N[i]);
           return;
        } 
     }
    }
    public static void main(String args[])
    {
      String S=" What he is arya no he is aryan ";
      firstRepeated(S);
    }
} 
