import java.util.*;
public class SubSet
{
    static boolean isSubSet(int a[],int b[])
    {
       ArrayList<Integer> A=new ArrayList<>();
       for(int i:a){
           A.add(i);
       }
       for(int i:b)
       {
           if(!A.contains(i)){
               System.out.println("It is Not SubArray");
               return false;
           }
       }
      System.out.println("It is SubArray");
      return true;
    }
    public static void main(String args[])
    {
     int P[]={2,4,5,6,3,7,8};
     int M[]={2,3};     
     System.out.println("Is SubSet: "+isSubSet(P,M));
    }
}    