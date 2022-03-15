import java.lang.String;
import java.util.*;
import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;
class Student
{
    public String name;
    public double cgpa;
    public Student(String name,double cgpa)
    {
        this.name=name;
        this.cgpa=cgpa;
    }
    public String getName()
    {
     return name;
    }
}
class StudentComparator implements Comparator<Student>
{
    public int compare(Student S1,Student S2)
    {
        if(S1.cgpa<S2.cgpa)
        {
            return 1;
        }
        else if(S1.cgpa>S2.cgpa)
         {
             return -1;
         }
        else
         {
             return 1;
         }
    }
}
public class PriorityQueue1
{ 
    public static void main(String args [])
    {
    PriorityQueue<Student> P=new PriorityQueue<>(5,new StudentComparator());
    Student S1=new Student("Abhishek",9.12);
    Student S2=new Student("Armaan",8.81);
    Student S3=new Student("Adesh",8.19);
    Student S4=new Student("Anjaan",7.15);
    Student S5=new Student("Prat",9.60);
    P.add(S1);
    P.add(S2);
    P.add(S3);
    P.add(S4);
    P.add(S5);
    while(!P.isEmpty())
      {
       System.out.println(P.poll().getName());
      }
    }
} 