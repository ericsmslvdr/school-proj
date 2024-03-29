
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0, oddnum = 0;//1 
        System.out.print("Input number of terms is: ");
        int terms = input.nextInt();

        System.out.println("The odd numbers are: ");
        for (int i = 1; i <= terms; i++) {
            oddnum = i * 2 - 1;
            sum = sum + oddnum;
            System.out.println(oddnum);
        }
        System.out.println("The Sum of odd Natural Number up to " + terms + " terms is: " + sum);

        /*
		int n = 0;
		while (n < terms) {
			if(oddnum %2 != 0) {
				System.out.println(oddnum);
				sum += oddnum;
				oddnum += 2;
			}
			n += 1;
		}
		System.out.println("The Sum of odd Natural Number up to "+terms+" terms is: " +sum);

		System.out.println("The odd numbers are: ");
		for (int i=0; i<terms; i++) {
			System.out.println(oddnum);
			oddnum += 2;
			if(oddnum%2!=0)
				sum+=oddnum-2;
		}
		System.out.println("The Sum of odd Natural Number up to "+terms+" terms is: " +sum);

		System.out.println("The odd numbers are: ");
		for (int i=1; i<=terms; i++) {
			System.out.println(oddnum);
			if(oddnum %2 != 0) {
				sum = sum + oddnum;
				oddnum +=2;
			}
		}
		System.out.println("The Sum of odd Natural Number up to "+terms+" terms is: " +sum);
         */
    }
}
