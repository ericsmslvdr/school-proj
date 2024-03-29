
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        /**
         * cube of number
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Input number of terms: ");
        int terms = input.nextInt();

        for (int i = 1; i <= terms; i++) {
            System.out.println("Number is : " + i + " and cube of " + i + " is :" + (i * i * i));
        }
        //3^3=27
    }
}
