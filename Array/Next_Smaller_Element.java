//Program to find the Next Smaller Element for each of the Array Element.
import java.util.Stack;
public class Next_Smaller_Element
{
    static void nextSmaller(int A[],int n)//T-O(n) & S-O(1)
    {
     for(int i=0;i<A.length;i++)
     {
         int Result=Integer.MIN_VALUE;
         boolean flag=false;
         for(int j=i;j<A.length;j++)
         {
             if(A[i]>A[j] && Result<A[j])
             {
                 Result=A[j];
                 flag=true;
             }
         }
         if(!flag)
         {
             System.out.print(A[i]+"-->"+"-1\n");
         }
         else
         {
                 System.out.print(A[i]+"-->"+Result+"\n");
         }
     } 
    }
    public static void NSE(int A[],int n)
    {
        Stack<Integer> S=new Stack<>();
        S.push(A[0]);
        for(int i=1;i<n;i++)
        {
            if(S.isEmpty())
            {
                S.push(A[i]);
                continue;
            }
            while(S.isEmpty()==false && S.peek()>A[i])
            {
                System.out.println(S.peek()+"-->"+A[i]);
                S.pop();
            }
            S.push(A[i]);
        }
        while(S.isEmpty()==false)
        {
            System.out.println(S.peek()+"-->"+"-1");
            S.pop();
        }
    }
    public static void main(String args [])
    {
     int P[]={4,3,6,7,10,8,1};
     nextSmaller(P,P.length);
     System.out.println("\n");
     NSE(P,P.length);
    }
}