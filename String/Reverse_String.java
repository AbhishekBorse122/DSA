public class Reverse_String
{
    public static void main(String args[])
    {
        String S="ABHISHEK";
        String S1="";
        for(int i=S.length()-1;i>=0;i--){
            S1+=S.charAt(i);
        }
        System.out.println(S1);
        char c[]=S.toCharArray();
        for(int i=c.length-1;i>=0;i--)
        {
            System.out.print(c[i]);
        }
    }
}