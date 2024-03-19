public class Employee
{
     String name;
    int emp_id;
    float Salary;
    // constructor to initialize the employee object    
    public Employee(String name,int emp_id, float Salary)
    {
        this.name=name;
        this.emp_id=emp_id;
        this.Salary = Salary;
}
// method to display details of an employee 

public void showDetails()
{
  System.out.println("Name:" + name);
  System.out.println("Employee ID :" + emp_id);  
  System.out.println("Salary :" + Salary);

}
public class Emp
{
    public static void main(String args[]) throws java.lang.Exception
    {
       //* Create two objects of 'Employee' class       
        //* and call the function showDetails() 
        Employee e1 = new Employee ("Akshata", 2233, 5000);
        e1.showDetails();
    }

}
}