import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Large_Even
{
    static int largeEvenNum(String S)
    {
      char c[]=S.toCharArray();
      boolean flag=false;
      ArrayList<Character>A=new ArrayList<>();
      for(char i:c){
          if(Character.isDigit(i) && !A.contains(i)){
              A.add(i);
              if(Character.getNumericValue(i)%2==0) flag=true; 
          }
      }
      if(!flag) {return -1;}
      Collections.sort(A);
      char temp='0';
      for(int i=0;i<A.size();i++)
      {
          if(Character.getNumericValue(A.get(i))%2==0){
              temp=A.get(i);
              A.remove(i);
              break;
          }
      }
      String ans="";
      for(int i=A.size()-1;i>=0;i--)
      {
        ans+=A.get(i);
      }
      ans+=temp;
      
      return Integer.parseInt(ans); 
    }
    public static void main (String[] args) 
    {
   
     Scanner S=new Scanner(System.in);
     System.out.println("Enter the String: ");
     String input=S.nextLine();
     System.out.println(largeEvenNum(input));
    }
}