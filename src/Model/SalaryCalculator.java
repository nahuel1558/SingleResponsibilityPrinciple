package Model;

public class SalaryCalculator {

    private Employee employee;
    private float hoursWorked;
    private float finalSalary;

    public SalaryCalculator(Employee employee, float hoursWorked, float finalSalary) {
        this.employee = employee;
        this.hoursWorked = hoursWorked;
        this.finalSalary = finalSalary;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getFinalSalary() {
        return finalSalary;
    }

    public void setFinalSalary(float finalSalary) {
        this.finalSalary = finalSalary;
    }

    public float calculateSalary() {
        return finalSalary = employee.getHourlySalary() * hoursWorked;
    }
}
