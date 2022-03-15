//Program to print the 2D array element Spirally.
//It is Most efficient approach to traverse the 2D Array.
//T-O(m*n) & S-O(1) m-row n-column
public class Spiral_Traversal
{ 	
	static void spiralTraverse(int a[][],int m,int n) 
	{ 
      int row=0,col=0;
      while(row<m && col<n)
      {
          for(int i=col;i<n;i++)
          {
              System.out.print(a[col][i]+" ");
          }
          row++;
          for(int i=row;i<m;i++)
          {
              System.out.print(a[i][n-1]+" ");
          }
          n--;
          if(row<m)
          {
            for(int i=n-1;i>=col;i--)
            {
              System.out.print(a[m-1][i]+" ");
            }
            m--;
          }
          if(col<n)
          {
            for(int i=m-1;i>=row;i--)
            {
              System.out.print(a[i][col]+" ");
            }
            col++;
          }
      }
    } 
  static void spiralTraverse2(int a[][]){
   int T=0,B=a.length-1;    // just create the 4 ptr two for row i.e top=1st_row & down=last_row && for col i.e L=1st_col & R=last_col
   int L=0,R=a[0].length-1;  
   int dir=0; 
   while(T<=B && L<=R)
   { 
     if(dir==0){                           //  dir==0 traverse from Left to Right by keeping top_row same
       for(int i=L;i<=R;i++)
          System.out.print(a[T][i]+" ");
       T++;
     }else if(dir==1){                     //  dir==1 traverse from top to down by keeping rigth_column same  
       for(int i=T;i<=B;i++)
          System.out.print(a[i][R]+" ");
       R--;
     }else if(dir==2){                     //  dir==2 traverse from Right to Left by keeping down_row same
       for(int i=R;i>=L;i--)
          System.out.print(a[B][i]+" ");
       B--;
     }else if(dir==3){                     //  dir==3 traverse from Down to top by keeping left_row same
       for(int i=B;i>=T;i--)
          System.out.print(a[i][L]+" ");
       L++; 
     }
     dir=(dir+1)%4;                       // only one will execute at once then again value of dir will increase
   }
  }
	public static void main (String[] args) 
	{ 
		int P[][] = {{32,14,15,42}, 	
                 {51,11,23,81},
                 {48,13,56,36},
                 {81,34,71,96}};
    spiralTraverse(P,4,4);
    System.out.println();
    spiralTraverse2(P);
	} 
} 

