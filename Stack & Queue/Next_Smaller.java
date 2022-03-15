// T-O(n) & S-O(n)
import java.util.Stack;
public class Next_Smaller
{
    static void nextSmaller(int a[])
    {
        int n=a.length;
        int ele,next;
        Stack<Integer> S=new Stack<>(); 
        S.push(a[0]);
        for(int i=1;i<n;i++)
        {
          next=a[i];
          if(!S.isEmpty())
          {
            ele=S.pop();
            while(ele>next)
            {
                System.out.println(ele+" --> "+next);
                if(S.isEmpty())
                {
                    break;
                }
              ele=S.pop();
            }
            if(ele<next){
                S.push(ele);
            }
          } 
          S.push(next);
        }
        while(!S.isEmpty())
        {
            ele=S.pop();
            next=-1;
            System.out.println(ele+" --> "+next);
        }
    }
    public static void main(String a[])
    {
      int b[]={4,1,14,5,9};
      nextSmaller(b);
    }
}