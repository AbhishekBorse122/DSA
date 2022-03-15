//Program to Find Minimum Jump required to reach the end of an Array.
//It would not Run if Negative and null Entries in the Array.
public class Min_Jump
{
    static void MinimumJump(int a[])
    {
     int count=0,jump=0;
     int l=a.length-1;
     while(count<=l)
     {
        if(a[count]<=0){
         System.out.println("Cannot Reach the End of Array");
         return;
        } 
        if(a[count]>0){
            if(a[count]+count<l){
             count+=a[count];
            }
            else{ 
             break;
            }   
            jump++;  
        }
     }
     jump++;
     System.out.println("Minimum Jumps: "+jump);
    }
    static int MinimumJump1(int a[])
    {
     int jump=0,count=a[0],n=a.length-1;
     while(count<n)
     {
         if(a[count]==0){
             return -1;
         }
         count+=a[count];
         jump++;
     }
     jump++;
     System.out.println("Minimum1 Jumps: "+jump);
     return jump;
    }
    public static void main(String args [])
    {
     int R[]={2,0,1,4,1,3,4,1,2,1};
     MinimumJump(R);
     MinimumJump1(R);
    }
}