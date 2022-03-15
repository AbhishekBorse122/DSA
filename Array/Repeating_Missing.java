//Program to find the Missing & Repeating Elements in the Array.
//It is Easy implementation for Map we are easily Store the keys and value.
//T-O(n) 
import java.util.*;
public class Repeating_Missing
{
    static void findElements(int a[])
    {
        Map<Integer,Boolean> M=new HashMap<>();
        int n=a.length;
        System.out.print("Repeating Elements: ");
        for(Integer i: a)
        {
            if(M.get(i)==null)
             { M.put(i,true); }
            else
             {
               System.out.print(" "+i);
             }    
        }
        System.out.print("\nMissing Elements: ");
        for(int i=1;i<=n;i++)
        {
            if(M.get(i)==null)
            {
                System.out.print(" "+i);
            }
        }
    }
    public static void main(String args [])
    {
     int a[]={2,3,4,2,1,1,4,3,5};
     findElements(a);
    }
} 
