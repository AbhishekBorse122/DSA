//Program to find the Number of customer who could not get a Computer
public class Computer_Customer
{
    static int Max=26;//This is best method if we are Using the Sequence of alphabet.
    static void findCustomer(int n,String A)
    {
      char[] Seen=new char[Max];
      char[] S=A.toCharArray();
      int count=0;
      int occupied=0;
      for(int i=0;i<S.length;i++)
      {
         int ind=S[i]-'A';//Here We are maintain the Simple Array of Characters.
         if(Seen[ind]==0)
         {
             Seen[ind]=1;
             if(occupied<n)
             {
                 occupied++;
                 Seen[ind]=2;
             }
             else
             {
                 count++;
             }
         }
         else
         {
           if(Seen[ind]==2)
           {
               occupied--;
           }
           Seen[ind]=0;
         }
      }
      System.out.println("Customers Who not get the Computers: "+count);
    }
    public static void main(String args [])
    {
      findCustomer(2,"ABBAJJKZKZ");
      findCustomer(3,"GACCBDBDAGEE");
      findCustomer(1,"ABCBCA");
      findCustomer(1,"ABCBCADEED");
    }
} 
