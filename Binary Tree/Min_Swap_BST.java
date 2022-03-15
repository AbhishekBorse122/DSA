import java.util.*;
import java.util.ArrayList;
public class Min_Swap_BST
{
    static class Pair{
        int first, second; 
        Pair(int a, int b){
            first = a;
            second = b;
        }
    }
    // Inorder Traversal of Binary Tree
    static void inorder(int a[], ArrayList<Integer> v, int n, int index)
    {
        // if index is greater or equal to ArrayList size
        if(index >= n)
            return;             
        inorder(a, v, n, 2 * index + 1);
        // push elements in ArrayList
        v.add(a[index]);
        inorder(a, v, n, 2 * index + 2);
    }
    public static int minSwaps(ArrayList<Integer> arr)
    {
        int n = arr.size(); 
        ArrayList < Pair > arrpos = new ArrayList < Pair > ();
        for (int i = 0; i < n; i++)
             arrpos.add(new Pair(arr.get(i), i));
        // Sort the array by array element values to
        // get right position of every element as the
        // elements of second array.
        arrpos.sort(new Comparator<Pair>()
        {
            @Override
            public int compare(Pair o1, Pair o2)
            {
                return o1.first - o2.first;
            }
        });
        // To keep track of visited elements. Initialize
        // all elements as not visited or false.
        // for(Pair P: arrpos){
        //     System.out.println(P.first+" "+P.second);
        // }
        Boolean[] vis = new Boolean[n];
        Arrays.fill(vis, false);
        // Initialize result
        int ans = 0;
        // Traverse array elements
        for (int i = 0; i < n; i++)
        {
            // already swapped and corrected or
            // already present at correct pos
            if (vis[i] || arrpos.get(i).first == i)
                continue;
            // find out the number of  node in
            // this cycle and add in ans
            int cycle_size = 0;
            int j = i;
            while (!vis[j])
            {
                vis[j] = true;
                // move to next node
                j = arrpos.get(j).second;
                cycle_size++;
            }
            // Update answer by adding current cycle.
            if(cycle_size > 0)
            {
                ans += (cycle_size - 1);
            }
        }  
        // Return result
        return ans;
    }
    public static void main(String args[])
    {
     int a[] = { 5, 6, 7, 8, 9, 10, 11 };
     int n = a.length;      
     ArrayList<Integer> v = new ArrayList<Integer>();
     inorder(a, v, n, 0);
    //  System.out.println(v);
     System.out.println("Minimum Swaps: "+minSwaps(v));
    }
}