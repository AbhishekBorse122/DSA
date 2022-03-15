import java.util.*;
public class First_Last_Position
{	
    static int[] firstLast(int a[],int K)
    {
     int r[]={-1,-1};
     boolean flag=false;
     for(int i=0;i<a.length;i++)
     {
         if(!flag && a[i]==K){
             r[0]=i;
             r[1]=i;
             flag=true;
             continue;
         }
         if( flag && a[i]==K){
             r[1]=i;
         }
         if(flag && a[i]!=K){return r;}
     }
    return r;
    } 
    public static void main(String args[])
    {
      int a[]={3,4,4,5,5,5,7,8,9};
      int m[]=firstLast(a,5);
      System.out.print(m[0]+"  >-->  "+m[1]);
    }
}