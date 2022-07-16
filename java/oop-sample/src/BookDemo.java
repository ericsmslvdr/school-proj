
public class BookDemo {

    public static void main(String args[]) {
        Book bk1 = new Book();
        Book bk2 = new Book("Eric Salvador", "Libro", 150);

        bk1.setAuthor("Salvador, Eric Samuel");
        bk1.setTitle("Fundamentals of Java Prog");
        bk1.setTotalPages(300);

        bk2.setAuthor("Eric Salvador");
        bk2.setTitle("OOP");
        bk2.setTotalPages(350);

        System.out.println("The book title is: " + bk1.getTitle()
                + "\nThe book author is: " + bk1.getAuthor()
                + "\nThe book total pages is: " + bk1.getTotalPages()
                + "\nThe maximum pages is: " + bk1.getMaximumPages());

        Book.MAXIMUM_PAGES=500;
        System.out.println("\nThe book title is: " + bk2.getTitle()
                + "\nThe book author is: " + bk2.getAuthor()
                + "\nThe book total pages is: " + bk2.getTotalPages()
                + "\nThe maximum pages is: " + bk2.getMaximumPages());

//        System.out.println("The minimum pages is: "+ Book.MINIMUMPAGES);
//        String title;
//        String author;
//        int totalnumberofpages;
//        
//        title = "C Programming";
//        author = "Eric Salvador";
//        totalnumberofpages = 1500;
//        
//        StaticBook sbk1 = new StaticBook();
//        
//        StaticBook.setTitle(title);
//        StaticBook.setAuthors(author);
//        StaticBook.setTotalpages(totalnumberofpages);
//        
//        System.out.println("The title of the book is " + StaticBook.getTitle());
//        System.out.println("The author of the book is " + StaticBook.getAuthors());
//        System.out.println("The total pages of the book is " + StaticBook.getTotalPages());
    }
}
