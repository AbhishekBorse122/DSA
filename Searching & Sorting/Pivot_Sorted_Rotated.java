//Program to find Pivot of Sorted & Rotated Array.
//Pivot Point is the point at which array is divide in two subarray.
import java.util.Arrays;
public class Pivot_Sorted_Rotated
{
    static int findPivot(int a[],int i,int j)
    {
        if(i>j)
            return -1;
        if(i==j)    
            return i;
        int mid=(i+j)/2;
        if(mid<j && a[mid]>a[mid+1])
            return mid;
        if(mid>i && a[mid]<a[mid-1])
            return mid-1;
        if(a[i]>=a[j])
          return findPivot(a,i,mid-1);    
        return findPivot(a,mid+1,j);    
    }
    public static void main(String args[])
    {
     int P[]={3,4,5,6,7,1,2,3};//here pivot is 4 from which the two subarray is divide.
     System.out.println("Pivot: "+findPivot(P,0,P.length));
    }
}    