//Program to find the next term of the Sequence.
//There is one sequence start from 1,11,21,1211,111221
//It is form by let's 1st term is 1 then count it i.e one 1 so 2nd term will be 11 then count it i.e two 1 so 3rd thrm will be 21 like that
import java.util.*;
public class Count_Say
{
    static String count_Say(int n)
    {
      if(n==1) return "1";
      if(n==2) return "11";
      String S="11";
      for(int i=3;i<=n;i++)
      {
          S+='$';//it is use to seprate the each term .
          int l=S.length(),count=1;
          String temp="";
          char a[]=S.toCharArray();
          for(int j=1;j<l;j++)
          {
             if(a[j]!=a[j-1])
             {
                 temp+=count;
                 temp+=a[j-1];
                 count=1;
             }
             else
              count++;
          }
          S=temp;
       }
       return S;
    }
    public static void main(String args [])
    {
     Scanner S=new Scanner(System.in);
     System.out.print("Enter the Term: ");
     int N=S.nextInt();
     System.out.println(N+" Term: "+count_Say(N));
    }
}