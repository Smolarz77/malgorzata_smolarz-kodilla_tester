public class Book {

    private String author, title;
    static String book = "book.of Book";

    Book() {

    }

    Book(String author, String title) {

        this.author = author;
        this.title = title;
    }

    public static void main(String[] args) {
        System.out.println(Book.book);

    }
}