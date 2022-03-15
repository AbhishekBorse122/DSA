// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. 
// A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
// Return in any order.
//

import java.util.*;
public class Phone_Keypad
{	
    static List<String> A=new ArrayList<>();
    static void solve(String digits,int index,String out,String map[]){
     if(index>=digits.length()){
        A.add(out); 
        return ; 
     }   
     int num=digits.charAt(index)-'0';
     String val=map[num];   
     for(int i=0;i<val.length();i++){
         out+=val.charAt(i);
         System.out.println("out: "+out);
         solve(digits,index+1,out,map);
         out=out.substring(0,out.length()-1);
     }   
    }
    public static List<String> letterCombinations(String digits) 
    {
     String map[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};  
     int index=0;   
     String out="";   
     solve(digits,index,out,map);   
     return A;
    }
    public static void main(String args[])
    {
      String A="23"; 
      System.out.println(letterCombinations(A));
    }
}