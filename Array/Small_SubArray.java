//Program to find the Smallest SubArray having Sum greater than the given element.
public class Small_SubArray
{
    static int findSubArray(int a[],int n,int K)
    {
      int length=n+1,start=0,end=0;
      for(int i=0;i<n;i++)
      {
        int Sum=a[i];
        if(Sum>K)
            return 1;
        for(int j=i+1;j<n;j++)
        {
          Sum+=a[j];
          if(Sum>K && (j-i+1)<length)
           {
              length=j-i+1;
              start=i;
              end=j;
           } 
        }
      }
    System.out.println("Start Index: "+start+" End Index: "+end);  
    System.out.print("SubArray Length: "); 
    return length;
    } 
    static void subArray(int a[],int sum)// efficent solution with O(n) time complexity
    {
      int n=a.length,start=0,end=0;
      int total=0,len=Integer.MAX_VALUE;
      while(end<n)
      {
        while(total<=sum && end<n)
        {
          total+=a[end++];
        }
        while(total>sum && start <n)
        {
          len=Math.min(len,end-start);
          total -=a[start++];
        }
      }
      System.out.println("SubArray Length: "+len);
    }
    public static void main(String args[])
    {
     int P[]={5,2,3,9,2,5,6,8,7};
     System.out.println(findSubArray(P,P.length,15));
     subArray(P,15);
    }
}   