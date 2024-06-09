
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class BetterBook {

    //Variables
    private static final String DEFAULT_STRING = "01-Jan-2000";
    private static final int DEFAULT_YEAR = 2000;
    private static final int DEFAULT_MONTH = 0;
    private static final int DEFAULT_DAY = 1;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private int pages;
    private double price;
    private GregorianCalendar releaseDate;

    //Constructors
    Book() {
        title = "";
        author = "";
        isbn = "";
        publisher = "";
        pages = 0;
        releaseDate = new GregorianCalendar(2000, 0, 1);
        price = 0;
    }

    //Setters
    public void setISBN(String newISBN) {
        isbn = newISBN;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void setPublisher(String newPublisher) {
        publisher = newPublisher;
    }

    public void setPages(int newPages) {
        pages = newPages;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public void setReleaseDate(int year, int month, int day) {
        releaseDate = new GregorianCalendar(year, month, day);
    }

    //Getters
    public String getISBN() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public String getReleaseDate() {
        return formatCalendar(releaseDate);
    }

    //Reset
    public void reset() {
        title = "";
        author = "";
        isbn = "";
        publisher = "";
        pages = 0;
        releaseDate = new GregorianCalendar(2000, 0, 1);
        price = 0;
    }

    //Check if empty
    public boolean hasTitle() {
        if (title.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean hasAuthor() {
        if (author.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean hasISBN() {
        if (isbn.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean hasPublisher() {
        if (publisher.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean hasPages() {
        if (pages == 0) {
            return false;
        }
        return true;
    }

    public boolean hasReleaseDate() {
        if (formatCalendar(releaseDate).equals(DEFAULT_STRING)) {
            return false;
        }
        return true;
    }

    public boolean hasPrice() {
        if (price == 0) {
            return false;
        }
        return true;
    }

    public boolean empty() {
        if (hasTitle() || hasISBN() || hasAuthor() || hasPublisher() || hasPages() || hasPrice() || hasReleaseDate()) {
            return true;
        } else {
            System.out.println("    [  Empty  ]");
        }

        return false;
    }

    private static String formatCalendar(GregorianCalendar calendar) {
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
        fmt.setCalendar(calendar);
        String dateFormatted = fmt.format(calendar.getTime());
        return dateFormatted;
    }
}
