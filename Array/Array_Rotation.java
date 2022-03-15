//Program to Rotate the Array Cyclically.
public class Array_Rotation
{
    static void Rotate(int a[])
    { 
      int last=a[a.length-1];
      for(int i=a.length-1;i>0;i--)
       {
         a[i]=a[i-1];
       }
      a[0]=last;
    }
    static void moveByK(int a[],int k)
    {
      for(int i=0;i<k;i++){
        move(a);
      }
    }
    static void move(int a[])
    {
      int last=a[a.length-1];
      for(int i=a.length-1;i>0;i--)
       {
         a[i]=a[i-1];
       }
      a[0]=last;       
    }
    public static void main(String args [])
    {
     int P[]={3,4,5,6,7};
     Rotate(P);
     for(int i:P){
       System.out.print(" "+i);
     }
     System.out.print("\n");
     moveByK(P,2);
     for(int i:P){
       System.out.print(" "+i);
     }
    }
}