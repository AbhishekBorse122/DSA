import java.util.*;
public class isSorted
{
  static boolean isSorted(int a[],int s,int e)
  {
   if(e==0 || e==1){
     return true;
   }
   if(a[s]>a[s+1]){
     return false;
   }
   else{
     return isSorted(a,s+1,e-1);
   }
  }
  public static void main(String args[])
  {  
    int a[]={1,3,8,4,8,9,13};
   System.out.println(isSorted(a,0,a.length-1));
  }
}  