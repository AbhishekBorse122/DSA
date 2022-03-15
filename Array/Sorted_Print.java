//Program to Print the Row-Column wise Sorted 2D Array in Sorted Order.
//T-O(n^3) It is too high because it is recursive function.
public class Sorted_Print
{ 	
    static final int INF=Integer.MAX_VALUE;
    static final int R=4,C=3;
    static void youngify(int a[][],int i,int j)
    {
        int down=(i+1<R)? a[i+1][j]:INF;
        int right=(j+1<C)? a[i][j+1]:INF;
        if(down==INF && right==INF )
        {
          return;
        }
        if(down<right)
        {
          a[i][j]=down;
          a[i+1][j]=INF;
          youngify(a,i+1,j);
        }
        else
        {
          a[i][j]=right;
          a[i][j+1]=INF;
          youngify(a,i,j+1);
        }
    }
	static int extractMin(int a[][]) //T-O(n)
	{
	   int ret=a[0][0];
     a[0][0]=INF;
     youngify(a,0,0);
     return ret;
  } 
	public static void main (String[] args) 
	{ 
		int P[][]={{2,7,8}, 	
               {9,10,11},
               {15,18,20},
               {16,19,23}};
    for(int i=0;i<R*C;i++)   
    {        
     System.out.print("  "+extractMin(P));
    }
  } 
} 

