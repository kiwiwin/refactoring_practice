public class Employee {
    private int monthlySalary;
    private int type;
    public static final int ENGINEER = 1;
    public static final int SALESMAN = 2;
    public static final int MANAGER = 3;

    public Employee(int type) {
        this.type = type;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int payAmount() {
        switch (type) {
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + 10;
            case MANAGER:
                return monthlySalary * 2;
        }
        throw new IllegalArgumentException();
    }
}