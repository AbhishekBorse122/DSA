//BinarySearch Algorithm it Only works on The Sorted Array.
import java.lang.String;
import java.util.*;
public class Binary_Search
{
    public static int binarySearch(int A[],int L,int R,int x)
    {
      if(L>R)
        return -1;
      int M=(L+R)/2;
      if(A[M]==x)
        return (M);
      else if(A[M]<x)
        return binarySearch(A,M+1,R,x);
      return binarySearch(A,L,M-1,x);
    }
    public static void main(String args[])
    {
     int A[]={29,34,48,58,67,75,100};
     System.out.println("Postion of Element: "+binarySearch(A,0,A.length-1,48));
    }
}