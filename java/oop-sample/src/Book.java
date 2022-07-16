
public class Book {

    //instance variables
    private String title;
    private String author;
    private int totalPages;

    //class variables or static
    public static int MAXIMUM_PAGES = 400;

    //final variables or constant variables
    final static int MINIMUMPAGES = 100;

    //methods
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void setTotalPages(int newTotalPages) {
        totalPages = newTotalPages;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public int getMaximumPages() {
        return this.MAXIMUM_PAGES;
    }

    //constructor or special methods
    public Book() {
        author = "Empty";
        title = "Unassigned";
        totalPages = 0;
    }

    public Book(String newAuthor, String newTitle, int newTotalPages) {
        author = newAuthor;
        title = newTitle;
        totalPages = newTotalPages;
    }

}
