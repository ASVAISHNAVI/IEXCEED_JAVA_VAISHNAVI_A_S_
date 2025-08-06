class Library {
    String name;
    Book book; 

    Library(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    void showLibraryDetails() {
        System.out.println("Library Name: " + name);
        book.display(); 
    }
}
public class has_a_relationship_agg {
    public static void main(String[] args) {
        Book book = new Book("XYZ", "ria");
        Library library = new Library("Hello", book);
        library.showLibraryDetails();
    }
}
