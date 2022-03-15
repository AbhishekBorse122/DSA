import java.util.*;
import java.lang.String;
public class Array_List
{
    public static void main(String [] args)
    {
       new Array_List().run();
    }
    public void run()
    {
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(4,5,64,5,6,89));
        System.out.println(A);
        A.remove(A.indexOf(89));// remove by index
        System.out.println(A);
        A.remove(4);//remove by object 
        System.out.println(A);
        A.size();
        System.out.println(A);
        ArrayList<String> B=new ArrayList<>(Arrays.asList("a","h","m","j"));
        System.out.println(B.get(1));
    }    
}