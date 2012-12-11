import org.testng.annotations.*;

import static org.testng.Assert.*;

public class EmployeeTest {
    @Test
    public void should_return_30_for_engineer_pay_amount_whose_monthly_salary_is_30() {
        Employee employee = new Employee(Employee.ENGINEER);
        employee.setMonthlySalary(30);
        assertEquals(30, employee.payAmount());
    }

    @Test
    public void should_return_40_for_salesman_pay_amount_whose_monthly_salary_is_30() {
        Employee employee = new Employee(Employee.SALESMAN);
        employee.setMonthlySalary(30);
        assertEquals(40, employee.payAmount());
    }

    @Test
    public void should_return_60_for_manger_pay_amount_whose_monthly_salary_is_30() {
        Employee employee = new Employee(Employee.MANAGER);
        employee.setMonthlySalary(30);
        assertEquals(60, employee.payAmount());
    }
}
