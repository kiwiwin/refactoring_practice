public class Engineer extends EmployeeType {
    @Override
    public int getType() {
        return Employee.ENGINEER;
    }

    @Override
    public int payAmount(Employee employee) {
        return employee.getMonthlySalary();
    }
}
