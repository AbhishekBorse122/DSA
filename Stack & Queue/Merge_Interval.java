// Program to Merge the Overlapping Interval.
// Problem used the 2d array instead of Interval Class then we create a Interval class insert the 2d array value to it and again
// return the ans in 2d array. 
import java.util.Stack;
import java.util.Comparator;
import java.util.Arrays;
public class Merge_Interval
{
    static class Interval
    {
      int start,end;  
      Interval(int start,int end)
      {
        this.start=start;
        this.end=end;
      }
    };
    static class Merge implements Comparator<Interval>
    { 
      public int compare(Interval I1,Interval I2)
      { 
        return I1.start-I2.start;
      }
    };
    public static void MergeInterval(Interval A[])
    {
        if(A.length<=0) return;
        Stack<Interval> S=new Stack<>();
        Arrays.sort(A,new Merge());
        for(Interval K:A){
          System.out.print("["+K.start+","+K.end+"],");
        }
        S.push(A[0]);
        for(int i=1;i<A.length;i++)
        {
            Interval top=S.peek();
            if(top.end<A[i].start)
            {
                S.push(A[i]);
            }
            else if(top.end<A[i].end)
            {
                top.end=A[i].end;
                S.pop();
                S.push(top);
            }
        }
        System.out.print("\nThe Merged Overlap Intervals Are: ");
        while(!S.isEmpty())
        {
          Interval t=S.pop();
          System.out.print("["+t.start+","+t.end+"]");
        } 
    }
    public static void main(String args [])
    {
     Interval a[]=new Interval[5];
     a[0]=new Interval(1,3);
     a[1]=new Interval(15,18);
     a[2]=new Interval(2,6);
     a[3]=new Interval(7,19);
     a[4]=new Interval(8,10);
     MergeInterval(a);
     
    }
}
