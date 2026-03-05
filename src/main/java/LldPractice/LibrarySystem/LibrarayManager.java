package LldPractice.LibrarySystem;

import java.util.*;

public class LibrarayManager {

    private Map<Book, Integer> books;
    private Set<User> users;
    private Map<User, Set<Book>> userBookMap = new HashMap<>();

    public LibrarayManager() {
        this.books = new HashMap<>();
        this.users = new HashSet<>();
    }

    boolean registerUser(User user) {
//        if (user == null)
//            throw new NullPointerException("User can't be null");
        Objects.requireNonNull(user, "User can't be null");
        if (!users.add(user)) {
            throw new IllegalArgumentException("User " + user.getName() + " is already registered.");
        }
        userBookMap.put(user, new HashSet<>());
        System.out.println("User " + user.getName() + " is registered successfully");
        return true;
    }

//    void registerUsers(List<User> userList) {
//        users.addAll(userList);
//        for (User user : userList) {
//            userBookMap.put(user, new ArrayList<>());
//        }
//    }

    boolean registerBook(Book book) {
        Objects.requireNonNull(book, "Book can't be null");
        int newCount = books.getOrDefault(book, 0) + 1;
        books.put(book, newCount);
        System.out.println("Book " + book.getName() + " inventory is updated successfully and totalCount is : " + newCount);
        return true;
    }

//    void registerBooks(List<Book> bookList) {
//        books.addAll(bookList);
//    }

    boolean issueBook(User user, Book book) {
//        if (user == null || book == null) {
//            throw new IllegalArgumentException("User or Book cannot be null.");
//        }
        Objects.requireNonNull(user, "User can't be null");
        Objects.requireNonNull(book, "Book can't be null");
        if (!users.contains(user)) {
            throw new IllegalArgumentException("User " + user.getName() + " is not registered yet.");
        }
        int booksAvailable = books.getOrDefault(book, 0);
        if (booksAvailable <= 0) {
            throw new IllegalArgumentException("Book " + book.getName() + " is not available.");
        }
        Set<Book> issuedBooks = userBookMap.get(user);
        if (issuedBooks.contains(book)) {
            throw new IllegalArgumentException("Book " + book.getName() + " is already issued to user " + user.getName());
        }
        issuedBooks.add(book);
        books.put(book, booksAvailable - 1);
        System.out.println("Book " + book.getName() + " is being issued to user " + user.getName());
        return true;
    }

    boolean returnBook(User user, Book book) {
        Objects.requireNonNull(user, "User can't be null");
        Objects.requireNonNull(book, "Book can't be null");
        if (!users.contains(user)) {
            throw new IllegalArgumentException("User is not registered");
        }
        Set<Book> issuedBooks = userBookMap.get(user);
        if (!issuedBooks.remove(book)) {
            throw new IllegalArgumentException("Book " + book.getName() + " was not issued to user : " + user.getName());
        }
        books.put(book, books.getOrDefault(book, 0) + 1);
        System.out.println("Book " + book.getName() + " is retuned by User " + user.getName());
        return true;
    }

    Set<Book> bookIssuedToUser(User user) {
        Objects.requireNonNull(user, "User can't be null");
        if (!users.contains(user)) {
            throw new IllegalArgumentException("User is not registered");
        }
//        Set<Book> issueBooksToUser = userBookMap.get(user);
//        if(issueBooksToUser.isEmpty()){
//            System.out.println("No books have been issued to user : " + user.getName());
//        }
        return Collections.unmodifiableSet(userBookMap.get(user));

//        for (Book b : issueBooksToUser) {
//            System.out.println("issued books are to user : " + user.getName() + " are : " + b.getName());
//        }
    }
}
