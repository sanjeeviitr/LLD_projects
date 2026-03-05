package LldPractice.LibrarySystem;

import java.util.Objects;

public class Book {

    private String name;
    private final String bookId;
    private int price;
    public Book(String name, String bookId, int price) {
        this.name = name;
        this.bookId = bookId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookId() {
        return bookId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode(){
        return bookId.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof Book)) return false;
        Book book = (Book) o;
//        return bookId.equals(((Book) o).bookId);
        return Objects.equals(this.bookId, ((Book) o).bookId);
    }
}
