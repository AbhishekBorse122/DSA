//Program to find the Row contain Maximum Number of 1.
//T-O(mlogn) & S-O(1); m-Row n-Column
public class Max1s
{ 	
    static int R=4,C=4;
    static int first(int a[],int l,int h)
    {
        if(h>=l)
        {
            int mid=l+(h-l)/2;
            if((mid==0 || (a[mid-1]==0)) && a[mid]==1)
            {
              return mid;
            }
            else if(a[mid]==0)
            {
                return first(a,mid+1,h);
            }
            else
            {
                return first(a,l,mid-1);
            }
        }
        return -1;
    }
	static int findMax1s(int a[][]) 
	{
	   int Row=0,Max=-1;
       int index;
       for(int i=0;i<R;i++)
       {
        index=first(a[i],0,C-1);
        if(index!=-1 && C-index>Max)
        {
            Max=C-index;
            Row=i;
        }
       }
       System.out.print("Row: ");
       return Row;
    } 
	public static void main (String[] args) 
	{ 
		int P[][]={{0,0,0,1}, 	
                   {1,1,1,1},
                   {0,0,1,1},
                   {0,1,1,1}};
        System.out.println(findMax1s(P));
	} 
} 

