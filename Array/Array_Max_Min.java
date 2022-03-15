import java.util.*;
public class Array_Max_Min
{
    public void Max(int a[])
    { 
     int MAX=a[0];
     for(int i=0;i<a.length;i++)
      {
        if(a[i]>MAX)
         {
                MAX=a[i];
         }
      }
      System.out.println("Max Element: "+MAX);
    }
     public void Min(int a[])
    { 
     int MIN=a[0];
     for(int i=0;i<a.length;i++)
      {
        if(a[i]<MIN)
         {
                MIN=a[i];
         }
      }
      System.out.println("Max Element: "+MIN);
    }
    public static void main(String args [])
    {
     int P[]={22,32,17,83,91,34,65,41};
     Array_Max_Min A=new Array_Max_Min();
     A.Max(P);
     A.Min(P);
     int a[]={4,4,5,6,66,7};
     Arrays.sort(a);
     System.out.println("Min:"+a[0]+" Max: "+a[a.length-1]);
    }
}