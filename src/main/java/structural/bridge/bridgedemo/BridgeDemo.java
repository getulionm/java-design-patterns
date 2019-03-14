package structural.bridge.bridgedemo;

public class BridgeDemo {

    public static void main(String[] args) {
//        Movie movie = new Movie();
//        movie.setClassification("Action");
//        movie.setTitle("John Wick");
//        movie.setRuntime("2:15");
//        movie.setYear("2014");
//
//        Formatter printFormatter = new PrintFormatter();
//
//        Printer moviePrinter = new MoviePrinter(movie);
//
//        String printedMaterial = moviePrinter.print(printFormatter);
//
//        System.out.println(printedMaterial);
//
//
//        Formatter htmlFormatter = new HtmlFormatter();
//
//        // Using the same moviePrinter instance, with a different formatter
//        String htmlMaterial = moviePrinter.print(htmlFormatter);
//
//        System.out.println(htmlMaterial);

        Book book = new Book();
        book.setTitle("Mastery");
        book.setAuthor("Robert Greene");
        book.setPages(352);
        book.setISBN("9781781250914");

        Formatter printFormatter = new PrintFormatter();
        Printer bookPrinter = new BookPrinter(book);
        String printedBook = bookPrinter.print(printFormatter);
        System.out.println(printedBook);
    }
}
