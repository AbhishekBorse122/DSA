import java.util.Stack;
public class Next_Greater2 
{
    class EleInd{
      int ele,ind; 
      public EleInd(int ind,int ele){
        this.ind=ind;
        this.ele=ele;
      }   
    } 
    public int[] nextGreaterElements(int[] a) 
    {
      Stack<EleInd>S=new Stack<>();
      int ans[]=new int[a.length];
      S.add(new EleInd(0,a[0]));  
      for(int i=1;i<a.length-1;i++)
      {
          EleInd N=new EleInd(i,a[i]);
          if(!S.isEmpty())
          {
            EleInd E=S.pop();
            while(E.ele<N.ele)
            {
             ans[E.ind]=N.ele;
             if(S.isEmpty()){
                break;
             } 
             E=S.pop();   
            }
            if(E.ele>N.ele){
               S.push(E); 
            }    
          }   
          S.push(N); 
       }  
       while(!S.isEmpty()){
          EleInd I=S.pop();
          ans[I.ind]=-1; 
       }
       return ans;
     }
    public static void main(String[] args)
    {
      int a[]={13,42,5,15,62,70,17,20};
      int ans[]=new Next_Greater2().nextGreaterElements(a);
      for(int i:ans){
        System.out.print(i+" ");
      }
    }
}