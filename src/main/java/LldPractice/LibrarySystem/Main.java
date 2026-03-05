package LldPractice.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book("Harry1", "B1", 100 );
        Book b2 = new Book("Harry2", "B2", 100 );
        Book b3 = new Book("Harry3", "B3", 100 );
        Book b4 = new Book("Harry4", "B4", 100 );

        LibrarayManager manager = new LibrarayManager();
        List<Book> books = new ArrayList<>(List.of(
                b1,b2,b3,b4
        ));
//        manager.registerBooks(books);
        for(Book b : books){
            manager.registerBook(b);
        }

        User u1 = new User("Rahul", "U1", "721" );
        User u2 = new User("Ram", "U2", "722" );
        User u3 = new User("Sohan", "U3", "731" );
        User u4 = new User("Mohan", "U4", "711" );

        List<User> users = new ArrayList<>(List.of(
                u1,u2,u3,u4
        ));

//        manager.registerUsers(users);
        for(User u : users){
            manager.registerUser(u);
        }

        manager.issueBook(u1, b1);
        manager.issueBook(u2, b1);
//        manager.returnBook(u1,b1);
        manager.issueBook(u2,b1);
        manager.issueBook(u2,b3);
//        manager.registerUser(u2);
        manager.issueBook(u2,b2);
        manager.issueBook(u2,b2);

        manager.bookIssuedToUser(u2);

    }
}



/*

Design :

1. Entities -
a.


End to end flow or requirements -


1. Library should store books
2. Books can be added or retired from the library
2. User should be able to issue/return books from library
3. User can have monthly subscription from library and can issue n number of books at a time.
4. Return period for a book should be 14 days from issue date.
5. User can also opt for per book issue payment, instead of monthly subscription.


=> let's make it simple for now.

1. Library should store books
2. Books can be added or retired from the library
2. User should be able to issue/return books from library


End to end flow ->

User can issue books from the available ones -> User will come back and return the book.


Entities

User -
name
userId
mobileNo
getters and setters

Book -
ame
bookId
price
isAvailable
getters and setters

Relationships -

User can have book (weak relationship)
Library have many books and many users.

LibraryManager
List<Book> books;
List<User> users;
Map<Book, User> userBooks;


issueBook(Book a, User u)
returnBook(Book a, User u)























 */
