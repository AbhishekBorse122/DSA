public class Fibonacci
{
  static void printSeries(int n){
   int first=0,second=1;
   for(int i=0;i<n;i++){
     if(i==0){
         System.out.print('0'+" ");
     }else if(i==1){
         System.out.print('1');
     }else{
         int last=first+second;
         first=second;
         second=last;
         System.out.print(" "+last);
     }
   }
  } 
  public static void main(String args[])
  {  
    printSeries(8);
  }
}