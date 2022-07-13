
import java.util.Scanner;

public class MainEmployee {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String unionName;
        int unionNum;
        int empType;
        int sub;

        System.out.print("Enter the employee name: ");
        String name = input.nextLine();

        System.out.print("Enter the total number of hours worked: ");
        int hours = input.nextInt();

        System.out.print("Salary rate (per hour): ");
        int salaryRate = input.nextInt();

        System.out.print("Enter employee job type\n[1]Full Time, [2]Part Time: ");
        empType = input.nextInt();
        switch (empType) {
            case 1:
                System.out.print("Enter the total number of subordinates: ");
                sub = input.nextInt();
                FullTime fte = new FullTime(name, salaryRate, hours, sub);
                System.out.println(fte);
                break;
            case 2:
                System.out.print("Is a union member?: [1]Yes | [2]No: ");
                unionNum = input.nextInt();
                PartTime pte = new PartTime(name, salaryRate, hours, unionNum);
                System.out.println(pte);
                break;
            default:
                System.out.println("Enter valid sytax!!!");
                throw new AssertionError();
        }
    }
}
