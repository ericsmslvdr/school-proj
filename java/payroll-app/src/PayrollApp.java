import java.util.Scanner;

public class PayrollApp {
    public static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String empName = input.nextLine();

        System.out.print("Full Time [F] or Part Time [P]: ");
        String press = input.nextLine();

        switch (press.toUpperCase()) {
            case "F":
                PayrollApp.fullTime(empName);
                break;

            case "P":
                PayrollApp.partTime(empName);
                break;

            default:
                System.out.println("Enter F or P Only...");
                PayrollApp.main(args);
                break;
        }
    }

    public static void fullTime(String empName) {
        System.out.println("--Full Time Employee--");
        System.out.print("Enter Basic Pay: ");
        Double basicPay = input.nextDouble();

        PayrollApp.outputEmp(empName, basicPay);
    }

    public static void partTime(String empName) {
        System.out.println("--Part Time Employee--");
        System.out.print("Enter rate per hour: ");
        Double ratePerHour = input.nextDouble();
        System.out.print("Enter no. of hours worked: ");
        int hrsWorked = input.nextInt();
        System.out.print("Enter no. of overtime: ");
        Double overtime = input.nextDouble();

        Double overTimePay = (ratePerHour * 0.15) * overtime;
        Double basicPay = ratePerHour * hrsWorked;
        Double grossPay = basicPay + overTimePay;

        PayrollApp.outputEmp(empName, basicPay, overTimePay, grossPay);
    }

    public static void outputEmp(String empName, Double basicPay) {
        System.out.println("________________________");
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Pay: " + basicPay);

        System.out.println("________________________");
        System.out.println("Gross Pay: " + basicPay );
    }

    public static void outputEmp(String empName, Double basicPay, Double overTimePay, Double grossPay) {
        System.out.println("________________________");
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Pay: " + basicPay);

        System.out.println("Overtime Pay: " + overTimePay);

        System.out.println("________________________");
        System.out.println("Gross Pay: " + grossPay );
    }
}
