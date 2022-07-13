
public class PartTime extends Employee {

    private int computedPay;
    private boolean unionStatus;

    public PartTime(String name, int salaryRate, int hours, int unionNum) {
        super(name, salaryRate);
        this.computedPay = computeWeeklyPay(hours);
        this.unionStatus = checkUnionStatus(unionNum);
    }

    @Override
    public int computeWeeklyPay(int hours) {
        int salary = 0;
        salary = getSalaryRate() * hours;

        return salary;
    }

    public String getEmployeeSalaryInfo() {
        return "\nName of the Employee: "
                + getName()
                + "\nSalary: P"
                + computedPay
                + "\nUnion Member Status: "
                + unionStatus;
    }
    
    public boolean checkUnionStatus(int unionNum) {
        boolean isUnionMem = false;
        if (unionNum == 1) {
            isUnionMem = true;
        }
        return isUnionMem;
    }
}
