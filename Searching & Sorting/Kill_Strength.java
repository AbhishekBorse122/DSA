//Program to find the Number of People Kills.
//if there n people in row the 1st person has 1*1 strength,2nd has 2*2 strength and your total stregth be n.You can kill the people only when 
//when your(stregth) >= person(strength) and your strength will always decrease by the strength of people you kill.
import java.util.Arrays;
public class Kill_Strength
{
    static void findKills(int a)
    {
      int power=a,count=0;
      for(int i=1;i<a;i++)
      {
          if(power>=i*i)
          {
              power-=i*i;
              count++;
              continue;
          }
          break;
      } 
      System.out.println("No of Soldier Kill: "+count);
    }
    public static void main(String args[])
    {
       int P=58;
       findKills(P);
    }
}    