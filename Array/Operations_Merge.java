//Minimum Operations required to make the array Palindrome
public class Operations_Merge
{ 	
	public static void countOperations(int a[]) 
	{ 
        int ans=0;
		for(int i=0,j=a.length-1;i<=j;) 
		{ 
			if(a[i]==a[j]) 
			{ 	
		    	i++;
                j--;
			} 
			else if(a[i]>a[j]) 
			{ 
				j--;
                a[j]+=a[j+1];
                ans++;
			} 	
			else
			{
                i++;
                a[i]+=a[i-1];
                ans++;
            }
        }
       System.out.println("Minimum Operations: "+ans);	
	} 
	public static void main (String[] args) 
	{ 
		int P[] = {3,4,1,5,2,3}; 	
        countOperations(P);
	} 
} 

