
import java.util.Scanner;

public class CalculatorInterfaceDemo implements Calculator {

    public static int x = 0, y = 0;

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
    public void addition(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getSum() {
        return x + y;
    }

    @Override
    public void subtraction(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getDifference() {
        return x - y;
    }

    @Override
    public void multiplication(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getProduct() {
        return x * y;
    }

    @Override
    public void division(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getQuotient() {
        return x / y;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        CalculatorInterfaceDemo cid = new CalculatorInterfaceDemo();
        cid.addition();
        cid.subtraction();
        cid.multiplication();
        cid.division();

        System.out.print("First number: ");
        cid.x = input.nextInt();
        System.out.print("Second number: ");
        cid.y = input.nextInt();

        System.out.println(cid.x + " plus " + cid.y + " is equal to " + cid.getSum());
        System.out.println(cid.x + " minus " + cid.y + " is equal to " + cid.getDifference());
        System.out.println(cid.x + " multiply by " + cid.y + " is equal to " + cid.getProduct());
        System.out.println(cid.x + " divided by " + cid.y + " is equal to " + cid.getQuotient());
    }

}
