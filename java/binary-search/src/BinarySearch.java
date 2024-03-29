
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        //for user input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        //declare the array
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values: ");
        //for entering n values
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the value you want to search: ");
        int val = in.nextInt();
        //initialize variables needed for cases 1,2,3
        int low = 0;
        int high = n - 1;
        int mid = 0;
        //get the middle number after adding left and right number then divide by constant number 2
        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == val) {//if mid is equal to data then execute case 1
                System.out.println("The value is found at index " + mid);
                break;
            } else if (arr[mid] > val) {//if mid is greater than the data then execute case 2
                high = mid - 1;
            } else if (arr[mid] < val) {//if mid is less than the data then executes case 3
                low = mid + 1;
            }
        }
        if (low > high) {//executes if data does not exist within the array
            System.out.println("The value is not found in an array.");
        }
    }

}
