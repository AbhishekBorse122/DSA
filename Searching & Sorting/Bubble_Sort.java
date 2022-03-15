// Bubble Sort  
// T(n)=O(n^2) worst case
public class Bubble_Sort
{	
    static void bubbleSort(int a[],int n)
    {
     if(n==0 || n==1){
       return;
     }
     for(int i=0;i<n-1;i++){
        if(a[i]>a[i+1]){
         int temp=a[i+1];
         a[i+1]=a[i];
         a[i]=temp;
        }
     }
     bubbleSort(a,n-1);
    }
    public static void main(String args[])
    {
      int A[]={65,13,43,52,33,15};
      bubbleSort(A,A.length);
      for(int i:A)
      {
        System.out.print(" "+i);
      }
      String a="a";
      System.out.println(a.substring(0,a.length()));
    }
}