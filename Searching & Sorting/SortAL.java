//Sorted By comparator Method.There is an Compartor Interface in the java.util package.
import java.lang.String;
import java.util.*;
class Shop
{
    public int prodId,prodPrice;
    public String prodName;
    public void setData()
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the Product Name:  ");
        prodName=S.nextLine();        
        System.out.println("Enter the Product ID:  ");
        prodId=S.nextInt();
        System.out.println("Enter the Product Price:  ");
        prodPrice=S.nextInt();
    }
     public void getData()
    {
        System.out.println("Name: "+prodName);
        System.out.println("ID: "+prodId);
        System.out.println("Price: "+prodPrice);
    }
}
class Comparison implements Comparator<Shop>
{
    public int compare(Shop S1,Shop S2)
    {
        if(S1.prodPrice==S2.prodPrice)
          {
              return 0;
          }
        else if(S1.prodPrice > S2.prodPrice)
         {
             return 1 ;
         }
        else 
         {
             return -1 ;
         }
    }
}
public class SortAL
{
    public static void main(String args [])
    {
     Shop S=new Shop();
     Shop S1=new Shop();
     Shop S2=new Shop();
     ArrayList<Shop> A=new ArrayList<>();
     Iterator I=A.iterator();
     A.add(S);
     A.add(S1);
     A.add(S2);
     for(Shop s:A)
     {
       s.setData();
     }
     Collections.sort(A,new Comparison());
     System.out.println("****Sort The Product On Basis of There Price****");
    for(Shop s:A)
     {
       s.getData();
     }
    }
}