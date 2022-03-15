//Program to find the duplicate element from the Array.
import java.util.*;
public class Duplicate_Array
{
    static void Duplicate1(int a[])
    { 
      ArrayList<Integer> R=new ArrayList<>(); 
      for(int i=0;i<a.length;i++)
      {
        for(int j=0;j<a.length;j++)
        {
          if(i==j)
            continue;
          if(a[i]==a[j])
          {
            if(!R.contains(a[i]))
            {
              R.add(a[i]);
            }
          }    
        }
      }  
      System.out.println("Duplicate Element: "+R);
    }
    static void Duplicate2(int a[])
    {
      ArrayList<Integer> R=new ArrayList<>();
      Arrays.sort(a);
      for(int i=1;i<a.length-1;i++)
      {
         if((a[i]==a[i+1] || a[i]==a[i-1]) && !R.contains(a[i]))
          {
              R.add(a[i]);
          }
      }
      System.out.println("\nDuplicate2 Elements: "+R);
    }
    public static ArrayList<Integer> duplicates(int a[], int n) 
    {
        ArrayList<Integer> A=new ArrayList<Integer>();
        Arrays.sort(a);
        for(int i=0;i<n-1;i++){
            if((a[i]==a[i+1] || a[i]==a[i-1])  && !A.contains(a[i])){
               A.add(a[i]);
               System.out.println(a[i]);
            }
        }
        if(A.size()==0){
            A.add(-1);
            return A;
        }else{
         return A;   
        }
    }
    public static void main(String args [])
    {
     int P[]={14,22,22,12,15,14,86,10,10,10};
     Duplicate1(P);
     Duplicate2(P);
    int R[]={1,1};
     System.out.println(duplicates(R,R.length));
    }
}