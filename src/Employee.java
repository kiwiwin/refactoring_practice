public class Employee {
    private int monthlySalary;
    public static final int ENGINEER = 1;
    public static final int SALESMAN = 2;
    public static final int MANAGER = 3;
    private EmployeeType employeeType;

    public Employee(int type) {
        this.setType(type);
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int payAmount() {
        return employeeType.payAmount(this);
    }

    public int getType() {
        return employeeType.getType();
    }

    public void setType(int type) {
        employeeType = EmployeeType.create(type);
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }
}