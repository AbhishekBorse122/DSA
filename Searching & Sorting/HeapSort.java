public class HeapSort
{
 public void Sort(int a[])
 {
  int n=a.length; 
  for(int i=n/2-1;i>=0;i--)
    Heapify(a,n,i);
  for(int i=n-1;i>0;i--)
   {
       int temp=a[0];
       a[0]=a[i];
       a[i]=temp;
       Heapify(a,i,0);
   }  
 }
 public void Heapify(int a[],int n,int i)
 {
   int large=i;
   int l=2*i+1;
   int r=2*i+2;
   if(l<n && a[l]>a[large])
     large=l;
   if(r<n && a[r]>a[large])
     large=r;
   if(large!=i)
    { 
     int swap=a[i];
     a[i]=a[large];
     a[large]=swap;
     Heapify(a,n,large);   
    } 
 }
 static void printArray(int a[])
 {
     int n=a.length;
     for(int i=0;i<n;++i)
     {
         System.out.print(" "+a[i]);
     }
 }
 public static void main(String args [])
 {
     int a[]={31,23,35,16,8,19,87,65};
     HeapSort H=new HeapSort();
     H.Sort(a);
     printArray(a);
 }
}