//This program is to find the first_Repeated String in A Senetence.
import java.util.ArrayList;
import java.util.*;
public class Valid_IP_Address
{
    static ArrayList<String> list;
    static ArrayList<String> generateIP(String S)
    {
     int n=S.length();
     list=new ArrayList<>();
     if(n<4 || n>12)
       return list;
     int dp[][]=new int[4][n];  
     for(int i=0;i<S.length();i++)
     {
         for(int j=n-1;j>=0;j--)
         {
            if(i==0)
            { 
              String sub=S.substring(j);
              if(isValid(sub))
              {
                dp[i][j]=1;
              } 
              else if(j<n-3)
              {
                break;
              }
            }  
            else
            {
              if(j<n-i)
              {
                  for(int k=1;k<=3 && j+k<=n;k++)
                  {
                    String temp=S.substring(j,j+k);  
                      if(isValid(temp))
                      {
                          if(j+k<n && dp[i-1][j+k]==1)
                          {
                            dp[i][j]=1;
                            break;
                          }
                      }
                  }
              }
            }
         }
     }
     if(dp[3][0]==0)
       return list;
     createIP(dp,3,0,S,"");  
    }
    static void createIP(int dp[][],int r,int c,String s,String ans)
    {
        if(r==0)
        {
         ans+=s.substring(c);
         list.add(ans);
         return;
        }
        for(int i=1;i<=3 && c+i<s.length();i++)
        {
          if(isValid(s.substring(c,c+i)) && dp[i][r-1]==1)
          {
              createIP(dp,r-1,c+i,s,ans+s.substring(c,c+i)+".");
          }
        }
    }
    static boolean isValid(String ip)
    {
        String a[]=ip.split("[.]");
        for(String s:a)
        {
            int i=Integer.parseInt(s);
            if(s.length()>3 || i<0 || i>255)
            {
                return false;
            }
            if(s.length()>1 && i==0)
            {
                return false;
            }
            if(s.length()>1 && i!=0 && s.charAt(0)=='0')
            {
                return false;
            }
        }
    }
    public static void main(String args [])
    {
      String S="223445221147";
      System.out.println(generateIP(S));
    }
} 