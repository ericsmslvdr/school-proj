
public class perfectnum {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int array[] = new int[3];

        System.out.print("Enter 3 numbers separated by a space: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        
        int num1, num2, num3;
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int ilanba1 = 0, ilanba2 = 0, ilanba3 = 0;
        num1 = array[0];
        num2 = array[1];
        num3 = array[2];
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sum1 += i;
                if (sum1 == num1) {
                    ilanba1 += 1;
                }
            }
        }
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                sum2 += i;
                if (sum2 == num2) {
                    ilanba2 += 1;
                }
            }
        }
        for (int i = 1; i < num3; i++) {
            if (num3 % i == 0) {
                sum3 += i;
                if (sum3 == num3) {
                    ilanba3 += 1;
                }
            }
        }
        int ilanbafinal = ilanba1 + ilanba2 + ilanba3;
        System.out.println("There are " + ilanbafinal + " perfect number in an array");
    }
}
