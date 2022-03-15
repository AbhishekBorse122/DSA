public class Range_Distribution
{ 	
	public static void threeWayPartition(int a[], int l, int h) 
	{ 
		int start = 0,end = a.length-1; 		
		for(int i=0;i<=end;) 
		{ 
			if(a[i]<l) 
			{ 	
		    	int temp = a[start]; 
				a[start++] = a[i]; 
				a[i++] = temp; 
			} 
			else if(a[i]>h) 
			{ 
				int temp = a[end]; 
				a[end--] = a[i]; 
				a[i] = temp; 
			} 	
			else
			  i++; 
		} 	
	} 
    static void printArray(int A[])
    {
      System.out.print("Modified array: "); 
	  for (int i=0; i < A.length; i++) 
	  { 
	  System.out.print(A[i] + " ");
	  }	
    }
	public static void main (String[] args) 
	{ 
		int P[] = {3,9,12,13,8,4,5,2,7}; 	
		threeWayPartition(P,6,10); 
        printArray(P); 
	} 
} 

