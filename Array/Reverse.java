import java.util.*;
public class Reverse
{
    static void reverse(int a[])
    {  
      int n=a.length;
      int l=0,r=n-1;
      while(l<r){
          int temp=a[r];
          a[r]=a[l];
          a[l]=temp;
          l++;
          r--;
      }  
      for(int i:a){
        System.out.print(" "+i); 
      }
    }
    public static void main(String args[])
    {
      int P[]={3,1,6,7,1,3,2,8};  
      reverse(P);
      System.out.print("\n");     
      Collections.reverse(Arrays.asList(P));
      for(int i:P){
        System.out.print(" "+i); 
      }
    }
}
