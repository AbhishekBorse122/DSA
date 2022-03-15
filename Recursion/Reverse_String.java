public class Reverse_String
{  
    static String str="";
    static String revString(String a,int s)
    {
     if(s==0){
       return str+a.charAt(0);
     }
     str+=a.charAt(s);
     return revString(a,s-1);
    }
    public static void main(String[] args)
    {
      String a="abhishek";
      System.out.println(revString(a,a.length()-1));
    }
}