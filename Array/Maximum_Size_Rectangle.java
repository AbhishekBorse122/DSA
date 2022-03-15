//Program to Print the Row-Column wise Sorted 2D Array in Sorted Order.
//T-O(n^3) It is too high because it is recursive function.
import java.util.Stack;
public class Maximum_Size_Rectangle
{ 	
    static int maxHist(int a[],int R,int C)
    {
        Stack<Integer> R1=new Stack<>();
        int top,Max=0,area=0,i=0;
        while(i<C)
        { 
           if(R1.empty() || a[R1.peek()]<=a[i])
           {
            R1.push(i++);
           }
           else
           {
            top=a[R1.peek()];
            R1.pop();
            area=top*i;
            if(!R1.empty())
             {
                 area=top*(i-R1.peek()-1);
                 Max=Math.max(area,Max);
             }
           }
           while(!R1.empty())
           {
               top=a[R1.peek()];
               R1.pop();
               area=top*i;
               if(!R1.empty())
               {
                 area=top*(i-R1.peek()-1);
                 Max=Math.max(area,Max);
               }
           }
         }
        return Max;
     }
	static int maxRectangle(int a[][],int R,int C) //T-O(n)
	{
	  int result=maxHist(a[0],R,C);
      for(int i=1;i<R;i++)  
      {
        for(int j=0;j<C;j++)  
        {
            if(a[i][j]==1)
              a[i][j]+=a[i-1][j];
        }
        result=Math.max(result,maxHist(a[i],R,C));
      }
      return result;
    } 
	public static void main (String[] args) 
	{ 
		int P[][]={{0,1,1,0}, 	
                   {1,1,1,1},
                   {1,1,1,1},
                   {1,1,0,0}};
        int R=4,C=4;
       System.out.println("Area of Maximum Size Rectangle: "+maxRectangle(P,R,C));
  } 
} 

