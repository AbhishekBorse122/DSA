//program to find the elements that appear more than n/k times in array.
//It is the Best and Optimize solution with O(n) time Complexity.
import java.util.*;
public class FindNbyK
{
  static void find(int a[],int k)
    {
      int x=a.length/k;
      Map<Integer,Integer> A=new HashMap<>(); 
      for(int i=0;i<a.length;i++)
      {
         if(!A.containsKey(a[i]))
          {
            A.put(a[i],1);
          }
        else
          { 
            A.put(a[i],A.get(a[i])+1);// increase the value by 1
          }
      }
      for(Map.Entry<Integer,Integer> M:A.entrySet())
      {
        Integer temp=(Integer) M.getValue();
        if(temp>x)
          { 
            System.out.println(" "+M.getKey());
          }
      }
    }
    public static void main(String args[])
    {
     int P[]={3,1,4,5,2,3,2,3};
     find(P,3);
    }
}    