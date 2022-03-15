//It is Easy implementation for Map we are easily Store the keys and value.
//T-O(n) & S-O(n) bcz HashMap linear Space.
import java.util.*;
public class Majority_Element
{
    static void findMajority(int a[])
    {
        Map<Integer,Integer> M=new HashMap<>();
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(M.containsKey(a[i]))
             { 
                int count=M.get(a[i])+1;//Here counting of the elements is 
                M.put(a[i],count); 
                if(count>n/2)
                  {
                   System.out.println("Majority Element: "+a[i]);
                   return;
                  }  
             } 
            else
             {
                 M.put(a[i],1);
             }   
        }
        System.out.println("No Majority Element is Found");
    }
    public static void main(String args [])
    {
     int a[]={2,2,1,1,1,2,2};
     findMajority(a);
    }
} 
