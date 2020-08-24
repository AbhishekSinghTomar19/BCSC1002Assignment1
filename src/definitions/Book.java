/*  Created by IntelliJ IDEA.
 *  User: Abhishek Singh Tomar (AbhishekSinghTomar19)
 *  Date: 24/08/20
 *  Time: 9:00 AM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String nameOfTheBook;
    private String authorOfTheBook;
    private String isbnNumberOfTheBook;

    public Book(String nameOfTheBook, String authorOfTheBook, String isbnNumberOfTheBook) {
        this.nameOfTheBook = getNameOfTheBook();
        this.authorOfTheBook = getAuthorOfTheBook();
        this.isbnNumberOfTheBook = getIsbnNumberOfTheBook();
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public String getAuthorOfTheBook() {
        return authorOfTheBook;
    }

    public void setAuthorOfTheBook(String authorOfTheBook) {
        this.authorOfTheBook = authorOfTheBook;
    }

    public String getIsbnNumberOfTheBook() {
        return isbnNumberOfTheBook;
    }

    public void setIsbnNumberOfTheBook(String isbnNumberOfTheBook) {
        this.isbnNumberOfTheBook = isbnNumberOfTheBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfTheBook='" + nameOfTheBook + '\'' +
                ", authorOfTheBook='" + authorOfTheBook + '\'' +
                ", isbnNumberOfTheBook='" + isbnNumberOfTheBook + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getNameOfTheBook(), book.getNameOfTheBook()) &&
                Objects.equals(getAuthorOfTheBook(), book.getAuthorOfTheBook()) &&
                Objects.equals(getIsbnNumberOfTheBook(), book.getIsbnNumberOfTheBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfTheBook(), getAuthorOfTheBook(), getIsbnNumberOfTheBook());
    }
}
