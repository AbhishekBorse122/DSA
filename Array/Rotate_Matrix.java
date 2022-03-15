// Program to Rotate the 2D array by 90 in clockwise direction.
// T-O(n) S-O(1) where n- n is a Side of array.
public class Rotate_Matrix
{ 	
   static final int N=4;
    static void rotateClockwise(int a[][],int N)
    {
     for(int i=0;i<N/2;i++) 
      {
        for(int j=i;j<N-i-1;j++)
        {
           int temp=a[i][j];
           a[i][j]=a[N-j-1][i];
           a[N-1-j][i]=a[N-1-i][N-1-j];
           a[N-1-i][N-1-j]=a[j][N-1-j];
           a[j][N-1-j]=temp;
        }
      } 
    }
	static void printMatrix(int a[][]) 
	{
        for(int i=0;i<N;i++)
        {
         for(int j=0;j<N;j++)
         {   
      	  System.out.print(" "+a[i][j]);
         }
         System.out.print("\n");
        }   
    } 
	public static void main (String[] args) 
	{ 
		int P[][]={{11,15,18,22}, 	
               {14,16,21,24},
               {17,19,30,31},
               {20,24,33,37}};
    rotateClockwise(P,N);
    printMatrix(P);
  } 
} 

