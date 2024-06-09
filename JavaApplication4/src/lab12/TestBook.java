/*
 *
 *  @author King Bob
 *  @version 1.0
 *
 *  A Driver class used in conjucntion with the Books class.
 *  This class allows the user to update the attributes of a
 *  single "Book" object, and displays any non-default attributes.
 *
 */

import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestBook {
    public static final GregorianCalendar defaultDate = new GregorianCalendar(2000,0,1);
    // Constant to store the "default" date

    /*
     * Main method that enters an infinite while loop.
     *
     * Every iteration, the book instance will be used
     * as a parameter to the fancyPrint method.
     *
     * Afterwhich, a prompt will be displayed giving the user
     * an opportunity to modify the Book instance.
     *
     */
    public static void main (String[] args) {
        // Create a scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Book instance
        Book myBook = new Book();

        // Infinite while loop that will continually run until
        // 1. Invalid input is detected
        // 2. The user enters a '0', and the program exits normally
        while (true) {
            // Call the fancyPrint method
            fancyPrint(myBook);

            // Provide the prompts to the user
            prompt();

            try {
                // Get the user's answer
                int userinput = scan.nextInt();
                // Catch the eol
                scan.nextLine();

                switch (userinput) {
                    case 1:
                        System.out.print("Enter the title: ");
                        String title = scan.nextLine();
                        myBook.setTitle(title);
                        break;
                    case 2:
                        System.out.print("Enter the author(s): ");
                        String author = scan.nextLine();
                        myBook.setAuthor(author);
                        break;
                    case 3:
                        System.out.print("Enter the ISBN: ");
                        String isbn = scan.nextLine();
                        myBook.setISBN(isbn);
                        break;
                    case 4:
                        System.out.print("Enter the publisher: ");
                        String publisher = scan.nextLine();
                        myBook.setPublisher(publisher);
                        break;
                    case 5:
                        System.out.print("Enter the number of pages in the text: ");
                        int numPages = scan.nextInt();
                        // catch the eol
                        scan.nextLine();
                        myBook.setPages(numPages);
                        break;
                    case 6:
                        System.out.print("Enter the year: ");
                        int year = scan.nextInt();
                        // catch the eol
                        scan.nextLine();

                        System.out.print("Enter the Month(Jan = 1, Feb = 2, etc): ");
                        int month = scan.nextInt();
                        // catch the eol
                        scan.nextLine();

                        System.out.print("Enter the day of the month: ");
                        int day = scan.nextInt();
                        // catch the eol
                        scan.nextLine();

                        myBook.setReleaseDate(year, month, day);
                        break;
                    case 7:
                        System.out.print("Enter a price: ");
                        double price = scan.nextDouble();
                        // catch the eol
                        scan.nextLine();

                        myBook.setPrice(price);
                        break;
                    case 8:
                        System.out.println("Resetting");
                        myBook.reset();
                        break;
                    default:
                        System.out.println("Good-bye");
                        System.exit(1);
                }
            } catch (Exception e) {
                System.out.println("You did not enter a valid input. Exiting.");
                System.exit(1);
            }
        }
    }

    /**
     * Given a book, we want to print all of the pertinent information
     * that differs from the default Book values.
     *
     * The ordering is:
     *    - Title
     *    - Author
     *    - Pages
     *    - [This is a combination where exactly one of the following can occur]
     *      1. Publisher and release date
     *      2. Publisher
     *      3. Release Date
     *    - ISBN
     *    - Price
     *
     *  If all of the above attributes are equal to the default Book value's,
     *  then print
     *      [   Empty   ]
     *
     * @param book The book that we want to "pretty print".
     * @return A string representation of the supplied Gregorian calendar.
     */
    public static void fancyPrint(Book book) {
        System.out.println("---------------------------");
            book.empty();
           if (book.hasAuthor())
           {
               System.out.println("Author: " + book.getAuthor());
           }

           if (book.hasTitle())
           {
               System.out.println("Title: " + book.getTitle());
           }
            if (book.hasISBN())
            {
                System.out.println("ISBN: " + book.getISBN());
            }

            if(book.hasPublisher())
            {
                System.out.println("Publisher: " + book.getPublisher());

            }
            if (book.hasPages())
            {
                System.out.println("Pages: " + book.getPages());
            }
            if (book.hasPrice())
            {
                System.out.println("Price: " + book.getPrice());
            }
            if (book.hasReleaseDate())
            {
                System.out.println("Date: " +(book.getReleaseDate()));
            }
        System.out.println("---------------------------\n");

    }

    /**
     * Produces a series of instructions to "prompt" the
     * user for input.
     */
    public static void prompt() {
        System.out.println("What would you like to do?");
        System.out.println("Enter 1: To set the Title");
        System.out.println("Enter 2: To set the author");
        System.out.println("Enter 3: To set the ISBN");
        System.out.println("Enter 4: To set the Publisher");
        System.out.println("Enter 5: To set the Number of Pages");
        System.out.println("Enter 6: To set the Release Date");
        System.out.println("Enter 7: To set the Price of the text");
        System.out.println("Enter 8: To reset");
        System.out.println("Enter 0: To Quit");
        System.out.println();
    }

}

