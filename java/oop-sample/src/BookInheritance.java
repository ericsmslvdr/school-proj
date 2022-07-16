
public class BookInheritance extends Book {

    private String category;

    public BookInheritance(String newAuthor, String newTitle, int newTotalPages, String category) {
        super(newAuthor, newTitle, newTotalPages);
        setCategory(category);
    }

    public void setCategory(String category ){
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }
 
}

