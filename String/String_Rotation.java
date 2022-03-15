import java.util.*;
public class String_Rotation
{
    static String roateString(String S)
    {
      String A[]=S.split(":");
      char text[]=A[0].toCharArray();
      char digits[]=A[1].toCharArray();
      int total=0;
      for(char c:digits){
        total+=(Character.getNumericValue(c)*Character.getNumericValue(c));
      }
      if(total%2==0){   
        char last=text[text.length-1];
        for(int i=text.length-1;i>0;i--){
            text[i]=text[i-1];
        }   
        text[0]=last;
      }
      else{
        char first=text[0];
        for(int i=0;i<text.length-2;i++){
            text[i]=text[i+1];
        }   
        text[text.length-1]=first;
      }
      String Ans="";
      for(char c:text){
          Ans+=String.valueOf(c);
      }
      return Ans;
    }
    public static void main (String[] args) 
    {
     Scanner S=new Scanner(System.in);
     System.out.println("Enter the String: ");
     String input=S.next();
     System.out.println(roateString(input));    
     S.close();
    }
}