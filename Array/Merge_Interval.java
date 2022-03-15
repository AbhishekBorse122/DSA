import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
class Interval
{
	int start,end;
	Interval(int start, int end)
	{
		this.start=start;
		this.end=end;
	}
}
public class Merge_Interval 
{
	public static void mergeIntervals(Interval arr[])
	{		
		if (arr.length <= 0)
			return;
		Stack<Interval> S=new Stack<>();
		Arrays.sort(arr,new Comparator<Interval>(){
			public int compare(Interval i1,Interval i2)
			{
				return i1.start-i2.start;
			}
		});
		S.push(arr[0]);
		for (int i = 1 ; i < arr.length; i++)
		{
			Interval top = S.peek();
			if (top.end < arr[i].start)
				S.push(arr[i]);
			else if (top.end < arr[i].end)
			{
				top.end = arr[i].end;
				S.pop();
				S.push(top);
			}
		}
		System.out.print("The Merged Intervals are: ");        
		while (!S.isEmpty())
		{
			Interval t = S.pop();
			System.out.print("["+t.start+","+t.end+"] ");
		}
	}
	public static void main(String args[]) {
		Interval arr[]=new Interval[4];
		arr[0]=new Interval(6,8);
		arr[1]=new Interval(1,5);
		arr[2]=new Interval(2,4);
		arr[3]=new Interval(4,7);
		mergeIntervals(arr);
	}
}
