// Program to find the Special String
// find special index=maxRepeatDigitCount-maxRepeatAlphabetCount
// remove the special index character from the String & filled the spaces with '$'
import java.util.*;
public class Special_String1 
{
    public static String findString(String S)
    {
      Map<Character,Integer> H=new HashMap<>();
      for(int i=0;i<S.length();i++){
        if(!H.containsKey(S.charAt(i))){
          H.put(S.charAt(i),1);
        }
        else{
          H.put(S.charAt(i),H.get(S.charAt(i))+1);        
        }
      }
      int maxChar=Integer.MIN_VALUE,maxDigit=Integer.MIN_VALUE;
      for(Map.Entry<Character,Integer> I:H.entrySet()){
        if(Character.isDigit(I.getKey())){
         maxDigit=Math.max(maxDigit,I.getValue());
        }else{
         maxChar=Math.max(maxChar,I.getValue());
        }  
      }
      char special=S.charAt(Math.abs(maxChar-maxDigit));
      S=S.replace(" ","$");
      String ans="";
      for(int i=0;i<S.length();i++){
        if(S.charAt(i)!=special){
          ans+=String.valueOf(S.charAt(i));
        }
      } 
      return ans;  
    }
    public static void main(String args[])
    {
    //  String S="999 aa 22aa";
     String S="Hi There";
     System.out.println(findString(S));
    }
}