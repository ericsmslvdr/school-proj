
import java.util.Scanner;

public class ScientificCalculatorDemo extends ScientificCalculator implements Calculator {

    public int firstNum, secondNum, power, num;

    @Override
    public void addition() {
        int a = 4;
        int b = 2;
        int c = a + b;
        System.out.println("The sum of two numbers is: " + c);
    }

    @Override
    public void subtraction() {
        int a = 4;
        int b = 2;
        int c = a - b;
        System.out.println("The difference of two numbers is: " + c);
    }

    @Override
    public void multiplication() {
        int a = 4;
        int b = 2;
        int c = a * b;
        System.out.println("The product of two numbers is: " + c);
    }

    @Override
    public void division() {
        int a = 4;
        int b = 2;
        int c = a / b;
        System.out.println("The quotient of two numbers is: " + c);
    }

    @Override
    public void raisedTo(int n, int m) {
        this.power = m;
        this.num = n;
    }

    public int getRaisedTo() {
        int prod = 1;
        for (int i = 1; i <= power; i++) {
            prod *= num;
        }
        return prod;
    }

    @Override
    public void addition(int x, int y) {
        this.firstNum = x;
        this.secondNum = y;

    }

    public int getSum() {
        return firstNum + secondNum;
    }

    @Override
    public void subtraction(int x, int y) {
        this.firstNum = x;
        this.secondNum = y;

    }

    public int getDifference() {
        return firstNum - secondNum;
    }

    @Override
    public void multiplication(int x, int y) {
        this.firstNum = x;
        this.secondNum = y;

    }

    public int getProduct() {
        return firstNum * secondNum;
    }

    @Override
    public void division(int x, int y) {
        this.firstNum = x;
        this.secondNum = y;
    }

    public int getQuotient() {
        return firstNum / secondNum;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ScientificCalculatorDemo scd = new ScientificCalculatorDemo();
        scd.addition();
        scd.subtraction();
        scd.multiplication();
        scd.division();

        System.out.print("\nFirst number: ");
        scd.firstNum = input.nextInt();
        System.out.print("Second number: ");
        scd.secondNum = input.nextInt();

        System.out.println(scd.firstNum + " plus " + scd.secondNum + " is equal to " + scd.getSum());
        System.out.println(scd.firstNum + " minus " + scd.secondNum + " is equal to " + scd.getDifference());
        System.out.println(scd.firstNum + " multiply by " + scd.secondNum + " is equal to " + scd.getProduct());
        System.out.println(scd.firstNum + " divided by " + scd.secondNum + " is equal to " + scd.getQuotient());

        System.out.print("\nEnter number: ");
        scd.num = input.nextInt();
        System.out.print("Raised to? : ");
        scd.power = input.nextInt();

        System.out.println(scd.num + " raised to " + scd.power + " is " + scd.getRaisedTo());
        //Salvador, Eric Samuel M  ITE101
        // :D
    }
}
