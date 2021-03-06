package ua.com.juja.jujarobot;

public class Book extends Issue {

    private String authorBook;

    public Book(String name, int countPages, String testAuthorBook) {
        super(name, countPages);
        authorBook = testAuthorBook;
    }

    @Override
    public String toPrint() {
        return "Book{" + super.toPrint() + ",author=" + authorBook + "}";
    }
}
