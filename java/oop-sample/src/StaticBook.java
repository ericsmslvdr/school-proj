public class StaticBook {
    
    private static String title;
    private static String author;
    private static int totalPages;
     
    public static void setTitle(String newTitle){
        title = newTitle;
    }
    public static void setAuthors(String newAuthor){
        author = newAuthor;
    }
    public static void setTotalpages(int newTotalPages){
        totalPages = newTotalPages;
    }
    
    public static String getAuthor(){
        return author;
    }
    public static String getTitle(){
        return title;
    }
    public static int getTotalPages(){
        return totalPages;
    }
}
