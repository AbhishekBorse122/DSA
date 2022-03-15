//Java program to find maximum rectangular area in linear time
import java.util.Stack;
public class Histogram_Area
{
	static int getMaxArea(int hist[], int n)
	{
		Stack<Integer> S = new Stack<>();
		int max_area = 0; // Initialize max area
		int tp; // To store top of stack
		int area_with_top; // To store area with top bar as the smallest bar
		int i = 0;
		while (i < n)
		{
			if (S.empty() || hist[S.peek()] <= hist[i])
				S.push(i++);
			else
			{
				tp = S.peek(); // store the top index
				S.pop(); // pop the top
				area_with_top = hist[tp] * (S.empty() ? i : i - S.peek() - 1);
				if (max_area < area_with_top)
					max_area = area_with_top;
			}
		}
		while (!S.isEmpty())
		{   
			tp = S.peek();
			S.pop();
			area_with_top = hist[tp] * (S.empty() ? i : i - S.peek() - 1);
			if (max_area < area_with_top)
				max_area = area_with_top;
		}
		return max_area;
	}
	// Driver program to test above function
	public static void main(String[] args)
	{
		int hist[] = { 6, 2, 5, 4, 5, 1, 1 };
		System.out.println("Maximum area is " + getMaxArea(hist, hist.length));
	}
}
