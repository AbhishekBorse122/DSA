//Program to find the first and last position of element in the Array.
//T-O(n) S-O(1);
import java.util.Arrays;
public class First_Last_Position
{
    static void findPosition(int a[],int k)
    {
       int n=a.length;
       Arrays.sort(a);
       int count=0,start=0,end=0;
       for(int i=0;i<n;i++)
       {
            if(a[i]==k)
            {
              count++;
              if(count==1)
              {
                  start=i;
              }
            }
       }
       end=count+start-1;
       System.out.println("First Position: "+start+"\nLast Position: "+end);
    }
    public static void main(String args [])
    {
     int A[]={9,4,11,5,4,5,13,4,1,4,2};
     findPosition(A,4);
    }
} 
//this code is contribute by abhishek borse.