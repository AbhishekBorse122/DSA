import java.util.*;
public class RemoveDuplicate
{
    public static void main(String args[])
    {
     ArrayList<Integer> A1=new ArrayList<>(Arrays.asList(2,5,8,2,9,4,9));
     new RemoveDuplicate().rmvDuplicate(A1);
    }
    public void rmvDuplicate(ArrayList<Integer> A)
    {
      ArrayList<Integer> New=new ArrayList<>();
      for(Integer I1:A)
      {
          if(!New.contains(I1))
           {
               New.add(I1);
           } 
      }
      System.out.print("New List: ");
      for(Integer I2:New)
      {
          System.out.print("  "+I2);
      }
    }
}