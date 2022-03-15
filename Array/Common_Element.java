public class Common_Element
{
	static void findCommon(int ar1[], int ar2[], int ar3[])
	{
		int i = 0, j = 0, k = 0;
		while (i < ar1.length && j < ar2.length && k < ar3.length)
		{
			if (ar1[i] == ar2[j] && ar2[j] == ar3[k])
			{ 
				System.out.print(ar1[i]+" "); 
				i++; 
				j++; 
				k++; 
			}
			else if (ar1[i] < ar2[j])
				i++;
			else if (ar2[j] < ar3[k])
				j++;
			else
				k++;
		}
	}
	public static void main(String args[])
	{
		int ar1[] = {3, 4, 15, 20, 30, 70, 80, 120};
		int ar2[] = {6, 7, 20, 80, 100,140,150};
		int ar3[] = {1, 5, 20, 80};
		System.out.print("Common Elements:  ");
		findCommon(ar1, ar2, ar3);
	}
}