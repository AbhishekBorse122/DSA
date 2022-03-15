import java.util.*;
import java.lang.String;
class Result {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    int l=arr.size();
    int a[]=new int[l];
    for(int i=l-1;i>=0;i--){
      if((i-d)<0){
        a[i-d+l]=arr.get(i);        
      }else{
      a[i-d]=arr.get(i);
      }
    }
    arr.clear();
    for(int i=0;i<l;i++){
      arr.add(i,a[i]);
    }
    return arr;
  }
}
public class Left_Rotate{
    public static void main(String args[]){
    Result R=new Result();
    List<Integer> A = new ArrayList<>();
    A.add(5);
    A.add(2);
    A.add(1);
    A.add(6);
    A.add(3);
    A.add(9);
    System.out.print("\nBefore:");
    System.out.print(A);
    R.rotateLeft(3,A);
    System.out.print("\nAfter: ");
    for(Integer I:A){
     System.out.print(" "+I);
   }
  } 
}
