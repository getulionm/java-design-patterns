package structural.bridge.bridgedemo;

import java.util.ArrayList;
import java.util.List;

public class BookPrinter extends Printer {
    private Book book;

    public BookPrinter(Book book) {
        this.book = book;
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();

        details.add(new Detail("Pages", book.getPages() + ""));
        details.add(new Detail("ISBN", book.getISBN()));

        return details;
    }

    @Override
    protected String getHeader() {
        return "'" + book.getTitle() + "' by " + book.getAuthor();
    }
}
