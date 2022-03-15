//Program to find the fixed point in the Array.
//A={1,2,3,9,7,5,8} 5 is At fixed point i.e 5th index.
//T-O(n) S-O(1);
public class Fixed_Point_Array
{
    static int findFixPoint(int a[])
    {
       for(int i=0;i<a.length;i++)
       {
            if(a[i]==i)
            {
              return i;
            }
        }
        return -1;
    }
    public static void main(String args [])
    {
     int A[]={9,4,11,5,4,5,13,4,1,4,2};
     System.out.println("Fixed Point:"+findFixPoint(A));
    }
} 
//this code is contribute by abhishek borse.