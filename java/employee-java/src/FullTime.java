
public class FullTime extends Employee {

    private int subordinates;
    private int computedPay;

    public FullTime(String name, int salaryRate, int hours, int sub) {
        super(name, salaryRate);
        this.computedPay = computeWeeklyPay(hours);
        this.subordinates = sub;
    }

    @Override
    public int computeWeeklyPay(int hours) {
        int extraHrs = 0;
        int salary = 0;
        if (hours > 40) {
            extraHrs = hours - 40;
            salary = (extraHrs + 40) * getSalaryRate();
        } else {
            salary = getSalaryRate() * 40;
        }
        return salary;
    }

    public String getEmployeeSalaryInfo() {
        return "\nName of the Employee: "
                + getName()
                + "\nSalary: P"
                + computedPay
                + "\nSubordinates: "
                + this.subordinates;
    }
}
