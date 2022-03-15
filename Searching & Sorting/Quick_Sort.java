// T(n)= O(n*n) worst-case
// S(n)= O(n)
// We choose first element as pivot.
public class Quick_Sort
{
	static int partition(int a[], int l,int r)
	{
      int cnt=0;
      int pivot=a[l];
      // find the element greater than pivot in array
      for(int i=l+1;i<=r;i++) 
      {
       if(pivot>=a[i]){
           cnt++;
       }
      }
      // swap pivot to its actual positon in sorted array
      int pivotIndex=l+cnt;
      swap(a,pivotIndex,l);
      // now swap ele<pivot to left of pivot & ele>pivot to right of pivot.    
      int i=l,j=r;
      while(i<pivotIndex && j>pivotIndex)
      {
          while(a[i]<pivot){
              i++;
          }
          while(a[j]>pivot){
              j--;
          }
          if(i<pivotIndex && j>pivotIndex){
             swap(a,i++,j--); 
          }
      }
      return pivotIndex;
	}
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
	static void quickSort(int a[], int l, int r)
	{
	  if(l<r)
      {
        int p=partition(a,l,r);
        quickSort(a,l,p-1);
        quickSort(a,p+1,r);
      }	
	}
	public static void main(String args[])
	{
		int a[] = { 12, 11, 13, 5, 6, 7 };
		quickSort(a, 0, a.length - 1);
        for(int i:a){
            System.out.print(i+" ");
        }
	}
}
