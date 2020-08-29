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
        this.nameOfTheBook = nameOfTheBook;
        this.authorOfTheBook = authorOfTheBook;
        this.isbnNumberOfTheBook = isbnNumberOfTheBook;
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
        return " About the book ---> " + "\n" +
                "Name Of The Book : '" + nameOfTheBook + '\'' + "\n" +
                "Author Of The Book : '" + authorOfTheBook + '\'' + "\n" +
                "ISBN Number Of The Book : '" + isbnNumberOfTheBook + '\'';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(getNameOfTheBook(), book.getNameOfTheBook()) &&
                Objects.equals(getAuthorOfTheBook(), book.getAuthorOfTheBook()) &&
                Objects.equals(getIsbnNumberOfTheBook(), book.getIsbnNumberOfTheBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfTheBook(), getAuthorOfTheBook(), getIsbnNumberOfTheBook());
    }
}
