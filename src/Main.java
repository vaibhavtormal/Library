import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static class Library {
        String[] books;
        int num_of_books;

        Library() {
            this.books = new String[100];
            this.num_of_books = 0;
        }

        void addBook(String book) {
            this.books[num_of_books] = book;
            num_of_books++;
            System.out.println(book + " has been added..!");
        }

        void showAvailableBooks() {
            System.out.println("Available Books are :");
            for (String book : this.books) {
                if (book == null) {
                    continue;
                }
                System.out.println("*" + book);
            }
        }

        void issueBook(String book) {
            for (int i = 0; i < this.books.length; i++) {
                if (this.books[i].equals(book)) {
                    System.out.format("The %s has been issued..!", book);
                    this.books[i] = null;
                    return;
                }
                System.out.println(" *" + book);
            }
            System.out.println("This book does not exits..! Sorry");
        }
        void returnBook(String book){
            addBook(book);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("java");
        library.addBook("c");
        library.addBook("android studio");
        System.out.println();
        library.showAvailableBooks();
        library.issueBook("android studio");
        library.showAvailableBooks();
        library.returnBook("java");
        library.showAvailableBooks();
        library.returnBook("android studio");
        library.showAvailableBooks();
    }
}