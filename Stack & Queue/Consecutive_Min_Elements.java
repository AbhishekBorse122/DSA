// find the number Consecutive Min Elements less than or equal to current element(include) 

import java.util.Stack;
public class Consecutive_Min_Elements 
{  
    static int[] findMinElements(int a[])
    {
      int ans[]=new int[a.length];
      Stack<Integer> p=new Stack<>();
      Stack<Integer> w=new Stack<>();
      for(int i=0;i<a.length;i++)
      {
        int val = 1;
        while (!p.isEmpty() && p.peek() <= a[i]) {
          p.pop();
          val += w.pop();
        }
        p.push(a[i]);
        w.push(val);
        ans[i]=val; 
      } 
     return ans;
    }
    public static void main(String[] args)
    {
      int a[]={100,80,60,70,60,75,85};
      int ans[]= findMinElements(a);
      for(int i=0;i<a.length;i++){
          System.out.println(a[i]+"  --> "+ans[i]);
      } 
    }
}
