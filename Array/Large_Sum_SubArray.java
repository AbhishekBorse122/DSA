//Program to find the maximum sum of SubArray.
//Kadane's Algorithm(V.Imp)
public class Large_Sum_SubArray
{
    static void maxSubArraySum(int a[])
    {
        int Max = Integer.MIN_VALUE, max_ending= 0;
        int start=0,end=0,s=0;
        for (int i=0;i<a.length;i++)
        {
            max_ending+=a[i];
            if(Max < max_ending){
              Max = max_ending;
              start=s;
              end=i;
            }
            if(max_ending<0){
               max_ending= 0;
               s=i+1;
            } 
        }
        System.out.println("Maximum Value Of SubArray: "+Max+"\nStart Index: "+start+"\nEnd Index: "+end);
    }
    public static void main(String args[])
    {
     int P[]={-1,1,2,3,-5,2,9,-15,9};
     maxSubArraySum(P);
    }
}    