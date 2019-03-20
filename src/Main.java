import com.groupqa1.Books;

public class Main {
    public static void main(String[] args) {

        Books books = new Books(6);

        books.addBook(1, 1998, 6.5, 350, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Scolatic");
        books.addBook(2, 2000, 12.2, 432, "One Hundred Years of Solitude", "Gabriel Garcia Marquez", "Penguin Books Ltd");
        books.addBook(3, 2000, 14.99, 160, "Breakfast at Tiffany's", "Truman Capote", "Penguin Books Ltd");
        books.addBook(4, 2011, 5, 304, "The Picture of Dorian Gray", "Oscar Wilde", "Penguin Books Ltd");
        books.addBook(5, 2009, 9, 528, "Resurrection", "Leo Tolstoy", "Oxford University Press");
        books.addBook(6, 2016, 10, 350, "Harry Potter and the Cursed Child", "J.K. Rowling", "LITTLE BROWN");

        System.out.println("\nAll books:");
        books.printBooks();

        books.changePrice(-20);
        System.out.println("\nAfter change price:");
        books.printBooks();

        System.out.println("\nSearch by author:");
        books.searchByAuthor("J.K. Rowling");

        System.out.println("\nFilter by year:");
        books.searchByYear(2000);

    }
}
