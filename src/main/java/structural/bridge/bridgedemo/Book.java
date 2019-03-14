package structural.bridge.bridgedemo;

public class Book {
    private String title;
    private String author;
    private int pages;
    private String ISBN;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
