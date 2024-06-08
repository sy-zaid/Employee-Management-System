public class Employee {
    public String employee_name;
    public String job_title;
    private double salary;

    public Employee(String employee_name, String job_title, double salary) {
        this.employee_name = employee_name;
        this.job_title = job_title;
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double new_amount){
        double prev_salary = this.salary;
        this.salary = new_amount;
        System.out.println("Previous Salary was: "+prev_salary+" now updated to: "+this.salary);
    }
}
