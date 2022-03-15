public class ArrayReverse
{
    public void reverseArray(int a[])
    {
        int n=a.length-1;
        for(int i=0;i<a.length/2;i++,n--)
        {
            int temp=a[i];
            a[i]=a[n];
            a[n]=temp;
        }
    }
    public static void main(String args[])
    {
       int p[]={11,22,3,4,52,10,19,32,44};
       ArrayReverse A=new ArrayReverse();
       A.reverseArray(p);
       for(int i=0;i<p.length;i++)
       {
           System.out.print(" "+p[i]);
       }
    }
}