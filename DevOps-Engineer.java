
class DevOpsEngineer extends Employee{
    float bonus;

    public DevOpsEngineer(String name, int EmpId, float Salary, float bonus) {
        super(name, EmpId, Salary);
        this.bonus = bonus;
    }

    public double CalculateTotalSalary() {
        return (Salary + bonus);
    }
    @Override
    public void showDetails() 
    {
        
       System.out.println("Bonus"+ bonus);
       System.out.println("Employee Total Salary: " + CalculateTotalSalary());
    }
}



