//Program to find the Celebrity in the Party.
//T-O(n) S-O(1)
//Two Pointers Approch
public class Celebrity_Problem
{
    static int Matrix[][]={{0,1,0,0},
                           {0,0,0,0},       
                           {0,1,0,0},        
                           {0,1,0,0}};
    public static boolean knows(int a,int b)
    {
      boolean r=(Matrix[a][b]==1?true:false);    
      return r;
    }          
    public static int findCelebrity(int n)
    {
        int a=0,b=n-1;
        while(a<b)
        {
            if(knows(a,b))
             {
               a++;
             }
            else
             {
                 b--;
             } 
        }
        for(int i=0;i<n;i++)
        {
            if(i!=a && (knows(a,i) || !knows(i,a)))
            { return -1;}
        }
        return a;
    }  
    public static void main (String [] args)
    {
     int R=findCelebrity(4);
     if(R==-1)
      {
          System.out.println("Celebrity is Not in the Party");
      }
     else
      {
          System.out.println("Celebrity ID: "+R);
      }
    }           
}