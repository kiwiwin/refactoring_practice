public class Salesman extends EmployeeType {
    @Override
    public int getType() {
        return Employee.SALESMAN;
    }

    @Override
    public int payAmount(Employee employee) {
        return employee.getMonthlySalary() + 10;
    }
}
