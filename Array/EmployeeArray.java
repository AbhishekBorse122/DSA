import java.lang.String;
import java.util.*;
class Employee
{
    String name,designation;
    public void setEmployee()
    {
      Scanner S=new Scanner(System.in);
      System.out.println("Enter a Name: ");
      name=S.next();
      System.out.println("Enter a Designation: ");
      designation=S.next();
    }
    public String getName()
    {
    return name;
    }
    public String getDesignation()
    {
     return designation;
    }
}
public class EmployeeArray
{
    public static void main(String args [])
    {
     Employee E1=new Employee();
     Employee E2=new Employee();
     Employee E3=new Employee();
     Employee E4=new Employee();
     ArrayList<Employee> A=new ArrayList<>();
     A.add(E1);
     A.add(E2);
     A.add(E3);
     A.add(E4);
     A.add(E1);//We can pass same object reference in Same arraylist.
     for(Employee E:A)
     {
       E.setEmployee();
     }
    for(Employee E:A)
     {
       System.out.println(E.getName()+" is a "+E.getDesignation());
     }
    }
}