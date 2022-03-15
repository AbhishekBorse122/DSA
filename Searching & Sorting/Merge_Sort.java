// T(n)= O(n*log_n) worst-case
// S(n)= O(n)
public class Merge_Sort
{
	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	static void merge(int a[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		/*Copy data to temp arrays*/
		for (int i = 0; i < n1; ++i)
			L[i] = a[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = a[m + 1 + j];
		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j])
				a[k++] = L[i++];
			else
				a[k++] = R[j++];
		}
		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			a[k++] = L[i++];
		}
		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			a[k++] = R[j++];
		}
	}
	static void sort(int a[], int l, int r)
	{
		if (l < r) 
        {
			// Find the middle point
			int m=l+(r-l)/2;
			// Sort first and second halves
			sort(a, l, m);
			sort(a, m + 1, r);
			// Merge the sorted halves
			merge(a, l, m, r);
		}
	}
	public static void main(String args[])
	{
		int a[] = { 12, 11, 13, 5, 6, 7 };
		sort(a, 0, a.length - 1);
        for(int i:a){
            System.out.print(i+" ");
        }
	}
}
