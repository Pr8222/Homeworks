package Class;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Package book1 = new Package();
        Package book2 = new Package();
        Package book3 = new Package();
        Package book4 = new Package();
        Package given = new Package();
        Package borrowed = new Package();
        book1.book_name = "Oliver Twist";
        book1.writer = "Charles Dickens";
        book1.book_ID = 1;
        book2.book_name = "Travel to center of Earth";
        book2.writer = "Jules Verne";
        book2.book_ID = 2;
        book3.book_name = "Treasure Island";
        book3.writer = "Robert Louis Stevenson";
        book3.book_ID = 3;
        book4.book_name = "Attack on titan ";
        book4.writer = "Hajime Isayama";
        book4.book_ID = 4;
        System.out.println("Hello!\nWelcome to our library.\nWhat can we do for you?");
        System.out.println("1.Look for available books \t 2.Borrow a book \t 3.Return the borrowed book \t 4.Sign up");
        String help;
        help = scanner.nextLine();
        int ch = Integer.parseInt(help);
        switch (ch){
            case 1:
                System.out.println("You can borrow these books : ");
                System.out.println(book1.book_name + " with ID " + book1.book_ID + " and the author is " + book1.writer);
                System.out.println(book2.book_name + " with ID " + book2.book_ID + " and the author is " + book2.writer);
                System.out.println(book3.book_name + " with ID " + book3.book_ID + " and the author is " + book3.writer);
                System.out.println(book4.book_name + " with ID " + book4.book_ID + " and the author is " + book4.writer);
                help = scanner.nextLine();
                int ID = Integer.parseInt(help);
                given.borrow(ID);
                break;
            case 2:
                System.out.println("Please enter the book ID that you have borrowed : ");
                help = scanner.nextLine();
                int theBorrowedBookID = Integer.parseInt(help);
                borrowed.borrow(theBorrowedBookID);
                break;
            case 3:
                System.out.println("Enter book ID: ");
                help = scanner.nextLine();
                int returnID = Integer.parseInt(help);
                borrowed.returning(returnID);
                break;
            case 4:
                System.out.println("Come back later");
                break;
            default:
                System.out.println("The number that you have entered is not in the list above.");
        }
    }
}
