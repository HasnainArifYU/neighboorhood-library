package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    static Book[] books = new Book[20];

    public static void main(String[] args) {
        books[0] = new Book(1, "", "123456789", "Harry Potter", false);
        books[1] = new Book(2, "", "987654321", "50 Shades of Grey", false);
        books[2] = new Book(3, "", "112233445", "Lord of the Rings", false);
        books[3] = new Book(4, "", "516808956", "Huckleberry Fin", false);
        books[4] = new Book(5, "", "550563623", "Game of Thrones", false);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Show Available Books");
            System.out.println("2 - Show Checked Out Books");
            System.out.println("3 - Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Available Books:");
                    for (Book book : books) {
                        if (book != null && !book.isCheckedOut()) {
                            System.out.println(book.getId() + " - " + book.getTitle() + " (ISBN: " + book.getIsbn() + ")");
                        }
                    }
                    System.out.println("Enter the ID of the book to check out or 0 to return:");
                    int bookId = scanner.nextInt();
                    if (bookId != 0) {
                        System.out.println("Enter your name:");
                        scanner.nextLine(); // Clear buffer
                        String name = scanner.nextLine();
                        for (Book book : books) {
                            if (book != null && book.getId() == bookId) {
                                book.checkOut(name);
                                System.out.println("Book checked out successfully.");
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Checked Out Books:");
                    for (Book book : books) {
                        if (book != null && book.isCheckedOut()) {
                            System.out.println(book.getId() + " - " + book.getTitle() + " checked out to " + book.getCheckedOutTo());
                        }
                    }
                    System.out.println("Enter the ID of the book to check in or 0 to return:");
                    bookId = scanner.nextInt();
                    if (bookId != 0) {
                        for (Book book : books) {
                            if (book != null && book.getId() == bookId && book.isCheckedOut()) {
                                book.checkIn();
                                System.out.println("Book checked in successfully.");
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
        scanner.close();
    }
}