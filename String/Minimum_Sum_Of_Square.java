//Program to find the Minimum Sum of Square of Characters Count after Removing K Charcaters .
//Amazon Question. check it ones.
//T-O(nlogn)
import java.util.PriorityQueue;
import java.util.*;
public class Minimum_Sum_Of_Square
{
    static int minimumSum(String S,int K)
    {
        final int Max=26;
        int freq[]=new int[Max];
        for(int i=0;i<S.length();i++)//maintain the frequency of each Alphabets.
        {
            freq[S.charAt(i)-'a']++;
        }
        PriorityQueue<Integer> P=new PriorityQueue<>(Collections.reverseOrder());//i.e descending order
        for(int i=0;i<Max;i++)//inserting the frequency into the PQ.
        {
            if(freq[i]!=0)
            {
             P.add(freq[i]);
            }
        }        
        while(K!=0)//decreasing the highest frequency character by K so we get the minimum Sum.
        {
         P.add(P.poll()-1);
         K--;   
        }
        int result=0;
        System.out.println("P:"+P);
        while(!P.isEmpty())
        {
            result+=P.peek()*P.poll();//we are find square and add to the result and remove the respective element.
        }
        return result;
    }
    public static void main(String args[])
    {
     String A="aabcbcbcabcc";
     System.out.println(" "+minimumSum(A,3));     
    }
}