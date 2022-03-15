//It is a program to find the Trapping Water.(V.Imp)
//It is Efficient solution with O(n) time & space complexity
public class Trapping_Water
{
    static void findVolume(int a[])
    {
      int l[]=new int[a.length];
      int r[]=new int[a.length];
      int water=0;
      l[0]=a[0];
      for(int i=1;i<a.length;i++)//update the height bar on the left of every bar 
      {
        l[i]=Math.max(l[i-1],a[i]);
      }
      // for(int i:l){
      //   System.out.print(" "+i);
      // }
      r[a.length-1]=a[a.length-1];
      for(int i=a.length-2;i>=0;i--)//update the height bar on the right of every bar 
      {
        r[i]=Math.max(r[i+1],a[i]);
      }
      // System.out.println("\n");
      // for(int i:r){
      //   System.out.print(" "+i);
      // }
      for(int i=0;i<a.length;i++)
      {
          water+=Math.min(l[i],r[i])-a[i];
      }
      System.out.println("Water Volume: "+water);
    }
    public static void main(String args[])
    {
     int P[]={3,0,4,0,5,0,2};
     findVolume(P);
    }
}   