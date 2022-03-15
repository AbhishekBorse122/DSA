import java.util.*;
public class Long_Subsequence
{
    static void subSequence(int a[])
    {
       int n=a.length-1;
       int count=1;
       int max=0;
       ArrayList<Integer> A=new ArrayList<>();
       Arrays.sort(a);
       for(int i:a){ //to avoid the repeatation of number.
           if(!A.contains(i))
               A.add(i);
       }
       for(int i=0;i<n-1;i++)
       {  
        if(A.get(i)+1==A.get(i+1)){
         count++;
        }
        else{
            count=1;
        }
        max=Math.max(count,max);
       }
       System.out.println("Longest Subsequence: "+max);
    }
    public static void main(String args[])
    {
    int a[]=new int[]{11,9,10,8,1,22,3,51,2,3,16,4,7,6,5};
    subSequence(a);
    }
}