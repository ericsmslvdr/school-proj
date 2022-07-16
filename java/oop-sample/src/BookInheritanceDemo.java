
import java.util.Scanner;

public class BookInheritanceDemo {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String bookTitle, bookAuthor, bookCategory;
        int totalPages;

        System.out.print("Enter the book category: ");
        bookCategory = input.nextLine();
        System.out.print("Enter the title of the book: ");
        bookTitle = input.nextLine();
        System.out.print("Enter the author of the book: ");
        bookAuthor = input.nextLine();
        System.out.print("Enter the number of pages of the book: ");
//        input.nextLine();
        totalPages = input.nextInt();

        BookInheritance bi = new BookInheritance(bookAuthor, bookTitle, totalPages, bookCategory);
        System.out.println("\nThe category of the Book is " + bi.getCategory()
                + "\nThe title of the book is " + bi.getTitle()
                + "\nThe Author of the book is " + bi.getAuthor()
                + "\nThe total pages of the book is " + bi.getTotalPages());
    }
}
