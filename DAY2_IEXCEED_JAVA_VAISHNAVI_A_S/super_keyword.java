class LibraryItem {
    String title;
    String author;

    LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Book extends LibraryItem {
    int pages;

    Book(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Pages: " + pages);
    }
}

public class super_keyword {
    public static void main(String[] args) {
        Book book1 = new Book("abc", "raj", 300);
        book1.displayInfo();
    }
}
