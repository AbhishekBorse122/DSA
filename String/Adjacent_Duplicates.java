//This program is to Remove the Adjacent Duplicate Character from the String.
public class Adjacent_Duplicates
{
    static String removeDuplicate(String S,char lastRmv)
    {
         if(S.length()==0 || S.length()==1)
         {
             return S;
         }
         if(S.charAt(0)==S.charAt(1))
         {
             lastRmv=S.charAt(0);
             while(S.length()>1 && S.charAt(0)==S.charAt(1))
             {
                S=S.substring(1,S.length());
             }
             S=S.substring(1,S.length());
         return removeDuplicate(S,lastRmv);
         }
         String rmv_S=removeDuplicate(S.substring(1,S.length()),lastRmv);
         if(rmv_S.length()!=0 && rmv_S.charAt(0)==S.charAt(0))
         {
           lastRmv=S.charAt(0);
           return rmv_S.substring(1,rmv_S.length());
         }
         if(rmv_S.length()==0 && lastRmv==S.charAt(0))
         {
           return rmv_S;
         }
         return (S.charAt(0)+rmv_S);
    }
    static String Remove(String S)
    {
        char lastRmv='\0';
        return removeDuplicate(S,lastRmv);
    }
    public static void main(String args [])
    {
      String S="geeksforgeeg";
      System.out.println(Remove(S));
    }
} 
//This code is contribute by Abhishek Borse.