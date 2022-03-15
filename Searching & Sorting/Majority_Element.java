import java.util.*;
public class Majority_Element
{	
    public static int findMajority(int a[])
    {
        if(a.length==1){return a[0];}
        Map<Integer,Integer> M=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(M.containsKey(a[i])){
                int count=M.get(a[i])+1;
                M.put(a[i],count);
                if(count>a.length/2){
                    return a[i];
                }
            }else{
                M.put(a[i],1);
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
     int a[]={1,2,3,4,4,4,4,4,4,5,6};
      System.out.print(findMajority(a));
    }
}