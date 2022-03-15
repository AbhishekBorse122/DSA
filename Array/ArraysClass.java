import java.util.*;
public class ArraysClass
{
    public static void main(String args [])
    {
     int P[]={22,32,17,83,91,34,65,41};
     Arrays.sort(P);
     for(int i:P){
        System.out.print(" "+i);
     }
     System.out.println("\n"+Arrays.binarySearch(P,83));
     char c[]={'a','b','h','i'};
     String S=Arrays.toString(c);
     System.out.println(S);
    }
}