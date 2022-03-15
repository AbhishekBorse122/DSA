// T-O(n) & S-O(n)
import java.util.Stack;
public class Next_Greater
{
    static void nextGreater(int a[])
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
            while(ele<next)  
            {                        
                System.out.println(ele+" --> "+next);
                if(S.isEmpty()){
                    break;
                }
                ele=S.pop();
            }
            if(ele>next){
                S.push(ele);
            }
          } 
          S.push(next);
        }
        while(!S.isEmpty())
        {
            ele=S.pop();
            System.out.println(ele+" --> "+-1);
        }
    }
    public static void main(String a[])
    {
      int b[]={4,1,3,14,5,9};
      nextGreater(b);
      System.out.println("");
      nextGreater2(b);
    }
}






