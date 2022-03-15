import java.util.*;
public class Missing_Repeating
{	
    public static void findNumber(int a[])
    {
       Arrays.sort(a);
       int miss=0,repeat=0;
       for(int i=0;i<a.length;i++)
       {
         if(i==a.length-1){
           break;
         }
         if(a[i]==a[i+1]){
             repeat=a[i];
         }
         if((a[i+1]-a[i])!=1){
             miss=i+1;
         }
       }
       System.out.print(repeat+" "+miss);
    } 
    public static void main(String args[])
    {
     int a[]={1,2,3,3,4,5,6,7,8};
     findNumber(a);
    }
}