package leetcode;

import java.util.HashMap;
import java.util.Map;

//public class LibraryManagementComplexProgram
//{

    class Book {
        int id;
        String title;
        String author;
        boolean isBorrowed;

        public Book(int id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.isBorrowed = false; // Initially available
        }

        public void borrowBook() {
            if (!isBorrowed) {
                isBorrowed = true;
                System.out.println("Book borrowed: " + title);
            } else {
                System.out.println("Book already borrowed: " + title);
            }
        }

        public void returnBook() {
            if (isBorrowed) {
                isBorrowed = false;
                System.out.println("Book returned: " + title);
            } else {
                System.out.println("Book was not borrowed: " + title);
            }
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Title: " + title + ", Author: " + author + ", Available: " + !isBorrowed;
        }
    }

    class Library {
        Map<Integer, Book> books = new HashMap<>();

        public void addBook(int id, String title, String author) {
            books.put(id, new Book(id, title, author));
            System.out.println("Book added: " + title);
        }

        public void borrowBook(int id) {
            if (books.containsKey(id)) {
                books.get(id).borrowBook();
            } else {
                System.out.println("Book ID not found.");
            }
        }

        public void returnBook(int id) {
            if (books.containsKey(id)) {
                books.get(id).returnBook();
            } else {
                System.out.println("Book ID not found.");
            }
        }

        public void searchBook(String keyword) {
            boolean found = false;
            for (Book book : books.values()) {
                if (book.title.toLowerCase().contains(keyword.toLowerCase()) ||
                        book.author.toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println(book);
                    found = true;
                }
            }
            if (!found) System.out.println("No book found with keyword: " + keyword);
        }
    }

    public class LibraryManagementComplexProgram {
        public static void main(String[] args) {
            Library library = new Library();

            library.addBook(1, "The Alchemist", "Paulo Coelho");
            library.addBook(2, "1984", "George Orwell");
            library.addBook(3, "Clean Code", "Robert C. Martin");

            System.out.println("\nSearching for 'Clean':");
            library.searchBook("Clean");

            System.out.println("\nBorrowing Book with ID 2:");
            library.borrowBook(2);

            System.out.println("\nReturning Book with ID 2:");
            library.returnBook(2);

            System.out.println("\nTrying to return Book ID 2 again:");
            library.returnBook(2);
        }
    }


