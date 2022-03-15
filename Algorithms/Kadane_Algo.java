public class Kadane_Algo
{
    static void maxSubArraySum(int a[])
    {
        int size = a.length;
        int Max = Integer.MIN_VALUE, max_ending= 0;
        int start=0,end=0,s=0;
        for (int i=0;i<size;i++)
        {
            max_ending= max_ending + a[i];
            if (Max < max_ending)
                {
                    Max = max_ending;
                    start=s;
                    end=i;
                }
            if (max_ending < 0)
                {
                    max_ending= 0;
                    s=i+1;
                } 
        }
        System.out.println("Maximum Value Of SubArray: "+Max+"\nStart Index: "+start+"\nEnd Index: "+end);
    }
    public static void main(String args[])
    {
     int P[]={3,4,-1,3,-5,2,};
     Kadane_Algo A=new Kadane_Algo();
     maxSubArraySum(P);
    }
}    