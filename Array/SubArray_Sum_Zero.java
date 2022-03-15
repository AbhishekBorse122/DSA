//Program to find the SubArray having sum is 0.
import java.util.*;
public class SubArray_Sum_Zero
{
    static int subArrayExists(int arr[])
    {
        ArrayList<Integer> A = new ArrayList<Integer>();
        int sum = 0,ans=0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            if (arr[i] == 0 || sum == 0 || A.contains(sum))  // A.contains() is for suppose A={1,2,3,-3,4,5} i.e for 3 & -3 
               ans++;
            A.add(sum);
        }
        return ans;
    }
    public static void main(String args[])
    {
     int P[]={3,7,1,-1,9,8,2,-4,4};
     System.out.println(subArrayExists(P));
    }
}    