import java.util.*;
class KeyComparator implements Comparator<Key>
{
    public int compare(Key k1,Key k2)
    {
        if(k1.f<k2.f)
           return 1;
        else if(k1.f>k2.f)
           return -1;
        return 0;   
    }
}
class Key
{
    int f;
    char c;
    Key(int f,char c)
    {
     this.f=f;
     this.c=c;
    }
}
public class Rearrange_String
{
  static int Max=26;
  static void Rearrange(String S)
  {
     int n=S.length();
     int count[]=new int[Max];
     for(int i=0;i<n;i++)
     {
         count[S.charAt(i)-'a']++;
     }
     PriorityQueue<Key> P=new PriorityQueue<>(new KeyComparator());
     for(char c='a';c<='z';c++)
     {
         int val=c-'a';
         if(count[val]>0)
           P.add(new Key(count[val],c));
     }	
     S="";
     Key Prev=new Key(-1,'#');
     while(P.size()!=0)
     {
         Key k=P.peek();
         P.poll();
         S=S+k.c;
         if(Prev.f>0)
           P.add(Prev);
         (k.f)--;
         Prev=k;       
     }
     if(n!=S.length())
        System.out.println("Not Valid String");
     else
        System.out.println(S);
  }
	public static void main(String args[])
	{
		String S = "aaab";
		Rearrange(S);
	}
}
