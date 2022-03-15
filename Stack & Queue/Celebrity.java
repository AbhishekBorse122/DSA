//The celebrity finding problem.
//T-O(n) S-O(n)
import java.util.Stack;
public class Celebrity
{
    static int celebrity(int M[][], int n)
    {
        Stack<Integer> S = new Stack<>();
        int c;
        for (int i = 0; i < n; i++)
        {
            S.push(i);
        }
        while (S.size() > 1)
        {
            int a = S.pop();
            int b = S.pop();
            if (M[a][b]==1)
            {
                S.push(b);
            }
            else
                S.push(a);
        }
        if(S.empty())
            return -1;
        c = S.pop();
        for (int i = 0; i < n; i++)
        {
            if (i != c && (M[c][i]==1 || M[i][c]==0))
                return -1;
        }
        return c;
    }
    public static void main(String a[])
    {
        int A[][]={{0,0,1,0},
                   {0,0,1,0},
                   {0,0,0,0},
                   {0,0,1,0}};
        System.out.print("Celebrity: "+celebrity(A,4));          
    }
}   