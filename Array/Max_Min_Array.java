//Program to find the Max & Min of Array with minmum comparison.
//T-O(n) S-O(1);
//This Program find Answer with minimum Comparison.It is Linear Search Technique we can also find the solution with the Divide & Conquer Method.
public class Max_Min_Array
{
    static class Pair
    {
        int max,min;
    }
    static Pair findMinMax(int a[],int n)
    {
      Pair P=new Pair();
      if(n==1)
      {
          P.max=a[0];
          P.min=a[0];
      }
      if(a[0]>a[1])
      {
        P.max=a[0];
        P.min=a[1];
      }
      else
      {
        P.max=a[1];
        P.min=a[0];
      }
      for(int i=2;i<a.length;i++)
      {
        if(a[i]>P.max)
        {
         P.max=a[i];
        }
        else if(a[i]<P.min)
        {
         P.min=a[i];
        }   
      }
      return P;
    }
    public static void MaxMin(int a[],int n)//simplified version of above program
    { 
     int max=a[0],min=a[0];
     for(int i=1;i<n-1;i++){
       if(a[i]>max){
         max=a[i];
       }
       else if(a[i]<min){
         min=a[i];
       }       
     }
     System.out.println(max+" "+min);
    }
    public static void main(String args [])
    {
     int a[]={531,444,435,137,835,155,122,731,292,352};
     Pair P1=findMinMax(a,a.length);
     System.out.println("Max: "+P1.max+"\nMin: "+P1.min);
     MaxMin(a,a.length);
    }
} 
