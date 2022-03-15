//Program To find Out the Union and Intersection of Two UnSorted Arrays.
//you can HashSet to perform the Union & Intersection.
import java.util.Arrays;
public class Union_Intersection
{
    static void Intersection(int a[],int b[],int m,int n)
    {
     int i=0,j=0;
     Arrays.sort(a);
     Arrays.sort(b);
      while(i<m && j<n)
      {
        if(a[i]<b[j])
         {  i++; }
        else if(a[i]>b[j])
           { j++; }
        else{
            System.out.print("  "+a[i++]);
            j++;
        }
      }
    }
    static void Union(int a[],int b[],int m,int n)
    {
     int i=0,j=0;
     Arrays.sort(a);
     Arrays.sort(b);
        while (i < m && j < n) {
            if (a[i] < b[j])
                System.out.print(a[i++] + " ");
            else if (b[j] < a[i])
                System.out.print(b[j++] + " ");
            else {
                System.out.print(b[j++] + " ");
                i++;
          }
        } 
        // print the remaining elements of larger array.
        while (i < m)
            System.out.print(a[i++] + " ");
        while (j < n)
            System.out.print(b[j++] + " ");
    }
    public static void main(String args [])
    {
     int P[]={11,1,92,11};
     int R[]={45,71,92,14,11,19,11};
     int m=P.length;
     int n=R.length;
     Intersection(P,R,m,n);
     System.out.print('\n');
     Union(P,R,m,n);
    }
}
