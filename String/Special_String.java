import java.util.*;
public class Special_String
{
    static String formString(String S)
    {
     String arr[]=new String[26];
     Arrays.fill(arr,"");
     for(int i=0;i<S.length();i++){
         char c=S.charAt(i);
         int ind=Character.toLowerCase(S.charAt(i))-'a';
         String temp=arr[ind];
         temp+=String.valueOf(c);
         arr[ind]=temp;
     }
     ArrayList<Character> C=new ArrayList<>();
     for(int i=0;i<arr.length;i++){
       if(arr[i]!=""){
         C.add(Character.toLowerCase(arr[i].charAt(0)));
       }
     }
     Collections.sort(C);
     ArrayList<String>A =new ArrayList<>();
     for(int i=0;i<C.size();i++){
          int ind=C.get(i)-'a';
          A.add(arr[ind]);
     }
     int i=0,j=A.size()-1;
     boolean flag=true;
     String ans="";
     while(i<=j){
       if(flag){
         ans+=A.get(i++);  
         flag=false;
       }
       else{
          ans+=A.get(j--); 
        flag=true;
       }
     }
     return ans;
    }
    public static void main (String[] args) 
    {
     Scanner S=new Scanner(System.in);
     System.out.println("Enter the String: ");
     String input=S.next();
     System.out.println(formString(input));    
     S.close();
    }
}