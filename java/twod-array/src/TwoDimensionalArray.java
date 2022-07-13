
public class TwoDimensionalArray {

    public static void main(String[] args) {
        TwoDimensionalArray.printSumArr();
    }

    public static void printSumArr() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int myArray[][] = new int[5][5];
        int initialVal, sum = 0;
        System.out.print("What number do you want to use for initialization: ");
        initialVal = in.nextInt();

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                myArray[i][j] = initialVal;
            }
        }

        System.out.println("The initial values of an array: ");

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                System.out.print("\t[" + i + "][" + j + "] = " + initialVal);
            }
            System.out.println();
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                sum += myArray[i][j];
            }
        }
        System.out.println("\nThe sum is: " + sum);
    }
}
