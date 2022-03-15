public class Product_SubArray 
{
	static void product(int a[],int n)
	{
		int start=0,end=0,s=0;
        int Product=Integer.MIN_VALUE,max_here=1;
        for(int i=0;i<n;i++)
        {
            max_here=max_here*a[i];
            if(Product<max_here)
            {
                Product=max_here;
                start=s;
                end=i;
            }
            if(max_here<0)
            {
                max_here=1;
                s=i+1;
            }
        }
        System.out.println("Max Product:"+Product);
        System.out.println("Index:"+start+" to "+end);        	
    }
	public static void main(String args[])
	{
        int a[]={-2,4,4,2,4,-5,6,8};
		product(a,a.length);
	}
}
