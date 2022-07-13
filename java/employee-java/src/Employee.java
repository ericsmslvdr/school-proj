
public abstract class Employee implements Salary{

    private String name;
    private int salaryRate;

    public Employee(String name, int salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public abstract int computeWeeklyPay(int hours);

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getSalaryRate() {
        return this.salaryRate;
    }

    @Override
    public String toString() {
        return getEmployeeSalaryInfo();
    }
}
