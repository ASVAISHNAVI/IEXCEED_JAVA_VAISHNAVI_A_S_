abstract class LibraryItem {
    String title;

    LibraryItem(String title) {
        this.title = title;
    }

    abstract void displayInfo();

    void checkoutMessage() {
        System.out.println("Item checked out: " + title);
    }
}

class Book extends LibraryItem {
    String author;

    Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

class DVD extends LibraryItem {
    int duration;

    DVD(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    void displayInfo() {
        System.out.println("DVD Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
    }
}

public class AbstractOverridden {
    public static void main(String[] args) {

        LibraryItem item1 = new Book("money", "James");
        LibraryItem item2 = new DVD("XYZ", 169);

        item1.displayInfo();
        item1.checkoutMessage();

        System.out.println();

        item2.displayInfo();
        item2.checkoutMessage();
    }
}
