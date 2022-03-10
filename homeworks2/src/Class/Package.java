package Class;

public class Package {
    public String book_name;
    public String writer;
    public int book_ID;

    public void borrow(int book_ID) {
        System.out.println("You have borrowed the book with ID " + book_ID + " and you have 1 month to return it.");
    }
    public void returning( int book_ID ){
        System.out.println("The book with number ID " + book_ID + " has been returned.");
    }
}
