
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        /**
         * sum of two binary numbers
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String firstNum = input.next();
        System.out.print("Input second binary number: ");
        String secondNum = input.next();

        int a = Integer.parseInt(firstNum, 2);
        int b = Integer.parseInt(secondNum, 2);
        int c = a + b;

        System.out.println("Sum of two binary numbers:" + Integer.toBinaryString(c));
    }
}
