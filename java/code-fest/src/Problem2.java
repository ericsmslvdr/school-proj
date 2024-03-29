
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        /**
         * print sum of the digits
         */
        Scanner input = new Scanner(System.in);
        int sum = 0, xyz;
        System.out.print("Input an integer: ");
        int integer = input.nextInt();

        while (integer > 0) {
            xyz = integer % 10;
            sum = sum + xyz;
            integer = integer / 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
