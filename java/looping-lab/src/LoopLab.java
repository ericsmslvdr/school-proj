import java.util.Scanner;

public class LoopLab {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        int sum = 0;
        int num = 0;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            sum = sum + i;
        }
        
        System.out.println("Sum is: " + sum);
    }
}
