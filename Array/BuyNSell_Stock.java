// Program to find Max Profit in BuyNSell Stock.
import java.lang.*;
public class BuyNSell_Stock
{
    static void profitToBuySell(int a[]) 
    {
     int cost=0,Max=Integer.MIN_VALUE;
     int Min=a[0];
     for(int i=0;i<a.length;i++)
      {
        Min=Math.min(Min,a[i]);
        cost=a[i]-Min;
        Max=Math.max(Max,cost);
        // System.out.println("i: "+i+" Max: "+Max+" Min: "+Min+" Cost: "+cost);
      }
      System.out.println("Max Profit: "+Max);
    }
    public static void main(String args [])
    {
     int P[]={2,3,10,4,1,5,8};
     profitToBuySell(P);
    }
}