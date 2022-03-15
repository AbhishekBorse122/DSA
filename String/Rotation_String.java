//Program to find the String is rotation of another String.
//Logic behind this is if it is rotation then size of string must be same and the addition of string s1 with s1 is form a substring which is eqaul
//another string i.e s2 then indexOf function return index of substring if present if not present then it return -1.
public class Rotation_String 
{
    static boolean isRotation(String S1,String S2)
    {
      if(S1.length()==S2.length() && ((S1+S1).indexOf(S2)!=-1))
       {
        System.out.println("Strings are Roatation");
        
        return true;
       } 
      else
       {
         System.out.println("Strings are Not Roatation"); 
         return false;  
       }
    }
    public static void main(String args [])
    {
     String S1="abhishek";
     String S2="hekabhis";
     isRotation(S1,S2);
    }
}