
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many values you want? ");
        int num = input.nextInt();
        
        int elements[] = new int[num];
        System.out.println("Enter " + num + " values: ");
        for (int i = 0; i < elements.length; i++) {
            elements[i] = input.nextInt();
        }
        
        System.out.print("Enter the element you want to search: ");
        int data = input.nextInt();
        
        int pos = 0, check = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == data) {
                pos = i + 1;
                check = elements[i];
                System.out.println(data + " Found! at position: " + pos);
            }
        }
        if (check != data) {
            System.out.println(data + " not found!");
        }
    }
}
