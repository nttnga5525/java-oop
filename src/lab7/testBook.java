package lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class testBook {
    public static void main(String[] args) {
        ArrayList<Book> bookArrayList = new ArrayList<>();
        boolean isContinuing = true;
        while (isContinuing) {
            // Display menu
            System.out.println("=====Menu=====");
            System.out.println("1. Input book");
            System.out.println("2. Find book by ISBN");
            System.out.println("0. Exit!");
            //Input option
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose an option, please: ");
            int userInput = scanner.nextInt();
            //
            if (userInput == 0) {
                isContinuing = false;
                System.out.println("Goodbye!!");
            } else {
                if (userInput == 1) {
                    Book book = new Book();
                    System.out.print("ISBN: ");
                    book.setISBN(scanner.next());
                    System.out.print("Title: ");
                    book.setTitle(scanner.next());
                    System.out.print("Author name: ");
                    book.setAuthorName(scanner.next());
                    System.out.print("Year: ");
                    book.setYear(scanner.next());
                    bookArrayList.add(book);
                    System.out.println("This book has been added to the list.");
                } else if (userInput == 2) {
                    if (bookArrayList.size() > 0) {
                        int isContain = 0;
                        System.out.print("Please input ISBN: ");
                        String ISBN = scanner.next();
                        for (Book book : bookArrayList) {
                            if (ISBN.equals(book.getISBN())) {
                                System.out.println(book);
                                isContain++;
                            }
                        }
                        if (isContain == 0){
                            System.out.println("Book not found");
                        }
                    } else {
                        System.out.println("There are no books");
                    }

                } else {
                    System.out.println("This option is not available.");
                }
            }
        }
    }
}
