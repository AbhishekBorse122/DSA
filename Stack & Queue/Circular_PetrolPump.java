//Program to find the the Starting Petrol Pump from Where our Tour is Starting.
//T-O(n) S-O(1)
public class Circular_PetrolPump
{  
    static class PetrolPump
    {
      int Petrol;
      int Distance;
      PetrolPump(int P,int D)
      {
        Petrol=P;
        Distance=D;
      }
    }  
    static int printTour(PetrolPump P[],int n)
    {
        int start=0;
        int end=1;
        int curr_petrol=P[start].Petrol-P[start].Distance;
        while(end!=start || curr_petrol < 0)
        {
            while(curr_petrol<0 && start!=end)
            {
                curr_petrol-=P[start].Petrol-P[start].Distance;
                start=(start+1)%n;
                if(start==0)
                {
                    return -1;
                }
            }
            curr_petrol +=P[end].Petrol-P[end].Distance;
            end=(end+1)%n;
        }
        return start;
    }
    public static void main(String args [])
    {
     PetrolPump Q[]={new PetrolPump(4,4),
                     new PetrolPump(5,6),
                     new PetrolPump(7,3),
                     new PetrolPump(4,5)};
     System.out.println("Start PetrolPump: "+printTour(Q,Q.length));
    }
}