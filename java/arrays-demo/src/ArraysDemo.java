
public class ArraysDemo {

    public static void main(String[] args) {
        //    one();
        //    two();
        //    three();
        four();
        //    five();
    }

    public static void one() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int press;
        do {
            int i = 0;
            int[] myArray = new int[5];
            System.out.print("\nWhat numbers do you want to use for initialization? ");
            myArray[i] = in.nextInt();
            System.out.println("The initial values of an array: ");

            for (int n = 0; n < myArray.length; n++) {
                System.out.println("myArray[" + n + "] = " + myArray[i]);
            }
            System.out.print("Do you want to try again? press 0 to exit or any number to continue: ");
            press = in.nextInt();
        } while (press >= 1);

    }

    public static void two() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int press = 0;

        do {
            System.out.println("\nThe initial values of an array: ");

            int[] myArray = new int[5];

            int rAndom = (int) (Math.random() * myArray.length);

            for (int i = 0; i < myArray.length; i++) {
                System.out.println("myArray[" + i + "] = " + rAndom);
            }

            System.out.print("Do you want to try again? press 0 to exit or any number to continue: ");
            press = in.nextInt();
        } while (press >= 1);

    }

    public static void three() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int press;

        do {
            int sum = 0;
            System.out.print("\nEnter 5 values and put a space in each value: ");

            int[] myArray = new int[5];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = in.nextInt();
                sum = sum + myArray[i];
            }
            System.out.println("The sum of arrays values is: " + sum);

            System.out.print("Do you want to try again? press 0 to exit or any number to continue: ");
            press = in.nextInt();
            sum = 0;
        } while (press >= 1);

    }

    public static void four() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int press;
        int largest, largestValue = 1;

        do {
            int sum = 0;
            System.out.print("\nEnter 5 values and put a space in each value: ");

            int[] myArray = new int[5];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = in.nextInt();
            }

            largest = myArray[0];

            for (int i = 0; i < myArray.length; i++) {
                if (largest < myArray[i]) {
                    largest = myArray[i];
                    largestValue = i + 1;
                }

            }

            System.out.println("The largest value is found at element: " + largestValue);

            System.out.print("Do you want to try again? press 0 to exit or any number to continue: ");
            press = in.nextInt();
        } while (press >= 1);

    }

    public static void five() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int press;
        int largest, largestValue = 0;

        do {
            int sum = 0;
            System.out.print("\nEnter 5 values and put a space in each value: ");

            int[] myArray = new int[5];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = in.nextInt();

            }

            largest = myArray[0];

            for (int i = 0; i < myArray.length; i++) {
                if (largest < myArray[i]) {
                    largest = myArray[i];
                    largestValue = i;
                }

            }

            System.out.println("The largest value is found at index: " + largestValue);

            System.out.print("Do you want to try again? press 0 to exit or any number to continue: ");
            press = in.nextInt();
        } while (press >= 1);

    }
}
