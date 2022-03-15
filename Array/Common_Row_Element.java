//Program to find out the Common Element in the Row wise sorted 2D Array.
//This is Efficient Solution By the Hashing Technique.
//T-O(R*C) 
import java.util.HashMap;
import java.util.*;
public class Common_Row_Element
{
    static int R=4,C=4;
	static int findCommon(int a[][])
	{
		HashMap<Integer,Integer> H=new HashMap<>(); 
        for(int i=0;i<R;i++)
        {
            if(H.containsKey(a[i][0]))
            {
                H.put(a[i][0],H.get(a[i][0])+1);
            }
            else
            {
                H.put(a[i][0],1);
            }
            for(int j=1;j<C;j++)
            {
                if(a[i][j]!=a[i][j-1])
                {
                    if(H.containsKey(a[i][j]))
                    {
                        H.put(a[i][j],H.get(a[i][j])+1);
                    }
                    else
                    {
                        H.put(a[i][j],1);
                    }
                }
            }
        }
        for(Map.Entry<Integer,Integer> E:H.entrySet())
        {
            if(E.getValue()==R)
            {
                System.out.print("Common Element: ");
                return E.getKey();
            }
        }
         return -1;
 	}
	public static void main(String args[])
	{
		int P[][] ={{2,4,15,15},
                    {11,12,15,19},
		            {12,15,17,20}, 
                    {15,23,24,25}};
        System.out.println(findCommon(P));
	}
}
