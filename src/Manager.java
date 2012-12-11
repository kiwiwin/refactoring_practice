public class Manager extends EmployeeType {
    @Override
    public int getType() {
        return Employee.MANAGER;
    }

    @Override
    public int payAmount(Employee employee) {
        return employee.getMonthlySalary() * 2;
    }
}
