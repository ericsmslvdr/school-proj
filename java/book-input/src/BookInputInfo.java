
import java.util.Scanner;

public class BookInputInfo extends Book1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book1 bkInput = new Book1();

        System.out.print("Enter the book title: ");
        String title = input.nextLine();
        bkInput.setTitle(title);

        System.out.print("Enter the book's author: ");
        String author = input.nextLine();
        bkInput.setAuthor(author);

        System.out.print("Enter the total number of pages: ");
        int num = input.nextInt();
        bkInput.setTotalPages(num);

        System.out.println("\nThe book title is:  " + bkInput.getTitle());
        System.out.println("The book's author is: " + bkInput.getAuthor());
        System.out.println("The total number of pages: " + bkInput.getTotalPages());
    }
}
