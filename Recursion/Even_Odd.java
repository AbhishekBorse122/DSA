// Find the Even numbeR till the n.
import java.util.*;
public class Even_Odd
{	
    public static void evenNum(int L,int R)
    {
      if(L>R){
          return;
      }
      if(R%2==0){
        evenNum(L,R-2);
      }else {
          evenNum(L,R-1);
      }   
      if(R%2==0){
       System.out.print(R+" ");
      }
    }
    public static void oddNum(int L,int R)
    {
      if(L>R){
          return;
      }
      if(R%2==1) {
        oddNum(L,R-2);
      }else{ 
        oddNum(L,R-1);
      }   
      if(R%2==1){
       System.out.print(R+" ");
      }
    }
    public static void main(String args[])
    {
     evenNum(10,25);
     System.out.println("");
     oddNum(10,25);
    }
}