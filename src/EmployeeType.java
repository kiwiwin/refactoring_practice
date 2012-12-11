public abstract class EmployeeType {
    public abstract int getType();
    public abstract int payAmount(Employee employee);

    public static EmployeeType create(int type) {
        switch (type) {
            case Employee.ENGINEER:
                return new Engineer();
            case Employee.SALESMAN:
                return new Salesman();
            case Employee.MANAGER:
                return new Manager();
        }
        throw new IllegalArgumentException();
    }
}
