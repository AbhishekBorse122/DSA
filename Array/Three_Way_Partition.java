 public class Three_Way_Partition
{
    public static void threeWayPartition(int[] arr, int low, int high)
    {        
        int  n = arr.length;
        int start = 0, end = n-1;
        for(int i = 0; i <= end;)
        {
            if(arr[i] < low){        // 1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}        
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;    
            }
            else if(arr[i] > high){                 
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;     
            }
            else
               i++;
        }
    }
    public static void main (String[] args)
    {
        int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};    
        threeWayPartition(arr, 14, 20);
        System.out.println("Modified array ");
        for (int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");    
        }   
    }
}