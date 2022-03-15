//Program To arrange the Negative elements at the One Side of the Array.
import java.util.*;
public class Move_Negative
{
    public static void Rearrange(int a[])
    { 
        int j=0,temp;
        for(int i=0;i<a.length;i++)
        {   
            if(a[i]<0)  
            {
                if(i!=j)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                j++;
            }
        }    
    }
    public static void segregateElements(int arr[], int n)
    {
        ArrayList<Integer>A=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0){
                A.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                A.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=A.get(i);
        }
    }
    public static void printArray(int P[])
    {
     System.out.print("\n");
     for(int i=0;i<P.length;i++)
     {
      System.out.print(" "+P[i]);
     }
    }
    public static void main(String args [])
    {
     int P[]={-2,12,2,-4,-11,9,6,-15,13,23,-17};
     int R[]={43,-18,-32,-22,-41,37,31,-11,33,3,-1};
     Rearrange(P);
     printArray(P);
     segregateElements(R,R.length);
     printArray(R);
    }
}