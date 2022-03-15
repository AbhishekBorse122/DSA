//Program to search in array having every row last element is less than it's next row first element i.e sorted a.
//T-O(n^2) & S-O(1) 
public class Search_Matrix
{ 	
	static boolean searchElement(int a[][],int target) 
	{
    int i=0,j=a[0].length-1;  
    while(i<a.length && j>=0)
    {
     if(target==a[i][j]){
       System.out.println("Pos:"+i+"-"+j);
       return true;         
     }
     else if(target<a[i][j]){
         j--;
     } 
     else  i++;
    }
   return false;
  } 
	public static void main (String[] args) 
	{ 
		int P[][] = {{14,15,23,42}, 	
                 {51,67,73,78},
                 {80,94,96,98}};
    searchElement(P,94);
	} 
} 

