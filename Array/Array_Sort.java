public class Array_Sort
{
    public void sort(int a[])
    { 
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String args [])
    {
     int P[]={0,2,1,2,0,1,2,0,1,2,0};
     Array_Sort A=new Array_Sort();
     A.sort(P);
     for(int i=0;i<P.length;i++)
     {
      System.out.print(" "+P[i]);
     }
    }
}