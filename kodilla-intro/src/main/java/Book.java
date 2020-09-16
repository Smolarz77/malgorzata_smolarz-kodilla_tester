public class Book {

    private String author, title;
    static String book = "Isaac Asimov, The Galaxy";

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