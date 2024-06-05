import java.util.GregorianCalendar;

public class Book  {
    //Variables

    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private int pages;
    private double price;
    private GregorianCalendar releaseDate;


    //Constructors
    Book(){
        title = "";
        author = "";
        isbn = "";
        publisher = "";
        pages = 0;
        releaseDate = new GregorianCalendar(200,0,1);
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
        releaseDate = new GregorianCalendar (year , month, day);
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
    public GregorianCalendar getReleaseDate() {
        return releaseDate;
    }




    //Reset
    public void reset()
    {
        title = "";
        author = "";
        isbn = "";
        publisher = "";
        pages = 0;
        releaseDate = new GregorianCalendar(200,0,1);
        price = 0;
    }


}
